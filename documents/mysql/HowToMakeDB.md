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

4. 현재 문자열 셋을 보기 위해 아래 명령을 통해 utf8이 박혀있는지 확인한다.  

```make
status;
```

5. 이제 사용자 계정을 생성한다.  
   root 계정 사용하면 컴퓨터 털어가세요란 뜻이라 절대로 하면 안됨  
   
```make
create user khweb@localhost identified by 'khWeb@123';
```

6. 사용자 계정이 DB를 활용할 수 있도록 권한을 위임한다.  

```make
grant all privileges on non_jpa_db.* to khweb@localhost;
```

7. 현재 상태 저장  

```make
flush privileges;
```

8. 권한이 잘 설정되었는지 체크한다.  

```make
show grants for 'khweb'@'localhost';
```
