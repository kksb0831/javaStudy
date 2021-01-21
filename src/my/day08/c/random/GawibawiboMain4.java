package my.day08.c.random;

import java.util.Random;
import java.util.Scanner;

public class GawibawiboMain4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int userNum = 0;

        do {
            System.out.println("======== 메뉴 ========");
            System.out.println("1. 가위\t2. 바위\t3. 보\t4. 게임종료");
            System.out.println("=====================");
            System.out.print(">> 선택하세요 => ");
            try {
                userNum = Integer.parseInt(sc.nextLine());
                if (userNum < 1 || userNum >4) {
                    System.out.println("▷ 메뉴에 존재하지 않는 번호입니다. (1~4)");
                    continue;
                }
                if (userNum != 4) {

                    int botNum = rnd.nextInt(3)+1;
                    System.out.println(GawibawiboMain4.checkWin(userNum, botNum));

                }

            } catch (NumberFormatException e) {
                System.out.println("▷ 숫자로만 입력하세요!! (1~4)");
            }


        } while (userNum != 4);

        sc.close();
        System.out.println("\n~~~~~ 프로그램 종료 ~~~~");
    }
    //1. 가위 2. 바위 3. 보
    static String checkWin(int userNum, int botNum) {
        if ((botNum == 1 && userNum == 3) ||
            (botNum == 2 && userNum == 1) ||
            (botNum == 3 && userNum == 2)) {
          return ">> 사용자님이 졌습니다!!";
        } else if ( (botNum == 1 && userNum == 2) ||
                    (botNum == 2 && userNum == 3) ||
                    (botNum == 3 && userNum == 1)) {
            return ">> 사용자님이 이겼습니다!!";
        } else {
            return ">> 사용자님과 비겼습니다!!";
        }


    }

}
