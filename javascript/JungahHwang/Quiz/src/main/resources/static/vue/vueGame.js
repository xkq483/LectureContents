var app = new Vue ({
    el: '#app',
    data: {
        randNum: 0,
        count: 0,
        monsterGuide: [
            { name: '리자드', type: '불꽃', hp: 1653 },
            { name: '꼬부기', type: '물', hp: 946 },
            { name: '피카츄', type: '전기', hp: 938 },
            { name: '푸크린', type: '페어리', hp: 1926 },
            { name: '데구리', type: '바위', hp: 1897 },
            { name: '아라리', type: '풀', hp: 1175 },
            { name: '루주라', type: '얼음', hp: 2555 },
            { name: '디그다', type: '땅', hp: 676 },
            { name: '메타몽', type: '노말', hp: 832 },
            { name: '망나뇽', type: '드래곤', hp: 3792 },
            { name: '포니타', type: '불꽃', hp: 1697 },
            { name: '고오스', type: '고스트', hp: 1229 },
            { name: '킹크랩', type: '물', hp: 2829 },
            { name: '샤미드', type: '물', hp: 3114 },
            { name: '암스타', type: '바위', hp: 2786 },
            { name: '프리져', type: '얼음', hp: 3051 },
            { name: '해너츠', type: '풀', hp: 395 },
            { name: '메리프', type: '전기', hp: 991 },
            { name: '코코리', type: '땅', hp: 1206 },
            { name: '코코미', type: '얼음', hp: 1069 },
            { name: '마릴리', type: '페어리', hp: 1588 },
            { name: '밀탱크', type: '노말', hp: 2354 },
            
        ],
        myMonsters: [ 
            { no: 1, name: '에나비', type: '노말', hp: 739 },
            { no: 2, name: '이브이', type: '노말', hp: 1071 },
            { no: 3, name: '루브도', type: '노말', hp: 431 }
        ]
    },
    methods: {
        addMonster: function (){
            this.randNum = Math.floor(Math.random() * this.monsterGuide.length)     

            var max = this.myMonsters.reduce( function (a, b) {
                return a > b.no ? a : b.no
            }, 0)

            this.myMonsters.push(
                { no: max + 1, name: this.monsterGuide[this.randNum].name, type: this.monsterGuide[this.randNum].type, hp: this.monsterGuide[this.randNum].hp }
            )
            
        },
        removeMonster: function (index) {
            this.myMonsters.splice(index, 1)
        },
        userAttack: function (index) {
            this.myMonsters[index].hp -= 100
        }    
    },
    beforeUpdate() {
        
        for(var i = 0; i < this.myMonsters.length; i++){
            if(this.myMonsters[i].hp <= 0){
                this.myMonsters.splice(i, 1)
            }
        }
    }

})