package my.day04.a.scanner;

public class Calculator {
    public Calculator() {

    }
    String plus(int num1, int num2) {
        String result;
        result = num1 + " + " + num2 + " = " + (num1 + num2);

        return result;
    }

    String minus(int num1, int num2) {
        String result;
        result = num1 + " - " + num2 + " = " + (num1 - num2);

        return result;
    }

    String multiply(int num1, int num2) {
        String result;
        result = num1 + " × " + num2 + " = " + (num1 * num2);

        return result;
    }
    String devide(int num1, int num2) {
        String result;

        if (num2 == 0) {
            result = "분모에는 0이 들어올 수 없습니다!!";

        } else {
            result = num1 + " ÷ " + num2 + " = " + ((double) num1 / num2);
        }
        return result;
    }


}
