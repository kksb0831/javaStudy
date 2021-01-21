package my.day08.a.WHILE;

public class WhileMain {
    public static void main(String[] args) {
        /*
           === while 문 형식 ===

           변수의 초기화;

           while(조건식) {
              조건식이 참(true)이라면 반복해서 실행할 명령문을 실행하고,
              조건식이 거짓(false)이라면 while의 { } 이부분을 빠져나간다.

              반복해서 실행할 명령문;
              증감식;
           }
        */




        int cnt =5, loop=0;

        while (cnt > loop) {
            System.out.println("안녕 자바~~");
            loop++;
        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        cnt = 5;
        loop = 0;

        while (loop++ < cnt) {
            System.out.println(loop + ". Hello, Java~~");
        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        cnt = 5;
        loop = 0;

        while (loop < cnt) {
            System.out.println(++loop + ". Hello, InteliJ~~");
        }



        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        loop = 0;

        while (true) {
            System.out.println(++loop + ". Hello, 인텔리 제이~~");
            if (loop == 5) break;
        }



        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        loop = 0;

        while (!(++loop > 5)) {     // !( ) ==>> 괄호( ) 속에는 while 반복문을 빠져나갈 조건식의 정의를 내려주는 것이다.
            System.out.println(loop + ". Hello, Spring~~");
        }


        /*
            1. Hi Oracle~~
            3. Hi Oracle~~
            5. Hi Oracle~~
            7. Hi Oracle~~
            9. Hi Oracle~~
         */


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        loop = 0;

        while (true) {
            if (++loop > 10) {
                break;
            }
            if (loop%2 == 0) {
                continue;
            }
            System.out.println(loop + ". Hello,  Oracle~~");

        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        int i = 0;
        while (i < 9) {
            ++i;
            System.out.println(5 + "*" + i + " = "+ (5*i));
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        i = 0;
        while (true) {
            if (++i > 9) break;
            System.out.println(6 + "*" + i + " = "+ (6*i));
        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        i = 0;
        while (!(++i > 9)) {
            System.out.println(7 + "*" + i + " = "+ (7*i));
        }




        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        System.out.printf("%35s\n","=== 구구단 ===");

        // raw 행 col 열
        // 9행 8열
        // jul dan


        int jul = 0, dan = 1;


        while (!(++jul > 9)) {  // 9행
            while (!(++dan > 9)) {
                String str = (dan < 9)? "\t" :"\n" ;
                System.out.print(dan + "*" + jul + "=" + (dan*jul) + str);

            }
            dan = 1;

        }

        System.out.println("\n=== 프로그램 종료 ===");
    }
}
