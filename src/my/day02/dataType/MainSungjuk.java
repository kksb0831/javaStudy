package my.day02.dataType;


import java.util.Random;

public class MainSungjuk {
    public static void main(String[] args) {

        Sungjuk lssSj = new Sungjuk();

        lssSj.hakbun = "091234";
        lssSj.name = "이순신";
        lssSj.kor = 62;
        lssSj.eng = 91;
        lssSj.math = 100;



        Sungjuk eomSj = new Sungjuk();

        eomSj.hakbun = "109876";
        eomSj.name = "엄정화";
        eomSj.kor = 78;
        eomSj.eng = 88;
        eomSj.math = 95;


        lssSj.showSungjuk();
        System.out.println("\n ~~~~~~~~~~~~~~~~~~~ \n");
        eomSj.showSungjuk();


        System.out.println("\n ~~~~~~~~~~~~~~~~~~~ \n");
        System.out.println("lssSj => " + lssSj);
        // lssSj => my.day02.dataType.Sungjuk@1b6d3586
        System.out.println("eomSj => " + eomSj);
        // eomSj => my.day02.dataType.Sungjuk@4554617c

        Sungjuk hongSj = new Sungjuk();
        System.out.println("hongSj => " + hongSj);
        // hongSj => my.day02.dataType.Sungjuk@74a14482


        hongSj = eomSj;
        hongSj.name = "Eom Jung Hwa";
        hongSj.showSungjuk();



        System.out.println("\n ################### \n");
        System.out.println("=== 이순신 성적표 ===");
        lssSj.totalGrade(lssSj.kor, lssSj.eng, lssSj.math);

        System.out.println("\n ~~~~~~~~~~~~~~~~~~~ \n");
        System.out.println("=== 엄정화 성적표 ===");
        eomSj.totalGrade(eomSj.kor, eomSj.eng, eomSj.math);

        char a = 44608;
        char b = 49457;
        char c = 48712;
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);

        char ch1 = 49436;
        char ch2 = 65;
        char ch3 = 'a';
        char ch4 = 'a'+1;
        char ch5 = (char) (ch4 -1);
        char ch6 = '\u2665';

        System.out.println("\n=== 문자형 ===");
        System.out.println("ch1 : " + ch1);
        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);
        System.out.println("ch4 : " + ch4);
        System.out.println("ch5 : " + ch5);
        System.out.println("ch6 : " + ch6);

        System.out.println("\n=== boolean 형 ===");

        Random random = new Random();
        boolean bool = random.nextBoolean();



        if (bool) {
            System.out.println("현재 bool 변수의 값은 true 입니다.");
        } else {
            System.out.println("현재 bool 변수의 값은 false 입니다.");
        }

        System.out.println("bool ==> " + bool);

    }
}
