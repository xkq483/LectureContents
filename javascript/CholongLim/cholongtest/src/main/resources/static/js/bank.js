var myMoney = 1000000;
var interest = 0.04;

document.querySelector('#accent').innerText = myMoney + "원";
calcYear(1);
calcYear(3);
calcYear(10);

function calcYear (years) {
    var nowMoney = myMoney * ( 1 + (interest * years));
    document.querySelector("#money" + years).innerText = nowMoney + "원";
}

