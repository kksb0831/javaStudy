package my.day05.c.IF;

public class IfMain {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        if (n1 == n2) {
            System.out.println(n1 + "은(는) " + n2 + "와(과) 같습니다.");
        } else {
            System.out.println(n1 + "은(는) " + n2 + "와(과) 같지 않습니다.");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");


        String name1 = "이순신";
        String name2 = "엄정화";


        if (name1 == name2) {   // name1 == name2 는 name1 과 name2 에 저장된 데이터 값을 비교하는 것
            System.out.println(name1 + "은(는) " + name2 + "와(과) 같습니다.");
        } else {
            System.out.println(name1 + "은(는) " + name2 + "와(과) 같지 않습니다.");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

        String name3 = new String("강감찬");
        String name4 = new String("강감찬");

        if (name3 == name4) {   // name3 == name4 는 name3 과 name4 의 메모리 주소를 비교하는 것
            System.out.println(name3 + "은(는) " + name4 + "와(과) 같습니다.");
        } else {
            System.out.println(name3 + "은(는) " + name4 + "와(과) 같지 않습니다.");
        }


        if (name3.equals(name4)) {   // name3.equals(name4)는 name3 과 name4 의 데이터 값을 비교하는 것
            System.out.println(name3 + "은(는) " + name4 + "와(과) 같습니다.");
        } else {
            System.out.println(name3 + "은(는) " + name4 + "와(과) 같지 않습니다.");
        }


    }
}
