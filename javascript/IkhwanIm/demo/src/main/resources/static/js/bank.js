var myMoney = 1000000;
var interest = 0.04;

document.querySelector('#accent').innerText = myMoney + "원";

calcMoney(1);
calcMoney(3);
calcMoney(10);


function calcMoney (year) {
    for(var i = 0; i < year; i++) {
        myMoney += (myMoney * interest);
    }
    myMoney = Math.round(myMoney);
    document.querySelector("#money" + year).innerText =
        "후의 잔고는? " + myMoney + "원";
}