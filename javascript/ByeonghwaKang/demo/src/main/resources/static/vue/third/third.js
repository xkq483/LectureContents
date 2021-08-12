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
        shopView: false,
        shopList: [],
        shopListValue: [],
        inventoryView: false,
        myInventory: [],
        myInventoryValue: [],
        characterStatus: {
            level: 1,
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
            // 전체 필요 경험치량
            totalLevelBar: 10,
            // 현재 누적한 경험치량
            currentLevelBar: 0,
            money: 0
        },
        monsterName: '',
        monsters: [
            { id: 1, name: '슬라임', hp: 30 },
            { id: 2, name: '고블린', hp: 50 },
            { id: 3, name: '카오스 드래곤', hp: 99999999 }
        ],
        monsterBook: [
            { name: '슬라임', hp: 30, exp: 1, money: 10 },
            { name: '고블린', hp: 50, exp: 2, money: 20 },
            { name: '레드 슬라임', hp: 70, exp: 4, money: 40 },
            { name: '홉 고블린', hp: 120, exp: 8, money: 80 },
            { name: '그린 슬라임', hp: 150, exp: 12, money: 160 },
            { name: '스켈레톤', hp: 200, exp: 20, money: 320 },
            { name: '고블린 마법사', hp: 250, exp: 25, money: 640 },
            { name: '블루 슬라임', hp: 300, exp: 35, money: 1280 },
            { name: '트롤', hp: 500, exp: 50, money: 2000 },
            { name: '원혼', hp: 700, exp: 60, money: 4000 },
            { name: '고블린 족장', hp: 800, exp: 70, money: 5000 },
            { name: '스켈레톤 기사', hp: 1000, exp: 80, money: 10000 },
            { name: '오우거', hp: 1200, exp: 90, money: 12000 },
            { name: '오우거 메이지', hp: 1500, exp: 100, money: 15000 },
            { name: '스켈레톤 근위병', hp: 2000, exp: 120, money: 20000 },
            { name: '고블린 대사장', hp: 2500, exp: 150, money: 25000 },
            { name: '귀인', hp: 2800, exp: 180, money: 28000 },
            { name: '킹 슬라임', hp: 3000, exp: 200, money: 30000 },
            { name: '고스트', hp: 3200, exp: 250, money: 32000 },
            { name: '흡혈귀', hp: 4000, exp: 300, money: 44000 },
            { name: '스켈레톤 나이트', hp: 5500, exp: 350, money: 55000 },
            { name: '메탈 슬라임', hp: 7000, exp: 40000, money: 70000 },
            { name: '리치', hp: 9000, exp: 500, money: 90000 },
            { name: '듀라한', hp: 15000, exp: 700, money: 150000 },
            { name: '리치 킹', hp: 90000, exp: 2500, money: 900000 },
            { name: '뱀파이어 로드', hp: 150000, exp: 4500, money: 1500000 },
            { name: '이무기', hp: 300000, exp: 10000, money: 3000000 },
            { name: '베헤모스', hp: 500000, exp: 20000, money: 5000000 },
            { name: '리치 로드', hp: 1000000, exp: 40000, money: 10000000 },
            { name: '베헤모스 킹', hp: 2000000, exp: 80000, money: 20000000 },
            { name: '드래곤', hp: 4000000, exp: 150000, money: 40000000 },
            { name: '데스 나이트', hp: 10000000, exp: 300000, money: 100000000 },
            { name: '카오스 드래곤', hp: 99999999, exp: 10000000, money: 100000000 },
            { name: '리무루 템페스트', hp: 999999999999999, exp: 999999999, money: 9999999999 }
        ],
        itemBook: [
            { name: 'HP 포션 I', price: 50, effect: { desc: 'hp 회복', amount: 200 }},
            { name: 'HP 포션 II', price: 200, effect: { desc: 'hp 회복', amount: 700 }},
            { name: 'HP 포션 III', price: 1000, effect: { desc: 'hp 회복', amount: 2000 }},
            { name: 'HP 포션 IV', price: 6000, effect: { desc: 'hp 회복', amount: 6000 }},
            { name: 'HP 포션 V', price: 42000, effect: { desc: 'hp 회복', amount: 15000 }},
            { name: '검', price: 10000000, effect: { desc: '무기', atk: 100 }},
            { name: '강철검', price: 50000000, effect: { desc: '무기', atk: 200 }},
            { name: '환두대도', price: 250000000, effect: { desc: '무기', atk: 350 }},
            { name: '발라리아 강철검', price: 1250000000, effect: { desc: '무기', atk: 500 }},
            { name: '칠지도', price: 10000000000, effect: { desc: '무기', atk: 1000 }},
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
        calcBuy: function () {
            var tmpSum = 0

            console.log('calcBuy(): ' + this.shopListValue.length)
            console.log('shoplist length: ' + this.shopList.length)

            for (var i = 0; i < this.shopListValue.length; i++) {
                console.log('외곽 루프 - 선택된 값: ' + this.shopListValue[i])

                for (var j = 0; j < this.shopList.length; j++) {
                    console.log('내부 루프')

                    if (this.shopListValue[i] == j) {
                        console.log('매칭 성공!')
                        tmpSum += this.shopList[j].price
                        break
                    }
                }
            }

            if (this.characterStatus.money - tmpSum >= 0) {
                this.characterStatus.money -= tmpSum

                // 사용자 인벤토리 구현시 필요한 로직 작성
                for (var i = 0; i < this.shopListValue.length; i++) {
                    this.myInventory.push({
                        name: this.shopList[this.shopListValue[i]].name,
                        effect: this.shopList[this.shopListValue[i]].effect
                    })
                }
            } else {
                alert('돈.벌.어.와!')
            }
        },
        equipItem () {
            var tmpSum = 0

            console.log('equipItem(): ' + this.myInventoryValue.length)
            console.log('myInventory length: ' + this.myInventory.length)

            for (var i = 0; i < this.myInventoryValue.length; i++) {
                console.log('외곽 루프 - 선택된 값: ' + this.myInventoryValue[i])

                for (var j = 0; j < this.myInventory.length; j++) {
                    console.log('내부 루프')

                    if (this.myInventoryValue[i] == j) {
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
        spiritChaosDevilBlade (index) {
            this.monsters[index].hp -= this.characterStatus.atk * 20 +
                                        this.characterStatus.str * 8 +
                                        this.characterStatus.dex * 3 +
                                        this.characterStatus.intelligence * 0.7
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