# MySQL DB Control

## How to Control DB ?

1. 먼저 DB 계정으로 로그인한다.  
2. 이후 아래 명령을 입력하여 새로운 스키마를 작성한다.  

```make
create schema `non_jpa_db` default character set utf8mb4;
```

3. 이제 다시 아래의 명령을 입력하여 새로운 스키마 작성을 확인한다.

```make
show databases;
```
