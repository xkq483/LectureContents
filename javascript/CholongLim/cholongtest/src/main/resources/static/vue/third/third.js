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
        randomMoney: 0,
        shopView: false,
        shopList: [],
        shopListValue: [],
        characterStatus: {
            level: 1,
            hp: 70,
            mp: 30,
            atk: 10,
            str: 10,
            intelligence: 10,
            dex: 10,
            vit: 10,
            def: 10,
            men: 0,
            money: 0,
            // 전체 필요 경험치량
            totalLevelBar: 50,
            // 현재 누적한 경험치량
            currentLevelBar: 0
        },
        monsterName: '',
        monsters: [
            { id: 1, name: '슬라임', hp: 30, exp: 3 },
            { id: 2, name: '고블린', hp: 50, exp: 5 },
            { id: 3, name: '카오스 드래곤', hp: 9999, exp: 900 }
        ],
        monsterBook: [
               { id: 1, name: '이상해씨', hp:300, exp: 50, money: 300},
               { id: 2, name: '디그다', hp:50, exp: 10, money: 500},
               { id: 3, name: '리자몽', hp:2000, exp: 500, money: 2000},
               { id: 4, name: '꼬부기', hp:300, exp: 50, money: 300},
               { id: 5, name: '망나뇽', hp:4000, exp: 1000, money: 4000},
               { id: 6, name: '꼬렛', hp:200, exp: 50, money: 200},
               { id: 7, name: '피카츄', hp:600, exp: 100, money: 600},
               { id: 8, name: '뮤츠', hp:99999, exp: 10000, money: 100000},
               { id: 9, name: '야돈', hp:250, exp: 40, money: 300},
               { id: 10, name: '라티오스', hp:100000, exp: 10000, money: 150000},
               { id: 11, name: '고라파덕', hp:100, exp: 20, money: 100},
               { id: 12, name: '아보크', hp:300, exp: 50, money: 300},
               { id: 13, name: '푸린', hp:350, exp: 60, money: 300},
               { id: 14, name: '윤겔라', hp:500, exp: 90, money: 500},
               { id: 15, name: '팬텀', hp:700, exp: 200, money: 700}
        ],
        itemBook: [
            { name: 'HP 포션 I', price: 50, effect: { desc: 'hp 회복', amount: 200 }},
            { name: 'HP 포션 II', price: 200, effect: { desc: 'hp 회복', amount: 700 }},
            { name: 'HP 포션 III', price: 1000, effect: { desc: 'hp 회복', amount: 2000 }},
            { name: 'HP 포션 IV', price: 6000, effect: { desc: 'hp 회복', amount: 6000 }},
            { name: 'HP 포션 V', price: 42000, effect: { desc: 'hp 회복', amount: 15000 }},
            { name: '검', price: 100000, effect: {desc: '무기', atk: 100}},
            { name: '강철검', price: 5000000, effect: {desc: '무기', atk: 200}},
            { name: '흑검', price: 2500000, effect:  {desc: '무기', atk: 350}},
            { name: '광선검', price: 12500000, effect: {desc: '무기', atk: 500}},
            { name: '마법검', price: 100000000, effect: {desc: '무기', atk: 1000}}
        ]
    },
    methods: {
        shuffleShopList () {
            if (!this.shopView) {
                this.shopListValue = []
            }

            for (var i = 0; i < 10; i++) {
                var randIdx = Math.floor(Math.random() * this.itemBook.length)
                this.shopList[i] = this.itemBook[randIdx]
            }
        },
        buyItem:function (index) {
            this.shopList.splice(index, 1);
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
           addManyMonster () {
               // 100마리씩 추가
               for (var i = 0; i < 100; i++) {
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
           randomGeneration () {
               this.randomNumber = Math.floor(Math.random() * 10) + 1;
           },
           myDarknessDragon () {
               for (var i = 0; i < this.monsters.length; i++) {
                   this.monsters[i].hp =
                       parseInt(this.monsters[i].hp - this.characterStatus.atk * 3.5)
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

           var i
           for (i = 0; i < this.monsters.length; i++) {
               if (this.monsters[i].hp <= 0) {
                   // 몬스터 제거 이전에 무엇을 해야할까요 ? 경험치 획득
                   for (var j = 0; j < this.monsterBook.length; j++) {
                       if (this.monsters[i].name === this.monsterBook[j].name) {
                           this.characterStatus.currentLevelBar += this.monsterBook[j].exp
                           this.characterStatus.money += this.monsterBook[j].money
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
               this.characterStatus.level += 1
               this.characterStatus.hp *= 1.2
               this.characterStatus.atk += 3
               this.characterStatus.def += 1

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