var app = new Vue ({
    el: '#app',
    data: {
        randNum: 0,
        count: 0,
        shopView: false,
        shopList: [],
        shopListValue: [],
        myStatus: {
            level: 1,
            hp: 70,
            mp: 30,
            atk: 50,
            str: 10,
            intelligence: 10,
            dex: 10,
            vit: 10,
            def: 10,
            men: 0,
            // 전체 필요 경험치량
            needExp: 20,
            // 현재 누적한 경험치량
            currentExp: 0,
            myMoney: 0
        },
        monsterGuide: [
            { name: '리자드', type: ' 불꽃 ', hp: 1653, exp: 17, money: 2500 },
            { name: '꼬부기', type: '  물  ', hp: 946, exp: 9, money: 900 },
            { name: '피카츄', type: ' 전기 ', hp: 938, exp: 9, money: 900 },
            { name: '푸크린', type: '페어리', hp: 1926, exp: 20, money: 2000 },
            { name: '데구리', type: ' 바위 ', hp: 1897, exp: 22, money: 2500 },
            { name: '아라리', type: '  풀  ', hp: 1175, exp: 10, money: 1500 },
            { name: '루주라', type: ' 얼음 ', hp: 2555, exp: 28, money: 3000 },
            { name: '디그다', type: '  땅  ', hp: 676, exp: 7, money: 800 },
            { name: '메타몽', type: ' 노말 ', hp: 832, exp: 10, money: 1000 },
            { name: '망나뇽', type: '드래곤', hp: 3792, exp: 50, money: 5000 },
            { name: '포니타', type: ' 불꽃 ', hp: 1697, exp: 20, money: 3000 },
            { name: '고오스', type: '고스트', hp: 1229, exp: 15, money: 2000 },
            { name: '킹크랩', type: '  물  ', hp: 2829, exp: 30, money: 3500 },
            { name: '샤미드', type: '  물  ', hp: 3114, exp: 35, money: 4000 },
            { name: '암스타', type: ' 바위 ', hp: 2786, exp: 30, money: 3000 },
            { name: '프리져', type: ' 얼음 ', hp: 3051, exp: 35, money: 3500 },
            { name: '해너츠', type: '  풀  ', hp: 395, exp: 5, money: 500 },
            { name: '메리프', type: ' 전기 ', hp: 991, exp: 10, money: 1500 },
            { name: '코코리', type: '  땅  ', hp: 1206, exp: 12, money: 2000 },
            { name: '코코미', type: ' 얼음 ', hp: 1069, exp: 10, money: 1500 },
            { name: '마릴리', type: '페어리', hp: 1588, exp: 20, money: 2500 },
            { name: '밀탱크', type: ' 노말 ', hp: 2354, exp: 25, money: 3000 },
            { name: '게을킹', type: ' 노말 ', hp: 4431, exp: 60, money: 10000 },
            { name: '잠만보', type: ' 노말 ', hp: 3225, exp: 35, money: 5000 },
            { name: '그란돈', type: '  땅  ', hp: 4115, exp: 45, money: 7000 },
            
        ],
        myMonsters: [ 
            { no: 1, name: '에나비', type: ' 노말 ', hp: 739, exp: 10, money: 1000 },
            { no: 2, name: '이브이', type: ' 노말 ', hp: 1071, exp: 15, money: 2000 },
            { no: 3, name: '루브도', type: ' 노말 ', hp: 431, exp: 5, money: 500 }
        ],
        itemGuide: [
            { name: 'HP 포션 I', price: 1000, effect: { desc: 'hp 회복', amount: 50 }},
            { name: 'HP 포션 II', price: 1500, effect: { desc: 'hp 회복', amount: 70 }},
            { name: 'HP 포션 III', price: 2000, effect: { desc: 'hp 회복', amount: 100 }},
            { name: 'HP 포션 IV', price: 2500, effect: { desc: 'hp 회복', amount: 150 }},
            { name: 'HP 포션 V', price: 3000, effect: { desc: 'hp 회복', amount: 200 }},
            { name: '검', price: 100000, effect: { desc: '무기', atk: 300 }},
            { name: '강철검', price: 150000, effect: { desc: '무기', atk: 500 }},
            { name: '은검', price: 200000, effect: { desc: '무기', atk: 700 }},
            { name: '금검', price: 300000, effect: { desc: '무기', atk: 1000 }},
        ]
    },
    methods: {
        addMonster: function (){
            this.randNum = Math.floor(Math.random() * this.monsterGuide.length)     

            var max = this.myMonsters.reduce( function (a, b) {
                return a > b.no ? a : b.no
            }, 0)

            this.myMonsters.push(
                { no: max + 1, name: this.monsterGuide[this.randNum].name, type: this.monsterGuide[this.randNum].type, 
                    hp: this.monsterGuide[this.randNum].hp, exp: this.monsterGuide[this.randNum].exp, money: this.monsterGuide[this.randNum].money }
            )
        },
        addManyMonster (){
            for (var i = 0; i < 100; i++){
                var max = this.myMonsters.reduce( function(a, b){
                    return a > b.no ? a : b.no
                },0)

                this.randNum = Math.floor(Math.random() * this.monsterGuide.length)

                this.myMonsters.push(
                    { no: max + 1, name: this.monsterGuide[this.randNum].name, type: this.monsterGuide[this.randNum].type, 
                        hp: this.monsterGuide[this.randNum].hp, exp: this.monsterGuide[this.randNum].exp, money: this.monsterGuide[this.randNum].money }
                )
            }
        },
        removeMonster: function (index) {
            this.myMonsters.splice(index, 1)
        },
        userAttack: function (index) {
            this.myMonsters[index].hp -= this.myStatus.atk
        },
        skill: function () {
            for (var i = 0; i < this.myMonsters.length; i++){
                this.myMonsters[i].hp = parseInt(this.myMonsters[i].hp - this.myStatus.atk * 2)
            }
        },
        shuffleShopList () {
            if (!this.shopView){
                this.shopListValue = []
            }
            for (var i = 0; i < 10; i++){
                var randIdx = Math.floor(Math.random() * this.itemGuide.length)
                this.shopList[i] = this.itemGuide[randIdx]
            }
        }    
    },
    beforeUpdate() {
        for(var i = 0; i < this.myMonsters.length; i++){
            if(this.myMonsters[i].hp <= 0){
                this.myStatus.currentExp += this.myMonsters[i].exp
                this.myStatus.myMoney += this.myMonsters[i].money
                this.myMonsters.splice(i, 1)
            }
        }
        
        for (; this.myStatus.currentExp >= this.myStatus.needExp; ) {
            this.myStatus.currentExp = parseInt(this.myStatus.currentExp - this.myStatus.needExp)
            this.myStatus.level += 1
            this.myStatus.hp *= 1.2
            this.myStatus.atk *= 1.01
            this.myStatus.def += 1

            if (this.myStatus.level < 10) {
                this.myStatus.needExp = parseInt(this.myStatus.needExp * 1.1)
            } else if (this.myStatus.level < 20) {
                this.myStatus.needExp = parseInt(this.myStatus.needExp * 1.2)
            } else if (this.myStatus.level < 30) {
                this.myStatus.needExp = parseInt(this.myStatus.needExp * 1.3)
            } else if (this.myStatus.level < 40) {
                this.myStatus.needExp = parseInt(this.myStatus.needExp * 1.4)
            } else if (this.myStatus.level < 50) {
                this.myStatus.needExp = parseInt(this.myStatus.needExp * 1.5)
            } else if (this.myStatus.level < 80) {
                this.myStatus.needExp = parseInt(this.myStatus.needExp * 1.7)
            } else if (this.myStatus.level < 100) {
                this.myStatus.needExp = parseInt(this.myStatus.needExp * 2)
            }
            
        }
        

    }

})