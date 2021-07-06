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
        firstFomerView: false,
        shopView: false,
        inventoryView: false,
        myInventory: [],
        myInventoryValue:[],
        shopList: [],
        shopListValue: [],
        characterStatus: {
            level: 30,
            selectJob:'모험가',
            hp: 70,
            mp: 30,
            itemAtk: 0,
            defaultAtk: 10,
            atk: 10,
            str: 10,
            intelligence: 10,
            dex: 10,
            vit: 10,
            def: 10,
            men: 0,
            money: 0,
            // 전체 필요 경험치량
            totalLevelBar: 10,
            // 현재 누적한 경험치량
            currentLevelBar: 0
        },
        monsterName: '',
        monsters: [
            { id: 1, name: '슬라임', hp: 30, exp:1, drop: 10},
            { id: 2, name: '고블린', hp: 50, exp:2, drop: 20},
            { id: 3, name: '카오스 드래곤', hp: 99999999, exp: 99999999, drop: 10000000}
        ],
        monsterBook: [
            { name: '슬라임', hp: 30, exp: 1, drop: 10},
            { name: '고블린', hp: 50, exp: 2, drop:20},
            { name: '레드 슬라임', hp: 70, exp: 4, drop: 40},
            { name: '홉 고블린', hp: 120, exp: 8, drop: 80},
            { name: '그린 슬라임', hp: 150, exp: 12, drop: 160},
            { name: '스켈레톤', hp: 200, exp: 20, drop: 320},
            { name: '고블린 마법사', hp: 250, exp: 25, drop: 640},
            { name: '블루 슬라임', hp: 300, exp: 35, drop: 1280},
            { name: '트롤', hp: 500, exp: 50, drop: 2000},
            { name: '원혼', hp: 700, exp: 60, drop: 4000},
            { name: '무야호', hp: 800, exp: 70, drop: 5000},
            { name: '스켈레톤 기사', hp: 1000, exp: 80, drop: 10000},
            { name: '오우거', hp: 1200, exp: 90, drop: 12000},
            { name: '오우거 메이지', hp: 1500, exp: 100, drop: 15000},
            { name: '스켈레톤 근위병', hp: 2000, exp: 120, drop: 20000},
            { name: '고블린 대사장', hp: 2500, exp: 150, drop: 25000},
            { name: '귀인', hp: 2800, exp: 180, drop: 28000},
            { name: '킹 슬라임', hp: 3000, exp: 200, drop: 30000},
            { name: '고스트', hp: 3200, exp: 250, drop: 32000},
            { name: '고블린 족장', hp: 3000, exp: 200, drop: 30000},
            { name: '대왕고블린', hp: 3500, exp: 250, drop: 33000},
            { name: '흡혈귀', hp: 3800, exp: 280, drop: 35000},
            { name: '머쉬맘', hp: 4000, exp: 300, drop: 36000},
            { name: '자쿰', hp: 4300, exp: 330, drop: 38000},
            { name: '노멀 자쿰', hp: 4700, exp: 400, drop: 44000},
            { name: '하드 자쿰', hp: 5300, exp: 450, drop: 50000},
            { name: '오니', hp: 5600, exp: 480, drop: 53000},
            { name: '피아누스', hp: 5900, exp: 520, drop: 56000},
            { name: '리셀스퀴드', hp: 6500, exp: 600, drop: 60000},
            { name: '콜드샤크', hp: 6800, exp: 630, drop: 63000},
            { name: '페페', hp: 7000, exp: 650, drop: 65000},
            { name: '푸퍼', hp: 7400, exp: 700, drop: 68000},
            { name: '씨코', hp: 8000, exp: 800, drop: 75000},
            { name: '주니어 씰', hp: 8500, exp: 850, drop: 85000},
            { name: '크라피', hp: 9000, exp: 900, drop: 90000},
            { name: '리치', hp: 9000, exp: 500, drop: 90000},
            { name: '리치 킹', hp: 90000, exp: 2500, drop: 900000},
            { name: '카오스 드래곤', hp: 99999999, exp: 1000000, drop:100000000},
            { name: '리무루 템페스트', hp: 999999999999999, exp: 999999999, drop: 9999999999}
        ],
        itemBook:[
            { name: 'HP포션 I', price: 50, effect: { desc: 'hp 회복', amount: 200 }},
            { name: 'HP포션 II', price: 200, effect: { desc: 'hp 회복', amount: 700 }},
            { name: 'HP포션 III', price: 1000, effect: { desc: 'hp 회복', amount: 2000 }},
            { name: 'HP포션 IV', price: 6000, effect: { desc: 'hp 회복', amount: 6000 }},
            { name: 'HP포션 V', price: 42000, effect: { desc: 'hp 회복', amount: 15000 }},
            { name: '검', price: 10000000, effect: { desc: '무기', atk: 100 }},
            { name: '강철검', price: 50000000, effect: { desc: '무기', atk: 200 }},
            { name: '환두대도', price: 250000000, effect: { desc: '무기', atk: 300 }},
            { name: '발라리아 강철검', price: 500000000, effect: { desc: '무기', atk: 500 }},
            { name: '칠지도', price: 10000000000, effect: { desc: '무기', atk: 1000 }}   
        ]
    },
    methods: {
        shuffleShopList(){
          if(!this.shopView)  {
              this.shopListValue = []
          }

          for(var i = 0; i < 10; i++){
              var randIdx = Math.floor(Math.random() * this.itemBook.length)
              this.shopList[i] = this.itemBook[randIdx]
          }
        },
        calcBuy: function() {
            var tmpSum = 0

            console.log('calcBuy(): ' + this.shopListValue.length)
            console.log('shoplist length: ' + this.shopList.length)

            for(var i = 0; i < this.shopListValue.length; i++){
                console.log('외각루프 - 선택된 값: ' + this.shopListValue[i])

                for(var j = 0; j < this.shopList.length; j++){
                    console.log('내부 루프')

                    if(this.shopListValue[i] == j){
                        console.log('매칭 성공!')
                        tmpSum += this.shopList[j].price
                        break
                    }
                }
            }

            if(this.characterStatus.money - tmpSum >= 0){
                this.characterStatus.money -= tmpSum
                alert('구매가 완료되었습니다!!')
                // 사용자 인벤토리 구현시 필요한 로직 작성 
                for(var i = 0; i < this.shopListValue.length; i++){
                    this.myInventory.push({
                        name: this.shopList[this.shopListValue[i]].name,
                        effect: this.shopList[this.shopListValue[i]].effect
                    })
                }
            }else{
                alert('돈이 부족합니다 더버세욤!!')
            }
            
        },
        equipItem () {
            var tmpSum = 0

            console.log('equipItem(): ' + this.myInventoryValue.length)
            console.log('myInventory length: ' + this.myInventory.length)

            for(var i = 0; i < this.myInventoryValue.length; i++){
                console.log('외각루프 - 선택된 값: ' + this.myInventoryValue[i])

                for(var j = 0; j < this.myInventory.length; j++){
                    console.log('내부 루프')

                    if(this.myInventoryValue[i] == j){
                        console.log('매칭 성공!')

                        tmpSum += this.myInventory[j].effect.atk
                        break
                    }
                } 
            }

            this.characterStatus.itemAtk = tmpSum
            this.characterStatus.atk = this.characterStatus.defaultAtk + tmpSum
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

            var randNum = Math.floor(Math.random() * this.monsterBook.length);

            this.monsters.push({
                id: max + 1,
                name: this.monsterBook[randNum].name,
                hp: this.monsterBook[randNum].hp
            })
        },
        addManyMonster(){
          // 100마리씩 추가
          for(var i = 0; i < 100; i++) {
            var max = this.monsters.reduce( function (a, b) {
                return a > b.id ? a : b.id
            }, 0)

            var monBookLen = this.monsterBook.length
            var idx = Math.floor(Math.random() * monBookLen)
            
            this.monsters.push({
                id: max + 1,
                name: this.monsterBook[idx].name,
                hp: this.monsterBook[idx].hp
            })
            
          } 
        },
        removeMonster: function (index) {
            this.monsters.splice(index, 1);
        
        },
        userAttack: function (index) {
            this.monsters[index].hp -= this.characterStatus.atk
        },
        spiritChaosDevilBlade(index) {
            this.monsters[index].hp -= this.characterStatus.atk * 20 +
             this.characterStatus.str * 8 + this.characterStatus.dex * 8 +
             this.characterStatus.intelligence * 8

        },
        randomGeneration () {
            this.randomNumber = Math.floor(Math.random() * 10) + 1;
        },
        myDarknessDragon(){
            for(var i = 0; i < this.monsters.length; i++){
                this.monsters[i].hp =
                 parseInt(this.monsters[i].hp - 
                    this.characterStatus.atk * 3.5)

            }
        }
    },
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

    if((this.characterStatus.level >= 50) && (this.characterStatus.selectJob === '모험가')){
        this.firstFomerView = true
    }else{
        this.firstFomerView = false
    }


    // 전사계열로 전직했을때 렙업 스텟 비율 조정
    if((this.characterStatus.selectJob === 'madWarrior') || 
    (this.characterStatus.selectJob === 'warrior') || 
    (this.characterStatus.selectJob === 'boxer') || 
    (this.characterStatus.selectJob === 'knight')||
     (this.characterStatus.selectJob === 'darkKnight') ||
     (this.characterStatus.selectJob === 'holyKnight') ){

        // 스텟 비율 조정
        var criteria = this.characterStatus.currentLevelBar

        for (; this.characterStatus.currentLevelBar >= this.characterStatus.totalLevelBar; ) {
            this.characterStatus.currentLevelBar =
                parseInt(this.characterStatus.currentLevelBar - 
                    this.characterStatus.totalLevelBar)
            this.characterStatus.level += 1
            this.characterStatus.hp *= 1.5
            this.characterStatus.defaultAtk += 6
            this.characterStatus.atk += 6
            this.characterStatus.def += 2
            this.characterStatus.str *= 2.1
            this.characterStatus.intelligence *= 1.1
            this.characterStatus.dex *= 1.2
            this.characterStatus.vit *= 1.1
            this.characterStatus.men *= 1.1
         }

    // 마법사 계열로 전직했을시
    }else if((this.characterStatus.selectJob === 'magician') ||
    (this.characterStatus.selectJob === 'priest')){
        
        // 스텟 비율 조정
        var criteria = this.characterStatus.currentLevelBar

        for (; this.characterStatus.currentLevelBar >= this.characterStatus.totalLevelBar; ) {
            this.characterStatus.currentLevelBar =
                parseInt(this.characterStatus.currentLevelBar - 
                    this.characterStatus.totalLevelBar)
            this.characterStatus.level += 1
            this.characterStatus.hp *= 1.5
            this.characterStatus.defaultAtk += 5
            this.characterStatus.atk += 5
            this.characterStatus.def += 1
            this.characterStatus.str *= 1.1
            this.characterStatus.intelligence *= 2.1
            this.characterStatus.dex *= 1.2
            this.characterStatus.vit *= 1.1
            this.characterStatus.men *= 2.1
        }

        // 궁수 계열로 전직했을시
    }else if((this.characterStatus.selectJob === 'thief') || 
    (this.characterStatus.selectJob === 'archer') || 
    (this.characterStatus.selectJob === 'gunner')){

        // 스텟 비율 조정
        var criteria = this.characterStatus.currentLevelBar

        for (; this.characterStatus.currentLevelBar >= this.characterStatus.totalLevelBar; ) {
            this.characterStatus.currentLevelBar =
                parseInt(this.characterStatus.currentLevelBar - 
                    this.characterStatus.totalLevelBar)
            this.characterStatus.level += 1
            this.characterStatus.hp *= 1.5
            this.characterStatus.defaultAtk += 6
            this.characterStatus.atk += 6
            this.characterStatus.def += 2
            this.characterStatus.str *= 1.1
            this.characterStatus.intelligence *= 1.1
            this.characterStatus.dex *= 2.2
            this.characterStatus.vit *= 2.1
            this.characterStatus.men *= 1.1
        }
    }


        var i
        for (i = 0; i < this.monsters.length; i++) {
            if (this.monsters[i].hp <= 0) {
                // 몬스터 제거 이전에 무엇을 해야할까요 ? 경험치 획득, 머니 획득
                for (var j = 0; j < this.monsterBook.length; j++) {
                    if (this.monsters[i].name === this.monsterBook[j].name) {
                        this.characterStatus.currentLevelBar += this.monsterBook[j].exp
                        this.characterStatus.money += this.monsterBook[j].drop
                    }
                }
                this.monsters.splice(i, 1)
            }
        }


        var criteria = this.characterStatus.currentLevelBar
    
        for (; this.characterStatus.currentLevelBar >= this.characterStatus.totalLevelBar; ) {
            this.characterStatus.currentLevelBar =
                parseInt(this.characterStatus.currentLevelBar - 
                    this.characterStatus.totalLevelBar)
                 if(this.characterStatus.selectJob === '모험가'){
            this.characterStatus.level += 1
            this.characterStatus.hp *= 1.2
            this.characterStatus.defaultAtk += 3
            this.characterStatus.atk += 3
            this.characterStatus.def += 1
            this.characterStatus.str *= 1.1
            this.characterStatus.intelligence *= 1.1
            this.characterStatus.dex *= 1.1
            this.characterStatus.vit *= 1.1
            this.characterStatus.men *= 1.1
        }
                
            // 레벨링 시스템 구축
            if (this.characterStatus.level < 10) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.1)
            } else if (this.characterStatus.level < 20) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.2)
            } else if (this.characterStatus.level < 30) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.3)
            } else if (this.characterStatus.level < 40) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.4)
            } else if (this.characterStatus.level < 50) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.5)
            } else if (this.characterStatus.level < 80) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.7)
            } else if (this.characterStatus.level < 100) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 2)
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