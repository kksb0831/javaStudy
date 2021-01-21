package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner4Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("== 2개의 숫자를 입력받아서 더한 결과 알아보기 ==");
        String inputStr = "";
        int num1 = 0, num2 = 0;
        try {

            System.out.print("1. 첫번째 정수 : ");
            inputStr = sc.nextLine();
            num1 = Integer.parseInt(inputStr);

            System.out.print("1. 두번째 정수 : ");
            inputStr = sc.nextLine();
            num2 = Integer.parseInt(inputStr);

            System.out.println(">> 더한 결과 : "+ num1 + " + " + num2 + " = " + (num1 + num2) + " <<");

        } catch (NumberFormatException e) {

            System.out.println(">> " + inputStr + "는 정수가 아닙니다. 정수를 입력하세요!! <<");
        }

        sc.close();
    }
}
