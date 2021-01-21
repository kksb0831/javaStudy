package my.day06.a.FOR;

public class Sum1Main {
    public static void main(String[] args) {

        int sum = 0;    // 누적의 합


        // 0+1 ==> 1번 반복
        // 0+1+2 ==> 2번 반복
        // 0+1+2+3 ==> 3번 반복
        // 0+1+2+3+4 ==> 4번 반복
        // 0+1+2+3+4+5 ==> 5번 반복
        // 0+1+2+3+4+5+6 ==> 6번 반복
        // 0+1+2+3+4+5+6+7 ==> 7번 반복
        // 0+1+2+3+4+5+6+7+8 ==> 8번 반복
        // 0+1+2+3+4+5+6+7+8+9 ==> 9번 반복
        // 0+1+2+3+4+5+6+7+8+9+10 ==> 10번 반복


        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10의 합계" + sum);


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

        sum = 0;


        for (int i = 1; i <= 10; i++) {
            sum +=i;
            System.out.print(i);
            if (i<10) {
                System.out.print("+");
            }else {
                System.out.println("=" + sum);
            }
        }
        // 1+2+3+4+5+6+7+8+9+10=55


        sum = 0;
        String str = "";
        for (int i = 1; i <= 10; i++) {
            sum += i;
            if (i<10) {
                str += i + "+";
            } else {
                str += i + "=" + sum;
            }
        }
        System.out.println(str);


        sum = 0;
        str = "";
        for (int i = 1; i <= 10; i++) {
            sum += i;
            if (i == 1) {
                str += i;
            }
            System.out.println(str + " ==> " + i +"번 반복");
            str += "+" + (i+1);
        }


    }
}
