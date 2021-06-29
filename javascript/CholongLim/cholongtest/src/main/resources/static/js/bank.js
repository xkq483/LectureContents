
var myMoney = 1000000;
var interest = myMoney * ( 4 / 100 );
var resultPrice = myMoney + interest;

document.querySelector('#accent').innerText = myMoney + "원";

calcYear(1);
calcYear(3);
calcYear(10);

function calcYear(year) {

    var future = myMoney + interest * (1000 * 60 * 60 * 24);
    var someday = new Date(future);
    for ( var i = 1; i <= 10 ; i++){
        interest[i] = myMoney[i] * ( 4 / 100 );
        myMoney[i] += interest[i];
        document.write(myMoney[1],myMoney[3],myMoney[10]);
        document.querySelector('#money' + year).innerText =
             myMoney[i];
    }

