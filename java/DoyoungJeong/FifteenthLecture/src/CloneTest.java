import java.util.ArrayList;
import java.util.Arrays;

class Clone {
    ArrayList<String> nameList;
    ArrayList<String> nameClone;

    public Clone(String[] names) {
        nameList = new ArrayList<String>(Arrays.asList(names));
        //괄호 안 Arrays.asList(XXXX)로 ArrayList형식으로 변환할 수 있다!

        nameClone = (ArrayList<String>) nameList.clone();
        //'nameClone은 nameList의 클론이다'라는 뜻으로 배열의 복제본을 만들어주는 코드이다.

    }

    public void printNameList() {
        for (int i = 0; i < nameList.toArray().length; i++) {
            System.out.printf("nameList[%d] = %s\n", i, nameList.get(i));
            //기존의 배열 형식과 달리 ArrayList<>배열은 안에 값을 호출할 떄 []가 아닌.
            //.get(i)로 불러와야 한다.
        }
    }

    public void printCLone() {
        for (int i = 0; i < nameClone.toArray().length; i++) {
            System.out.printf("cloneList[%d] = %s\n", i, nameClone.get(i));
        }
    }

    public void removeName() {
        //nameList.remove("함준우");
        nameClone.remove("최준열");
        //nameList.clear(); //배열을 완전 통째로 지워버린다.
    }

    public void findAndContains() {
        System.out.println(nameClone.indexOf("최준열"));
        //.indexOF()는 배열에 든 값들의 위치를 번호로 표현해준다. 값이 없을 경우 -1로 표현한다.
        System.out.println(nameClone.contains("최준열"));
        //.contains()는 괄호 안에 든 값을 검색하여 값이 존재하면 true 없으면 false를 내보낸다.
    }
}

public class CloneTest {

    public static void main(String[] args) {
        String names[] = {"정도영", "김상욱", "최준열", "함준우"};
        Clone ct = new Clone(names);
        //ct.printNameList();
        //ct.printCLone();
        ct.removeName();

        System.out.println("removeName에서 이름을 지우고 다시 밑에 출력");
        ct.printNameList(); //remove에서 삭제된 배열 제외, 나머지가 출력된다.
        ct.printCLone(); //원본과 복사본은 서로 별개로 생성되어, 한쪽의 값 삭제나 추가에 다른 쪽이 영향을 받지 않는다.

        ct.findAndContains();

    }
}
