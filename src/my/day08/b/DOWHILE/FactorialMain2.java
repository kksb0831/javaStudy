package my.day08.b.DOWHILE;

import java.util.Scanner;

public class FactorialMain2 {
    public static void main(String[] args) {

        // === 입사문제 ===
        /*
            >> 알고 싶은 팩토리얼 수 입력 => 5 Enter
            >> 5! = 120
            // 5 * 4 * 3 * 2 * 1
         */


        Scanner sc = new Scanner(System.in);



        do {
            try {
                System.out.print(">> 알고 싶은 팩토리얼 수 입력 => ");
                int num = Integer.parseInt(sc.nextLine());
                if (num <= 0){
                    System.out.println(">> 자연수를 입력하세요!! <<");
                    continue;
                }

                int result = 1;
                String str = "";
                for (int i = num; i > 0; i--) {
                    result *= i;
                    str += (i > 1)? i + "*": i + "=";
                }

                System.out.println(num+"! = " + str + result);




                break;
                } catch (NumberFormatException e) {
                    System.out.println(">> 자연수를 입력하세요!! <<");
                }
        } while (true);
        sc.close();
        System.out.println("\n~~~~ 프로그램 종료!! ~~~~");
    }
}
