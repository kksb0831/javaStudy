package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner5Main {
    public static void main(String[] args) {
        int num1, num2;
        String inputStr = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("== 2개의 숫자를 입력받아서 더한 결과 알아보기 ==");

        try {
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            inputStr = sc.nextLine();
            num1 = Integer.parseInt(inputStr);

            System.out.print("두번째 숫자를 입력해주세요 : ");
            inputStr = sc.nextLine();
            num2 = Integer.parseInt(inputStr);

            Calculator calc = new Calculator();


            String result = calc.plus(num1,num2);
            // 10 + 20 = 30
            System.out.println(">> 결과 : " + result + " <<");

            result = calc.minus(num1,num2);
            // 10 - 20 = -10
            System.out.println(">> 결과 : " + result + " <<");

            result = calc.multiply(num1,num2);
            // 10 × 20 = 200
            System.out.println(">> 결과 : " + result + " <<");

            result = calc.devide(num1,num2);
            // 10 ÷ 20 = 0.5
            System.out.println(">> 결과 : " + result + " <<");


        } catch (NumberFormatException e) {
            System.out.println(inputStr + "은 정수가 아닙니다. 정수를 입력하세요!!");
        }


        sc.close();
    }


}
