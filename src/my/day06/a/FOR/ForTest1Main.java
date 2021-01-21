package my.day06.a.FOR;
        /*
             **** 반복문(loop) ==> for 문 ****

                      ※ for 문의 형식

                for(초기화; 조건식; 증감식) {
                      반복해서 실행할 문장;
                }

                           ▣ 순서
                1) 초기화;
                2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.
                                          조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                           } 을 빠져나간다.)
                3) 증감식
                4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.
                                          조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                           } 을 빠져나간다.)
                5) 증감식
                6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.
                                          조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                           } 을 빠져나간다.)

        */
public class ForTest1Main {
    public static void main(String[] args) {



        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + ". 안녕자바~~");
        }




        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        for (int i = 0; i < 10; i+=1) {
            System.out.println(i+1 + ". 안녕 Java~~");
        }



        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        for (int i = 0; i < 10; i++) {
            System.out.println(i++ + ". 안녕 인텔리제이~~");
        }
        /*
            ++i                     i++
            1. 안녕 인텔리제이~~       0. 안녕 인텔리제이~~
            3. 안녕 인텔리제이~~       2. 안녕 인텔리제이~~
            5. 안녕 인텔리제이~~       4. 안녕 인텔리제이~~
            7. 안녕 인텔리제이~~       6. 안녕 인텔리제이~~
            9. 안녕 인텔리제이~~       8. 안녕 인텔리제이~~
         */




        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        for (int i = 0; i < 10; i+=2) {
            System.out.println((i+1) + ". 안녕 Inteli J~~");
        }
        /*
            1. 안녕 Inteli J~~
            3. 안녕 Inteli J~~
            5. 안녕 Inteli J~~
            7. 안녕 Inteli J~~
            9. 안녕 Inteli J~~
         */





        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        for (int i = 0, j = 0; i < 10; i++,j+=2) {
            System.out.println((j+1) + ". 안녕 오라클~~");
        }
        /*
            1. 안녕 오라클~~
            3. 안녕 오라클~~
            5. 안녕 오라클~~
            7. 안녕 오라클~~
            9. 안녕 오라클~~
            11. 안녕 오라클~~
            13. 안녕 오라클~~
            15. 안녕 오라클~~
            17. 안녕 오라클~~
            19. 안녕 오라클~~
         */




        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        for (int i = 10; i > 0; i--) {
            System.out.println(i + ". 안녕 오라클~~");
        }
        /*
            10. 안녕 오라클~~
            9. 안녕 오라클~~
            8. 안녕 오라클~~
            7. 안녕 오라클~~
            6. 안녕 오라클~~
            5. 안녕 오라클~~
            4. 안녕 오라클~~
            3. 안녕 오라클~~
            2. 안녕 오라클~~
            1. 안녕 오라클~~
         */



        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        for (int i = 10; i > 0; i-=1) {
            System.out.println(i + ". 안녕 스프링~~");
        }
        /*
            10. 안녕 스프링~~
            9. 안녕 스프링~~
            8. 안녕 스프링~~
            7. 안녕 스프링~~
            6. 안녕 스프링~~
            5. 안녕 스프링~~
            4. 안녕 스프링~~
            3. 안녕 스프링~~
            2. 안녕 스프링~~
            1. 안녕 스프링~~
         */




        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");



        for (int i = 10; i > 0; i-=2) {
            System.out.println((i-1) + ". 안녕 Spring~~");
        }
        /*
            9. 안녕 Spring~~
            7. 안녕 Spring~~
            5. 안녕 Spring~~
            3. 안녕 Spring~~
            1. 안녕 Spring~~
         */

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 10; i > 0; i--) {
            if (i%2 != 0) {
                System.out.println(i + ". 안녕하십니까?~~");
            }
        }
        /*
            9. 안녕하십니까?~~
            7. 안녕하십니까?~~
            5. 안녕하십니까?~~
            3. 안녕하십니까?~~
            1. 안녕하십니까?~~
         */






        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");




        for (int i = 10; i > 0; i--) {
            System.out.println(--i + ". Hello~~");
        }
        /*
            9. Hello~~
            7. Hello~~
            5. Hello~~
            3. Hello~~
            1. Hello~~
         */




        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");




        for (int i = 0, j = 9; i < 5; i++,j-=2) {
            System.out.println(j + ". 헬로~~");
        }
        /*
            9. 헬로~~
            7. 헬로~~
            5. 헬로~~
            3. 헬로~~
            1. 헬로~~
         */




        System.out.println("=========================");



        int n = 0;

        for (; n < 5; n++) {
            System.out.println((n+1) + ". 서강준");
        }

        System.out.println("n => " + n);




        System.out.println("\n~~~프로그램 종료 ~~~");
    }
}
