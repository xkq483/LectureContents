function Book (title, author, volume, price) {
    this.title = title;
    this.author = author;
    this.volume = volume;
    this.price = price;
}

var html = new Book('웹 마스터', 'Ko', '608', '38,000',);
var youtube = new Book('하루만에 만드는 유투브', 'kim', '1068', '40000');
var python = new Book('일주일만에 파이썬', 'park', '352', '18000');

var bookList = [html, youtube, python];

document.write("<h1>책 제목으로 살펴보기!</h1>");

for (var i = 0; i < bookList.length; i++) {
    document.write("<p>" + bookList[i].title + "</p>");
}