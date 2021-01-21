package my.day04.b.scanner;

import java.util.Scanner;

public class SungjukMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Sungjuk sj = new Sungjuk();
        int inputType = 0;


        try {

            System.out.print("1. 학번 : ");
            sj.hakbun = sc.nextLine();

            System.out.print("2. 성명 : ");
            sj.name = sc.nextLine();

            //  === *** 유효성 검사하기(올바른 데이터인지 틀린 데이터인지 검사하는 것) *** ===



            inputType = 1;      // inputType 값이 1이라면 국,영,수를 입력하는 중이다.
            System.out.print("3. 국어 : ");
            byte kor = Byte.parseByte(sc.nextLine());

            if (!sj.checkJumsu(kor)) {
                sc.close();
                return;
            } else {
                sj.kor = kor;
            }

            System.out.print("4. 영어 : ");
            byte eng = Byte.parseByte(sc.nextLine());

            if (!sj.checkJumsu(eng)) {
                sc.close();
                return;
            } else {
                sj.eng = eng;
            }

            System.out.print("5. 수학 : ");
            byte math = Byte.parseByte(sc.nextLine());

            if (!sj.checkJumsu(math)) {
                sc.close();
                return;
            } else {
                sj.math = math;
            }


            inputType = 2;      // inputType 값이 2이라면 나이를 입력하는 중이다.
            System.out.print("6. 나이 : ");
            short age = Short.parseShort(sc.nextLine());

            if (!sj.checkAge(age)) {
                sc.close();
                return;
            } else {
                sj.age = age;
            }

            sj.showInfo();
            /*
                === 이순신님의 성적결과 ===
                1. 학번 : 091234
                2. 성명 : 이순신
                3. 국어 : 90
                4. 영어 : 80
                5. 수학 : 78
                6. 총점 : 248
                7. 평균 : 82.666666666666666..
                8. 학점 : B
                9. 나이 : 20
             */

        } catch (NumberFormatException e) {
            if (inputType == 1) {
                System.out.println(">> 올바른 점수를 입력하세요.(점수입력은 0~100 까지 가능) <<");
//                e.printStackTrace();
            } else if (inputType == 2) {
                System.out.println(">> 올바른 나이를 입력하세요.(나이는 20 ~ 50까지 가능) <<");
//                e.printStackTrace();
            }
        }


        sc.close();
    }
}
