package my.day07.b.FOR;

public class HomeworkMain {
    public static void main(String[] args) {

        System.out.println("\n~~~~~~~~~~숙제 1~~~~~~~~~~~~~~");

//== 숙제 1 ==
//*
//**
//***
//****
//*****


        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n~~~~~~~~~~숙제 2~~~~~~~~~~~~~~");


//== 숙제 2 ==
//       *
//      **
//     ***
//    ****
//   *****

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n~~~~~~~~~~숙제 3~~~~~~~~~~~~~~");



//== 숙제 3 ==
//*****
//****
//***
//**
//*

        for (int i = 5; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }





        System.out.println("\n~~~~~~~~~~숙제 4~~~~~~~~~~~~~~");


//== 숙제 4 ==
//
//   *
//  ***
// *****


        for (int i = 0, k = 5; i < 5; i+=2, k-=2) {
            for (int j = 0; j <= k/2 ; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }





        System.out.println("\n~~~~~~~~~~숙제 5~~~~~~~~~~~~~~");

//== 숙제 5 ==
//
//  *****
//   ***
//    *


        for (int i = 5, k = 0; i > 0; i-=2, k+=2) {
            for (int j = 0; j <= k/2 ; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }




        System.out.println("\n~~~~~~~~~~숙제 6~~~~~~~~~~~~~~");

// == 숙제 6 ==
//
//        *
//       ***
//      *****
//       ***
//        *

        int n = 5;

        for (int i = 0, k = n, a =0; i < n; i++) {
            if (i <= n/2) {
                for (int j = 0; j < k/2; j++) {
                    System.out.print(" ");
                }
                for (int x = 0; x <= a ; x++) {
                    System.out.print("*");
                }
                k-=2;
                a+=2;
            } else {    // a = 6, k = -1
                k+=2;   // a = 4, k = 1
                a-=2;
                for (int j = 0; j <= k/2; j++) {
                    System.out.print(" ");
                }
                for (int y = 1; y < a; y++) {
                    System.out.print("*");
                }

            }

            System.out.println();
        }







        System.out.println("\n~~~~~~~~~~입사문제~~~~~~~~~~~~~~");

//        == 입사문제 ==
//
//        *********1
//        ********2
//        *******3
//        ******4
//        *****5
//        ****6
//        ***7
//        **8
//        *9


        for (int i = 9; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(10 - i);
            System.out.println();
        }




        /*
            == 입사문제2 ==

            == 구구단 3단씩 끊기 ==

                1*1=1   2*1=2   3*1=3
                1*2=2   2*2=4   3*2=6
                1*3=3   2*3=6   3*3=9
                1*4=4   2*4=8   3*4=12
                1*5=5   2*5=10   3*5=15
                1*6=6   2*6=12   3*6=18
                1*7=7   2*7=14   3*7=21
                1*8=8   2*8=16   3*8=24
                1*9=9   2*9=18   3*9=27

                4*1=4   5*1=5   6*1=6
                4*2=8   5*2=10   6*2=12
                4*3=12   5*3=15   6*3=18
                4*4=16   5*4=20   6*4=24
                4*5=20   5*5=25   6*5=30
                4*6=24   5*6=30   6*6=36
                4*7=28   5*7=35   6*7=42
                4*8=32   5*8=40   6*8=48
                4*9=36   5*9=45   6*9=54

                7*1=7   8*1=8   9*1=9
                7*2=14   8*2=16   9*2=18
                7*3=21   8*3=24   9*3=27
                7*4=28   8*4=32   9*4=36
                7*5=35   8*5=40   9*5=45
                7*6=42   8*6=48   9*6=54
                7*7=49   8*7=56   9*7=63
                7*8=56   8*8=64   9*8=72
                7*9=63   8*9=72   9*9=81

                ~~~~~ 구구단 4단씩 끊기(!!입사문제!!) ~~~~~

                2*1=2   3*1=3   4*1=4   5*1=5
                2*2=4   3*2=6   4*2=8   5*2=10
                2*3=6   3*3=9   4*3=12   5*3=15
                2*4=8   3*4=12   4*4=16   5*4=20
                2*5=10   3*5=15   4*5=20   5*5=25
                2*6=12   3*6=18   4*6=24   5*6=30
                2*7=14   3*7=21   4*7=28   5*7=35
                2*8=16   3*8=24   4*8=32   5*8=40
                2*9=18   3*9=27   4*9=36   5*9=45

                6*1=6   7*1=7   8*1=8   9*1=9
                6*2=12   7*2=14   8*2=16   9*2=18
                6*3=18   7*3=21   8*3=24   9*3=27
                6*4=24   7*4=28   8*4=32   9*4=36
                6*5=30   7*5=35   8*5=40   9*5=45
                6*6=36   7*6=42   8*6=48   9*6=54
                6*7=42   7*7=49   8*7=56   9*7=63
                6*8=48   7*8=56   8*8=64   9*8=72
                6*9=54   7*9=63   8*9=72   9*9=81
         */
        System.out.println("\n~~~~~~~~~~입사문제2~~~~~~~~~~~~~~");

        System.out.println("== 구구단 3단씩 끊기 ==");

        for (int i = 1; i <= 9; i+=3) {
            for (int j = 1; j <= 9; j++) {
                for (int k = i; k < i+3; k++) {
                    System.out.print(k + "*" + j  +"=" + (k*j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }



        System.out.println("== 구구단 4단씩 끊기 ==");

        for (int i = 2; i <= 9; i+=4) {
            for (int j = 1; j <= 9; j++) {
                for (int k = i; k < i+4; k++) {
                    System.out.print(k + "*" + j  +"=" + (k*j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
