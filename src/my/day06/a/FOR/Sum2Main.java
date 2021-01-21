package my.day06.a.FOR;

import java.util.Scanner;

public class Sum2Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (;;) {
            try {

                System.out.print(">> 누적해야할 시작 숫자 => ");
                int startNo = Integer.parseInt(sc.nextLine());
                //  startNo ==> 1   2   3

                System.out.print(">> 누적해야할 마지막 숫자 => ");
                int endNo = Integer.parseInt(sc.nextLine());
                // endNo ==> 10     9

                if (endNo <= startNo) {
                    System.out.println("누적 종료 숫자가 더 커야합니다!!");
                    continue;
                }

                int sum = 0;        // 누적의 합을 저장하는 변수를 0으로 초기화
                int cnt = endNo - startNo + 1; // 반복해야할 횟수


                for (int i = 0; i < cnt; i++, startNo++) {
                    sum += startNo;

                    if (startNo < endNo) {
                        System.out.print(startNo + "+");
                    } else {
                        System.out.println(startNo + " = " + sum);
                    }
                }

                System.out.println("누적한 값 : " + sum);
                break;


            } catch (NumberFormatException e) {
                System.out.println(">> 정수만 입력해주세요!! <<");
            }


        }
        sc.close();

        System.out.println("\n=== 프로그램 종료 ===");
    }
}
