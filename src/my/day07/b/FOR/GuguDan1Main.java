package my.day07.b.FOR;

import java.util.Scanner;

public class GuguDan1Main {
    public static void main(String[] args) {

        /*
            >> 몇단볼래? => 8 Enter

            == 8단 ==
            8*1=8
            8*2=16
            8*3=24
            8*4=32
            8*5=40
            8*6=48
            8*7=56
            8*8=64
            8*9=72

            >> 또 하시겠습니까? [Y/N] => y || Y => 처음으로

            >> 몇단볼래? => 1.34 Enter
            >>> 2단부터 9단까지만 가능합니다 <<<



            >> 몇단볼래? => 3 Enter

            == 8단 ==
            생략
            >> 또 하시겠습니까? [Y/N] => s || S
            >>> Y 또는 N 만 가능합니다!! <<<

            >> 또 하시겠습니까? [Y/N] => n || N

            == 프로그램 종료
         */

        Scanner sc = new Scanner(System.in);
        /*
            === 레이블을 사용하여 break; 하기 ===
            레이블명 뒤에는 : 을 붙이면 반드시 반복문 앞에 써야 한다.
         */

        outer:
        for (;;) {

            try {
                System.out.print(">> 몇단을 보시겠습니까? => ");
                String strDan = sc.nextLine();
                int dan = Integer.parseInt(strDan);

                if (dan >= 2 && dan <=9) {
                    System.out.println("=== " + dan + "단 ===");
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(dan + "×" + i +" = "+ (dan*i));
                    }
                } else {
                    System.out.println(">>> 2단부터 9단까지만 가능합니다 <<<");
                    continue;
                }
                String retry ="";
                for (;;) {
                    System.out.print(">> 또 하시겠습니까? [Y/N] : ");
                    retry = sc.nextLine();
                    if ("Y".equalsIgnoreCase(retry)) {
                        break;
                    } else if ("N".equalsIgnoreCase(retry)) {
                        System.out.println("== 프로그램 종료 ==");
                        sc.close();
                        break outer;
                    } else {
                        System.out.println(">>> Y 또는 N 만 가능합니다!! <<<");
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println(">>> 2단부터 9단까지만 가능합니다 <<<");
            }
        }
    }
}
