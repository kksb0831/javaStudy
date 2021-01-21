package my.day02;

public class Main01 {

    String id;      //문자열 타입
    String pwd;
    String name;
    String email;
    int age;        //정수 타입

    /*
        멤버변수 = instance 변수와 static 변수를 합친 것을 멤버 변수라고 부른다.
        instance 변수와 static 변수는 초기화 하지 않더라고 자동적으로 초기화가 되어진다.
        정수형인 데이터 타입(byte, short, int, long)은 자동적으로 0으로 초기화가 되고,
        실수형인 데이터 타입(float, double)은 자동적으로 0.0으로 초기화가 되고,
        문자형인 데이터 타입(char)은 자동적으로 ' '으로 초기화가 되고.
        String을 포함한 클래스 타입은 자동적으로 null으로 초기화가 된다.
     */

    public Main01() {

    }


    public static void main(String[] args) {

        Main01 ma1 = new Main01(); // 인스턴스화(==객체생성)

        ma1.id = "leess";
        ma1.pwd = "qwer1234";
        ma1.name = "이순신";
        ma1.email = "leess@naver.com";
        ma1.age = 25;

        ma1.showInfo1();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        String info1 = ma1.showInfo2();
        System.out.println(info1);

        System.out.println("########################");
        Main01 ma2 = new Main01();


//        ma2.id = "eomjh";
//        ma2.pwd = "1q2w3e4r";
//        ma2.name = "엄정화";
//        ma2.email = "eomjh@naver.com";
//        ma2.age = 32;


        ma2.showInfo1();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        String info2 = ma2.showInfo2();
        System.out.println(info2);

    }

  void showInfo1() {
        // 지역변수는 { } 내에서만 사용되는 것으로 { ]를 벗어나는 순간
        // 자동적으로 메모리에서 삭제가 되어진다.
        // 중요한 것은 지역변수는 반드시 초기화(==값을 부여하는 것) 해주어야 한다.
        int hopeMoney;
        hopeMoney = 10000;
        String hopeMoneySt = "일억원";

        System.out.println("===회원 정보===" + "\n" +
                "1. 아이디 : " + id + "\n" +
                "2. 암호 : " + pwd + "\n" +
                "3. 성명 : " + name + "\n" +
                "4. 이메일 : " + email + "\n" +
                "5. 나이 : " + age + "\n" +
                "6. 희망급여 : " + hopeMoney + "\n" +
                "7. 희망연봉 : " + hopeMoneySt);
        // "안녕하세요" + " 반갑습니다" ==> "안녕하세요 반갑습니다"
        // "안녕하세요" + 25 ==> "안녕하세요25"
        // 20 + 30 ==> 50
        // "20" + 30 ==> "2030"
        // 20 + 30 + "안녕" ==> 50 + "안녕" ==> "50안녕"

    }

    String showInfo2() {
        int hopeMoney = 5000;

        return "===회원 정보===" + "\n" +
                "1. 아이디 : " + id + "\n" +
                "2. 암호 : " + pwd + "\n" +
                "3. 성명 : " + name + "\n" +
                "4. 이메일 : " + email + "\n" +
                "5. 나이 : " + age + "\n" +
                "6. 희망 급여 : " + hopeMoney;
    }
}
