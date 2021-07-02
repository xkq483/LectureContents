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
            // 전체 필요 경험치량
            totalLevelBar: 10,
            // 현재 누적한 경험치량
            currentLevelBar: 0
        },
        monsterName: '',
        monsters: [
            { id: 1, name: '슬라임', hp: 30 },
            { id: 2, name: '고블린', hp: 50 },
            { id: 3, name: '카오스 드래곤', hp: 99999999 }
        ],
        monsterBook: [
            { name: '슬라임', hp: 30 },
            { name: '고블린', hp: 50 },
            { name: '레드 슬라임', hp: 70 },
            { name: '홉 고블린', hp: 120 },
            { name: '그린 슬라임', hp: 150 },
            { name: '스켈레톤', hp: 200 },
            { name: '고블린 마법사', hp: 250 },
            { name: '블루 슬라임', hp: 300 },
            { name: '트롤', hp: 500 },
            { name: '원혼', hp: 700 },
            { name: '고블린 족장', hp: 800 },
            { name: '스켈레톤 기사', hp: 1000 },
            { name: '오우거', hp: 1200 },
            { name: '오우거 메이지', hp: 1500 },
            { name: '스켈레톤 근위병', hp: 2000 },
            { name: '고블린 대사장', hp: 2500 },
            { name: '귀인', hp: 2800 },
            { name: '킹 슬라임', hp: 3000 },
            { name: '고스트', hp: 3200 },
            { name: '리치', hp: 9000 },
            { name: '리치 킹', hp: 90000 },
            { name: '카오스 드래곤', hp: 99999999 },
            { name: '리무루 템페스트', hp: 999999999999999 }
        ]
    },
    methods: {
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
        removeMonster: function (index) {
            this.monsters.splice(index, 1);
        },
        userAttack: function (index) {
            this.monsters[index].hp -= 10
        },
        randomGeneration () {
            this.randomNumber = Math.floor(Math.random() * 10) + 1;
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
                this.monsters.splice(i, 1)
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