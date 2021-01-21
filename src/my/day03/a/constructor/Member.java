package my.day03.a.constructor;

public class Member {

    // field, attribute, property, 속성
    String userid;
    String passwd;
    String name;
    int age;
    int point;


    // *** 생성자(constrictor) *** //

    // 생성자를 명기(명시)하지 않으면 아래와 같은 것이 생략되어져 있다.
//    public Member() {  }




    public Member() {
        System.out.println(">> Member 클래스의 기본생성자(default constructor)를 호출 했습니다 <<");
    }

    // () 속에 들어오는 변수를 매개변수, parameter 라고 부른다.
    // parameter constructor 가 선언되어 있으면
    // 자동적으로 생략되어져 있던던 default costructor 는 소멸된다.
    public Member(String userid, String passwd, String name, int age, int point) {
        // 지역변수명과 멤버변수명(인스턴스 변수 + static변수)이
        // 일치할 경우 지역변수가 우선된다.
        System.out.println(">> Member 클래스의 매개변수 생성자(parameter constructor)를 호출 했습니다 <<");
        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.age = age;
        this.point = point;
    }





    // behavior, 행위, 기능, Method
    // 파라미터가 없고 리턴타입도 없는 메소드 만들기 예제
    void showInfo() {
        System.out.println("\n==== "+ name + "님의 회원정보 ====" + "\n" +
                "1. 아이디 : " + userid + "\n" +
                "2. 비밀번호 : " + passwd + "\n" +
                "3. 나이 : " + age + "\n" +
                "4. 보유 포인트 : " + point);


    }

    // 파라미터가 있고 리턴타입이 없는 메소드 만들기 예제
    void chageInfo(String userid, String passwd, String name, int age, int point) {
        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.age = age;
        this.point = point;
    }



    // 파라미터가 있고 리턴타입도 있는 메소드 만들기 예제
    String updateInfo(String userid, String passwd, String name, int age, int point) {
        String update;

        update = ("\n==== "+ this.name + "님의 회원정보 수정하기 전 ====" + "\n" +
                "1. 아이디 : " + this.userid + "\n" +
                "2. 비밀번호 : " + this.passwd + "\n" +
                "3. 이름 : " + this.name + "\n" +
                "4. 나이 : " + this.age + "\n" +
                "5. 보유 포인트 : " + this.point + "\n\n");


        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.age = age;
        this.point = point;

        update += ("\n==== "+ name + "님의 회원정보 수정 결과 ====" + "\n" +
                "1. 아이디 : " + userid + "\n" +
                "2. 비밀번호 : " + passwd + "\n" +
                "3. 이름 : " + name + "\n" +
                "4. 나이 : " + age + "\n" +
                "5. 보유 포인트 : " + point);



        return update;
    }


}
