var app = new Vue ({
    el: '#app',
    data: {
        message: '우왕 뷰 짱',
        initMsg: '양방향 연결이 뭔지 함 볼까 ?',
        list: ['사과', '바나나', '딸기', '수박', '참외', '포도', '망고', '블루베리', '체리'],
        show: true,
        num: 3,
        count: 0,
        radius: 50
    },
    methods: {
        // event: 사용자가 어떤 이벤트를 발생시켰는지 알 수 있음
        buttonClickTest: function (event) {
            alert('뷰 짱')
        },
        // 작성 형식
        // 함수 이름: function () {} ===> 중괄호 내부는 일반 매서드 작성과 동일
        increment: function () {
            this.count += 1
        }
    }
})