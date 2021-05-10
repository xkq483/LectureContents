# Git 환경 구축

```
1. 구글에서 git을 검색한다.
2. 첫 번째 나타나는 페이지로 진입한다.
    (https://git-scm.com/ )
3. 페이지에 보이는 Download를 선택한다.
4. 운영체제(Windows)를 자신에 맞게 선택한다.
5. 자동으로 다운이 된 프로그램을 클릭하여 설치한다.
   Mac의 경우 - brew install git
   Linux의 경우 - sudo apt-get install git
6. Next -> Next -> Next -> Next -> Next ->
   Next -> Next -> Next -> Next -> Next ->
   Next -> Next -> Next -> Install
7. 설치가 완료되면 Launch Git Bash에만 체크를 하고 Finish를 누른다.
8. git 프롬프트가 나타나면 git --version을 입력해서 2.31.1 버전인지 확인한다.
   (Mac이나 Linux의 경우 2.x 버전이면 OK)
9. pwd 명령어를 통해서 디폴트 디렉토리가 어디로 잡혀있는지 체크한다.
   (학원컴의 경우 /c/Users/user2 에 잡혀있음)
10. cd 드라이브에 작업하고자 한다면 cd 명령어를 써서 위치를 이동한다.
     [ cd(Change Directory)의 약자임 ]
     cd d:
     cd e:
     cd c:
     
* KHWeb18의 경우 우리가 모두 함께 공용으로 활용하는 저장소에 해당한다.
* fork를 눌러서 자기 자신의 계정으로 사본을 생성해왔음
* 시나리오: 팀 프로젝트를 진행하고 있었음
* 1. 작업을 하다보니 팀원이 작업한 내용을 내가 작업하고 있는 저장소에 땡겨와야함
* 2. 내가 작업한 내용을 원본 저장소에 업로드 해야함
*    2-1. 내가 작업한 내용을 사본 저장소에 저장한다.
*    2-2. 내가 작업한 내용을 원본 저장소에 저장한다.
* 3. 내가 작업한 내용을 팀원이 적용하여 잘 동작하는지 확인을 해야함

11. 깃 페이지에 접속해서 KHWeb18/LectureContents의 우측 상단에 fork를 누른다.
12. 자신의 계정에 fork된 LectureContents쪽의 초록 버튼(Code)를 누른다.
     클릭하면 전체 선택이 될 것이고 이 내용을 Ctrl + C로 복사한다.
13. d 드라이브에 있는 java_work로 이동한다.
     cd java_work
14. pwd 명령어로 현재 d/java_work인지 확인한다.
15. git clone https://github.com/silenc3502/LectureContents.git
     (여기서도 silenc3502는 자신의 계정명으로 대체 되어야 할 것이다)
16. cd LectureContents
17. git remote -v를 통해 자신의 계정명이 있는지 확인한다.

17. git config --global user.email "gcccompil3r@gmail.com"
18. git config --global user.name "silenc3502"

17번, 18번은 각자 자신의 깃 계정 이메일과 깃 아이디를 기입해야 한다.
```

## 주의할 부분

윈도우에서 git을 사용하는 경우 작업표시줄에 등록한 상태로 띄우면 경로 설정이 이상하게 적용된다.  
그러므로 올바른 경로를 사용하기 위해서 윈도우 시작 버튼(MS사 로고 - 좌측 하단)을 눌러서  
Git Bash로 실행을 시켜야 올바른 경로가 적용된다.  
