package my.day08.b.DOWHILE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberMain3 {

    // === 소수란? ===
    // 소수란? 1과 자기 자신으로밖에 나누어지지 않는 1 이외의 정수
    // 예> 1 부터 10까지의 소수를 나타내면
    //    2%2 ==> 0   2 는 소수
    //    3%3 ==> 0   3 는 소수
    //    4%2 ==> 0   4 는 소수가 아님
    //    5%5 ==> 0   5 는 소수
    //    6%2 ==> 0   6 는 소수가 아님
    //    7%7 ==> 0   7 는 소수
    //    8%2 ==> 0   8 는 소수가 아님
    //    9%3 ==> 0   9 는 소수가 아님
    //   10%2 ==> 0  10 는 소수가 아님



    public static void main(String[] args) {

        /*
           ==실행결과==
            ▷시작 자연수 : 1엔터
            ▷끝 자연수 : 20엔터
         1 부터 20 까지의 소수는?
         2 3 5 7 11 13 17 19

         1부터 20 까지의 소수의 개수? 8개

         1부터 20 까지의 소수들의 합? 77

         === 프로그램 종료 ===
       */
        String resultStr = "";
        int startNo, endNo, sum = 0, cntPrime = 0;


        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.print("▷시작자연수 : ");
                startNo = sc.nextInt();
                sc.nextLine();

                System.out.print("▷끝 자연수 : ");
                endNo = sc.nextInt();
                sc.nextLine();

                if (endNo <=0 || startNo <=0) {
                    System.out.println(">> 자연수를 입력하세요!!! <<");
                }else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println(">> 자연수를 입력하세요!!! <<");
                sc.nextLine();
            }
        } while (true);
        sc.close();

        for (int i = startNo; i <= endNo; i++) {
            boolean isSosu = true;
            if (i==1) {
                continue;
            }
            for (int j = 2; j < i ; j++) {
                if (i%j == 0 ) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                cntPrime++;
                resultStr += (cntPrime <= 1)? i :  ", " + i;
                sum += i;
            }
        }

        System.out.println(startNo +"부터 " + endNo + "까지의 소수는?\n" + resultStr);
        System.out.println(startNo +"부터 " + endNo + "까지의 소수의 개수? : " + cntPrime);
        System.out.println(startNo +"부터 " + endNo + "까지의 소수들의 합? : " + sum);

        System.out.println("\n=== 프로그램 종료 ===");
    }
}
