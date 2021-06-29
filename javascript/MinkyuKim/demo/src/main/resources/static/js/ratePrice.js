/* 1년, 3년, 10년후의 금액 계산하여 출력
   수중 100만원, 이자 4% */

function ratePrice {
var reserve = 1000000;
var rate = 0.04;


for(i = 1; i <= 10; i++) {
var reserve = 1000000;
var rate = 0.04;
fReserve = reserve;
fReserve[i] = fReserve[i-1] * rate;
document.write(fReserve[i]);
document.querySelector('#rp').innerHTML = fReserve[i];
document.write(fReserve[1], fReserve[3], fReserve[10]);
document.querySelector('#rp').innerHTML = fReserve[1] + fReserve[3] + fReserve[10];
}

document.querySelector('#rp').innerHTML = fReserve[1] + fReserve[3] + fReserve[10];
}