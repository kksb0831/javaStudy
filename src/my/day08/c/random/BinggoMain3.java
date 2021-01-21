package my.day08.c.random;

import java.util.Random;
import java.util.Scanner;

public class BinggoMain3 {
    public static void main(String[] args) {
        /*
            1 ~ 100

      59    50  1번시도
            50보다 큰값입니다.

            71  2번시도
            71보다 적은값입니다.

            60  3번시도
            60보다 적은값입니다.

            58  4번시도
            58보다 큰값입니다.

            59  5번시도
            빙고!!  5번만에 맞추었습니다.
         */

        int rndNum = 0, cnt = 0;
        System.out.println("==== 업 앤 다운 ====");

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        rndNum = (rnd.nextInt(100)+1);
        
        
        do {
            try {
                System.out.print("정답을 입력하세요 : ");
                int num = Integer.parseInt(sc.nextLine());
                if (num > 100 || num < 1) {
                    System.out.println("범위에 맞는 수를 입력해 주세요!!! (1 ~ 100)");
                }

                if (num > rndNum) {
                    cnt++;
                    System.out.println(num + "보다 작은 값입니다. " + cnt +"번 시도");

                } else if (num < rndNum) {
                    cnt++;
                    System.out.println(num + "보다 큰 값입니다. " + cnt +"번 시도");

                } else {
                    cnt++;
                    System.out.println("빙고!! " + cnt + "번만에 맞추었습니다.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("범위에 맞는 수를 입력해 주세요!!! (1 ~ 100)");
            }
        } while (true);
        sc.close();
    }
}
