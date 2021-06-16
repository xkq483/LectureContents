# MySQL 설정법

## Prerequisite(전제 조건)

```make
기존 Vue 설치시 작업했던 node.js 설정에서 설치했던
C/C++ Native 라이브러리와 python 등등의 설치가 올바르게 되어 있어야함
```

## How to install MySQL on Windows

```make
1. Google에서 MySQL을 검색한다.
2. 공식 사이트에 진입한다.
3. 다운로드를 누른다.
   https://www.mysql.com/downloads/
4. https://dev.mysql.com/downloads/mysql/ 페이지로 이동하자!
5. Windows (x86, 64-bit), ZIP Archive가 아닌 MSI를 다운로드한다.
6. No thanks, just start my download. <<<<<< 누르면 오라클 회원가입 필요없음
7. 다운로드가 꽤 길기 때문에 티타임을 가지도록 합니다.
8. 다운이 완료되면 클릭하여 설치하도록 한다.
9. 설치 준비를 한다고 하면서 뭔가 좀 오랫동안 작업을 한다.

1) Developer Default 선택
2) VS를 위한 MySQL 설정이 있는데 건드리지 않고 Next
3) 뭔가 비어 있는것이 있어 설치가 제대로 되지 않을수도 있다고 하지만 일단 yes하고 설치한다.
4) 서버가 들어있는지 확인하고 Execute를 누르도록 한다.
5) 또 한참 설치한다 ... 커피를 가져오라 ...
6) 모두 Complete가 되었다면 Next로 진행한다.
   여기서 중요한 부분은 Server, Shell, ODBC, C++, J, Python 에 해당한다.
7) 이후 Next
8) Config Type: Development Computer
   TCP/IP Port: 3306 <<<--- MySQL이 사용하는 Port임
   확인후 Next
9) Use Legacy Authentication Method (Retain MySQL 5.x Compatibility) 선택
10) 비밀번호를 학원 맞춤형으로 khWeb@123
11) 시스템 구동시 MySQL 서버 시작 체크하고 Next
12) 어떤 내용들이 진행되는지 간략한 요약을 보여주는데 Execute를 누른다.
13) 설치가 완료되면 Finish를 누른다.
14) Next를 누른다.

```

## How to install MySQL on Linux & Unix(MAC)

```make
sudo apt-get install mysql
```

## How to install MySQL on Unix(MAC)

```make
https://devyurim.github.io/data%20base/mysql/2018/08/13/mysql-1.html
```
