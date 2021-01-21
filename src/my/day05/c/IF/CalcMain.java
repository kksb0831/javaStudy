package my.day05.c.IF;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫 번째 정수 입력 => ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("두 번째 정수 입력 => ");
            int num2 = Integer.parseInt(sc.nextLine());
            char operator;
            String result = null;
            System.out.print("사칙연산자 선택(+ = * /) => ");
            String s = sc.nextLine();
            if (s.length()==1) {
                if (s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == '*' || s.charAt(0) == '/') {
                    operator = s.charAt(0);
                }else {
                    System.out.println("정확한 사칙 연산자를 입력해 주세요!!");
                    sc.close();
                    return;
                }
            } else {
                System.out.println("한 글자만 입력해주세요");
                sc.close();
                return;
            }


            if ('+' == operator) {
                result = String.valueOf(num1 + num2);
            } else if ('-' == operator) {
                result = String.valueOf(num1 + num2);
            } else if ('*' == operator) {
                result = String.valueOf(num1 * num2);
            } else if ('/' == operator) {
                result = (num2 ==0)?"분모에는 0이 들어올 수 없습니다.":String.valueOf((double) num1 / num2);
            } else {
                System.out.println(">>> 사칙연산만 입력하세요!!(+ - * /) <<<");
                return;
            }


            System.out.println(num1 + String.valueOf(operator) + num2 + " = " + result);


            sc.close();
        } catch (NumberFormatException e) {
            System.out.println(">>> 정수만 입력하세요!! <<<");
        }

    }
}
