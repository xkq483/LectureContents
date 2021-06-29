var now = 1000000;

document.querySelector('#accent').innerText = now + "원";
calcMoney(1);
calcMoney(3);
calcMoney(10);

// 만기 금액 ＝ 원금 × (1 ＋ (이율 × 연))
function calcMoney (years) {
    var rate = 0.04;
    var money = now * (1 + (rate * years));
    document.querySelector("#money" + years).innerText =
        money + "원";
}