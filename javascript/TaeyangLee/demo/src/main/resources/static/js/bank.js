var now = 1000000;
document.querySelector('#accent').innerText = now + "원";


calcMoney(1);
calcMoney(3);
calcMoney(10);


function calcMoney (year) {
    var rate = 0.04;

    var money = Math.round(now*(Math.pow(1+rate,year)));

      document.querySelector("#money" + year).innerText = money + "원";

}

