package my.day01;

//import my.day02.Member;
//동일 패키지 속에 있는 클래스는 import를 안하더라도 모두 사용 가능하다.



public class Main {
    public static void main(String[] args) {
        HelloTest hello = new HelloTest();
        hello.hellotest();




        Member ksbmbr = new Member();
        ksbmbr.name = "김성빈";
        ksbmbr.id = "kksb0831";
        ksbmbr.pwd = "1234";
        ksbmbr.email = "kksb0831@naver.com";


        Member syhmbr = new Member();
        syhmbr.name = "서영학";
        syhmbr.id = "syhhhh";
        syhmbr.pwd = "qwer";
        syhmbr.email = "syhhhh@naver.com";

//		eomjhmbr.address ="경기도 군포시";

//		System.out.println(lssmbr);
//		System.out.println("이순신의 아이디 : " + lssmbr.id);
//		System.out.println("이순신의 비밀번호 : " + lssmbr.pwd);
//		System.out.println("이순신의 email : " + lssmbr.email);
//		System.out.println("이순신의 주소 : " + Member.address + "\n\n");
//
//
//		System.out.println(eomjhmbr);
//		System.out.println("엄정화의 아이디 : " + eomjhmbr.id);
//		System.out.println("엄정화의 비밀번호 : " + eomjhmbr.pwd);
//		System.out.println("엄정화의 email : " + eomjhmbr.email);
//		System.out.println("엄정화의 주소 : " + Member.address);


        Member.maker = "쌍용";

        ksbmbr.showInfo();
        syhmbr.showInfo();
    }
}


