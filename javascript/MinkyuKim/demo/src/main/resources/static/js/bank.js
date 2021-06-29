
// 몇일이 되었습니다.(만난지 ~~~~일)
// document.querySelector('#accent').innerText = passedDay + "일";
var reserve = 1000000;
document.querySelector('#accent').innerText = reserve + "원";

calcMoney(1);
calcMoney(3);
calcMoney(10);


function calcMoney(money) {
    for(var i = 0; i < money; i++) {
        var rate = 0.04;
        reserve += reserve * rate;
    }
    reserve = Math.round(reserve);
    document.querySelector("#money" + money).innerText = reserve + "원";
}