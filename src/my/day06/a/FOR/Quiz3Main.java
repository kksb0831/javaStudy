package my.day06.a.FOR;

public class Quiz3Main {
    public static void main(String[] args) {

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        for (int i = 0; i < 10; i++) {
            String str = (i<9)? ", " : "";
            System.out.print( (i+1) + str);
        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        // 5, 6, 7, 8, 9, 10, 11, 12, 13, 14

        int n = 5;
        for (int i = 0; i < 10; i++) {
            String str = (i<9) ? ", " : "\n";
            System.out.print((n+i) + str);
        }

        for (int i = 5; i < 15; i++) {
            String str = (i<14) ? ", " : "\n";
            System.out.print(i + str);
        }



        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        for (int i = 1; i < 20; i++) {
            // 3의 배수만 출력
            String str = (i<17) ? ", " : "\n";
            if (i%3 == 0) {
                System.out.print(i + str);
            }
        }
        // 3, 6, 9, 12, 15, 18


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        int sum = 0;
        n = 20;
        for (int i = 1; i < n; i++) {
            // 3의 배수만 출력
            if (i%3 == 0) {
                sum += i;
                String str = (i < (n-3)) ? " + " : " = " + sum + "\n";
                System.out.print(i + str);
            }
        }
        // 3 + 6 + 9 + 12 + 15 + 18 = 63
    }
}
