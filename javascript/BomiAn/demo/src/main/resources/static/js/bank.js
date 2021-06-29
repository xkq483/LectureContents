var myMoney = 1000000;
var rate = 4;
document.querySelector('#accent').innerText = myMoney + "원";

bankMoney(1);
bankMoney(3);
bankMoney(10);

function bankMoney (term) {
    var myInterest = myMoney * term * rate / 100;
    var totalMoney = myMoney + myInterest;

    document.querySelector('#money' + term).innerText =
            "맡기신 금액은 " + myMoney + "원 이고," + term + "년 후 받을 이자는 " + myInterest + "원 입니다. 최종 받을 금액은 " + totalMoney + "원 입니다!";
};


