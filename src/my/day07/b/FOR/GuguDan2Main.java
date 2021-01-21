package my.day07.b.FOR;

public class GuguDan2Main {
    public static void main(String[] args) {
        /*
         == 구구단 ==
         2*1=2   3*1=3   4*1=4   ....   9*1=9
         2*2=4   3*2=6   4*2=8   ....   9*2=18
         2*3=6   3*3=9   4*3=12   ....   9*3=27
         2*4=8   3*4=12   4*4=16   ....   9*4=36
         2*5=10   3*5=15   4*5=20   ....   9*5=45
         2*6=12   3*6=18   4*6=24   ....   9*6=54
         2*7=14   3*7=21   4*7=28   ....   9*7=63
         2*8=16   3*8=24   4*8=32   ....   9*8=72
         2*9=18   3*9=27   4*9=36   ....   9*9=81
      */

        // 9행 8열
        // row(행)   col(열)


        System.out.printf("%30s\n","== 구구단 ==");
        for (int row = 1; row <= 9; row++) {
            for (int col = 2; col <= 9; col++) {
//                System.out.print(col + "×" + row + "="+(row*col) +"\t");
                System.out.printf(col + "×" + row + "=" + "%-4d", row*col);
            }
            System.out.println();
        }








    }
}
