var app = new Vue ({
    el: '#app',
    data: {
        message: '우왕 뷰 짱',
        initMsg: '양방향 연결이 뭔지 함 볼까 ?',
        list: ['사과', '바나나', '딸기', '수박', '참외', '포도', '망고', '블루베리', '체리'],
        show: true,
        num: 3,
        count: 0,
        radius: 50,
        randomNumber: 0,
        shopView:false,
        shopList:[],
        shopListValue:[],

        characterStatus:
            {
                level: 1,
                hp: 50,
                mp: 50,
                atk: 100000,
                def: 10,
                int: 5,
                dex: 5,
                //전체 필요 경험치량
                totalLevelBar:10,
                //현재 누적한 경험치량
                currentLevelBar: 0,
                money:0

            },

        monsterName: '',
        monsters: [
            { id: 1, name: '슬라임', hp: 30, exp:5,money:10 },

        ],
        monsterBook:[

                    { id: 1, name: '슬라임', hp: 30, exp:5 ,money:10},
                    { id: 2, name: '고블린', hp: 50, exp:8 ,money:10},
                    { id: 3, name: '투명 드래곤', hp: 99999999, exp:90000 ,money:10},
                    { id: 4, name: '크림슨 드래곤', hp: 49, exp: 10 ,money:10},
                    { id: 5, name: '카오스 드래곤', hp: 32, exp:60 ,money:10},
                    { id: 6, name: '화이트드래곤', hp: 19, exp: 30 ,money:10},
                    { id: 7, name: '레드 드래곤', hp: 21, exp:25 ,money:10},
                    { id: 8, name: '오렌지 드래곤', hp: 11, exp:50 ,money:10},
                    { id: 9, name: '블랙 드래곤', hp: 13, exp:10 ,money:10},
                    { id:10, name: '퍼플 드래곤', hp: 58, exp:10 ,money:10}

        ],
        itemBook:[
            {name: 'HP포션 I', price:50, effect:{desc:'hp회복', amount:10 }},
            {name: 'HP포션 2', price:60, effect:{desc:'hp회복', amount:30 }},
            {name: 'HP포션 3', price:70, effect:{desc:'hp회복', amount:40 }},
            {name: 'HP포션 4', price:80, effect:{desc:'hp회복', amount:50 }},
        ]

    },

    methods: {
        shuffleShopList(){
            if(!this.shopView){
                this.shopListValue=[]
            }

            for(var i = 0; i< 10; i++){
                var randIdx = Math.floor(Math.random() * this.itemBook.length)
                this.shopList[i] = this.itemBook[randIdx]
            }
        },

        buttonClickTest: function (event) {
            alert('뷰 짱')
        },

        increment: function () {
            this.count += 1
        },

        addMonster: function () {

            var max = this.monsters.reduce( function (a, b) {
                return a > b.id ? a : b.id
            }, 0)

            var randNum = Math.floor(Math.random()*this.monsterBook.length);

            this.monsters.push({
                id: max + 1,
                name: this.monsterBook[randNum].name,
                hp: this.monsterBook[randNum].hp,
                exp: this.monsterBook[randNum].exp,
                money: this.monsterBook[randNum].money
            })
        },
        addManyMonster(){

            for(var i =0; i<100; i++){
                var max = this.monsters.reduce(function(a,b) {
                    return a>b.id ? a:b.id

                },0)

                var monBookLen = this.monsterBook.length
                var idx = Math.floor(Math.random()*monBookLen)

                this.monsters.push({
                    id:max+1,
                    name: this.monsterBook[idx].name,
                    hp: this.monsterBook[idx].hp

                })
            }
        },

        removeMonster: function (index) {
            // 찾은 인덱스 값에서 1개를 지워라
            // 즉 인덱스 값의 정보를 지워라!
            this.monsters.splice(index, 1);
        },

        userAttack: function(index){
            this.monsters[index].hp -= this.characterStatus.atk
        },
        randomGeneration:function(){
            this.randomNumber = Math.floor(Math.random() *10) + 1;

        },

        wideSkill (){
            for(var i =0; i<this.monsters.length;i ++){
                this.monsters[i].hp = parseInt(this.monsters[i].hp - this.characterStatus.atk* 3.5)
            }
        }


    },
    //메소드영역끝

    beforeCreate() {
        console.log('Vue 객체를 만들기 이전입니다.')
    },
    created() {
        console.log('Vue 객체를 만들었습니다.')
    },
    beforeMount() {
        console.log('HTML 요소를 붙이기 전입니다.')
    },
    mounted() {
        console.log('HTML 요소를 붙입니다.')
    },
    beforeUpdate() {
        console.log('VDOM의 변화를 감지합니다.')

        var i
        for (i = 0; i < this.monsters.length; i++) {
            if (this.monsters[i].hp <= 0) {

                for(var j = 0; j< this.monsterBook.length;j++){
                    if(this.monsters[i].name === this.monsterBook[j].name){
                        this.characterStatus.currentLevelBar += this.monsterBook[j].exp
                        this.characterStatus.money += this.monsterBook[j].money
                    }
                }
                this.monsters.splice(i, 1)
            }
        }


        var criteria = this.characterStatus.currentLevelBar

        for(; this.characterStatus.currentLevelBar >= this.characterStatus.totalLevelBar; ){

            this.characterStatus.currentLevelBar =
                parseInt(this.characterStatus.currentLevelBar - this.characterStatus.totalLevelBar)

            this.characterStatus.level += 1
            this.characterStatus.hp *=1.2
            this.characterStatus.mp += 50
            this.characterStatus.atk*= 1.2
            this.characterStatus.def+= 3
            this.characterStatus.int += 2
            this.characterStatus.dex += 2

            if(this.characterStatus.level < 10){
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.1)
            }else if(this.characterStatus.level < 20){
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.2)

            }else if(this.characterStatus.level < 30){
                 this.characterStatus.totalLevelBar =
                     parseInt(this.characterStatus.totalLevelBar * 1.3)

            }
        }
    },
    updated() {
        console.log('VDOM의 변화를 적용합니다.')
    },
    beforeDestroy() {
        console.log('Vue 객체를 파괴하기 이전입니다.')
    },
    destroyed() {
        console.log('Vue 객체를 파괴하였습니다.')
    }


})
