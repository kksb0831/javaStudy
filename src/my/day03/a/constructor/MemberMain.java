package my.day03.a.constructor;

public class MemberMain {
    public static void main(String[] args) {


        Member hongMbr = new Member();

        hongMbr.userid = "hongkd";
        hongMbr.passwd = "qwer1234";
        hongMbr.name = "홍길동";
        hongMbr.age = 25;
        hongMbr.point = 10000;


        Member lssMbr = new Member("leess","q1w2e3r4","이순신",50,5842);


        hongMbr.showInfo();

        lssMbr.showInfo();

        hongMbr.chageInfo("KDHong","1234qwer","홍길동",20,8742);
        hongMbr.showInfo();


        String info = lssMbr.updateInfo("lee","abcd0070","이순신",51,7000);
        System.out.println(info);

    }
}
