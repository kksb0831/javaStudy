package my.day04.b.scanner;

public class Sungjuk {

    String hakbun;
    String name;
    byte kor;       // -128 ~ 127       =>  0 ~ 100
    byte eng;
    byte math;

    short age;      // -32768 ~ 32767   =>  20 ~ 50


    public Sungjuk() {

    }

    boolean checkJumsu(byte jumsu) {
        if (jumsu >= 0 && jumsu <= 100) {
            return true;
        } else {
            System.out.println(">> 올바른 점수를 입력하세요.(점수입력은 0~100 까지 가능) <<");
            return false;
        }
    }


    boolean checkAge(short age) {
        if (age >= 20 && age <= 50) {
            return true;
        } else {
            System.out.println(">> 올바른 나이를 입력하세요.(점수입력은 20~50 까지 가능) <<");
            return false;
        }


    }

    void showInfo() {
        int total = kor + eng + math;
        char hakjum = ' ';

        if (total/3.0 >= 90) {
            hakjum = 'A';
        } else if (total/3.0 >= 80) {
            hakjum = 'B';
        } else if (total/3.0 >= 70) {
            hakjum = 'C';
        } else if (total/3.0 >= 60) {
            hakjum = 'D';
        } else {
            hakjum = 'F';
        }



        System.out.println("\n\n=== "+ name +"님의 성적결과 ===");
        System.out.println("1. 학번 : " + hakbun);
        System.out.println("2. 성명 : " + name);
        System.out.println("3. 국어 : " + kor);
        System.out.println("4. 영어 : " + eng);
        System.out.println("5. 수학 : " + math);
        System.out.println("6. 총점 : " + total);
        System.out.println("7. 평균 : " + Math.round((total/3.0)*10)/10.0);
        // Math.round() 는 my.day05.b.math 의 MathMain.java 파일을 참조!!
        System.out.println("8. 학점 : " + hakjum);
        System.out.println("9. 나이 : " + age + "세");

    }







}
