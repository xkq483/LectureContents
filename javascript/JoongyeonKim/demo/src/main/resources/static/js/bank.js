// 오늘 날자 정보
var now = new Date();
// 처음 만난 날자 정보
var firstDay = new Date("2011-6-29");
// 오늘 날자 정보를 컴퓨터가 계산하는 숫자 정보로 변환 (정확하게는 ms 단위로 바꿈)
var toNow = now.getTime();
// 처음 만난 날자를 컴퓨터가 계산하는 숫자 정보로 변환
var toFirst = firstDay.getTime();
// 오늘 날자 - 첫 만남
var passedTime = toNow - toFirst;
// 다시 날자로 변환
// Math.round(반올림)
var myMoney = 1000000
var interest = 0.04

document.querySelector('#accent').innerText = myMoney + "원";

calcDate(365);
calcDate(1095);
calcDate(3650);

function calcDate (days) {
    var future = toFirst + days * (1000 * 60 * 60 * 24);
    var someday = new Date(future);

    var year = someday.getFullYear();

    document.querySelector("#date" + days).innerText =
        year + "년 " + month + "월 " + date + "일";

   /* var totalMoney = myMoney * interest * year */


    document.querySelector("#date" + days).innerText =
          totalMoney+ "원";
}