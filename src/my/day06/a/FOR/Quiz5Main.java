package my.day06.a.FOR;

import java.util.Scanner;

public class Quiz5Main {
    public static void main(String[] args) {

        // 첫 번째 정수 : 2
        // 두 번째 정수 : 10

        // >> 결과 <<
        // 2부터 10까지의 홀수의 합 : 24
        // 2부터 10까지의 짝수의 합 : 30
        Scanner sc = new Scanner(System.in);

        for (;;) {
            try {
                System.out.print("첫 번째 정수 : ");     // 2
                String strNum1 = sc.nextLine();
                int num = Integer.parseInt(strNum1);
//                int num1 = Integer.parseInt(sc.nextLine());
                int oddNum = 0;
                int evenNum = 0;

                if (num%2 == 0) {   // 첫번째 입력받은 값이 짝수라면
                    oddNum = num + 1;
                    evenNum = num;
                } else {            // 첫번째 입력받은 값이 홀수라면
                    oddNum = num;
                    evenNum = num + 1;
                }

                System.out.print("두 번째 정수 : ");     //10
                String strNum2 = sc.nextLine();
                int num2 = Integer.parseInt(strNum2);
//                int num2 = Integer.parseInt(sc.nextLine());
                int evenSum = 0, oddSum = 0;// 짝수 합계, 홀수 합계

                if (num >= num2) {         // 뒤의 숫자가 더큰경우 오류 처리
                    System.out.println(">> 첫 번째 정수는 두 번째 정수보다 작아야합니다!! <<\n");
                    continue;
                    }

//                for (int i = num1; i <= num2; i++) {
//                    if (i % 2 == 0) {       // 첫번째 입력받은 값이 짝수라면
//                        evenSum += i;
//                    } else {                // 첫번째 입력받은 값이 홀수라면
//                        oddSum += i;
//                    }
//                }


                // *교육 버전*
                // == 홀수, 짝수의 합을 구한다 ==
                for (;;) {
                    // 홀수의 합을 구한는데 첫번째로 입력한 값이
                    // num1 -> 2 (짝수) 이라면
                    // num1은 1을 더한 후(즉, 3으로 만듬) 2씩 증가시켜주면 된다.

                    // 홀수의 합을 구한는데 첫번째로 입력한 값이
                    // num1 -> 3 (홀수) 이라면
                    // num1을 2씩 증가시켜주면 된다.

                    if (oddNum <= num2) {
                        oddSum += oddNum;
                    }
                    if (evenNum <= num2) {
                        evenSum += evenNum;
                    }
                    if (oddNum > num2 && evenNum > num2) {
                        break;
                    }
                    oddNum += 2;
                    evenNum += 2;
                }



                System.out.println("\n\n>> 결과 <<");
                System.out.println(strNum1 + "부터 " + strNum2 + "까지의 홀수의 합 : " + oddSum);
                System.out.println(strNum1 + "부터 " + strNum2 + "까지의 짝수의 합 : " + evenSum);

//                System.out.println(num1 + "부터 " + num2 + "까지의 홀수의 합 : " + oddSum);
//                System.out.println(num1 + "부터 " + num2 + "까지의 짝수의 합 : " + evenSum);
                break;

            } catch (NumberFormatException e) {
                System.out.println(">> 정수를 입력하세요!! <<\n");
            }

        }
        sc.close();
    }
}
