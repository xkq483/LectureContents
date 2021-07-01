var app = new Vue ({
  el: '#app',
  data: {
    message: "우왕 뷰 짱",
    initMsg: '양방향 연결이 뭔지 함 볼까 ?',
    list: ['사과', '바나나', '딸기', '수박', '참외', '포도', '멜론', '망고', '블루베리', '체리'],
    show: true,
    num: 3,
    count: 0,
    randomNumber: 0,
    radius: 50,
    monsterName: '',
    monsters: [
      {id: 1, name: '슬라임', hp: 30},
      {id: 2, name: '고블린', hp: 50},
      {id: 3, name: '카오스드래곤', hp: 99999999 }
    ]

  },
  methods: {
    buttonClickTest: function (event) {
      alert('뷰형님 짱')
    },
    increment: function() {
      this.count += 1
    },
    addMonster: function() {
      var max = this.monsters.reduce(function (a, b) {
        return a > b.id ? a : b.id
      }, 0)

      this.monsters.push({
        id:max + 1,
        name: this.monsterName,
        hp: Math.floor(Math.random() * 1000 + 10)
      })
    },
    removeMonster: function(index) {
      this.monsters.splice(index, 1)
    },
    
    userAttack: function (index) {
      this.monsters[index].hp -= 10
    },
    randomGeneration () {
      this.randomNumber = Math.floor(Math.random() * 10) + 1
    }

  },

  beforeCreate() {
    console.log('Vue 객체 만들기 이전입니다.')
    
  },
  created() {
    console.log('Vue 객체를 만들었습니다.')
  },
  beforeMount() {
    console.log('HTML 요소를 붙이기 전입닙니다.')

  },

  mounted() {
    console.log('HTML 요소를 붙입니다.')
  },
  beforeUpdate() {
    console.log('VDOM의 변화를 감지합니다.')
    
  },
  updated() {
    console.log('VDOM의 변화를 적용합니다.')
    var i 
    for (let i = 0; i< this.monsters.length; i++) {
      if(this.monsters[i].hp <= 0) {
        alert(this.monsters[i].name + '을 공략했습니다. ')
        this.monsters.splice(i, 1)
      }
     
    }
  },
  beforeDestroy() {
    console.log('Vue 객체를 파괴하기 이전입니다.')
  },
  destroyed() {
    console.log('Vue 객체를 파괴합니다.')
  },
})