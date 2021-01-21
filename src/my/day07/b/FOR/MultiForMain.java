package my.day07.b.FOR;

public class MultiForMain {
    public static void main(String[] args) {

        // 다중 for문에 대해서 알아본다.
        /*
            abcdefg
            hijklmn
            opqrstu
         */


        char ch = 'a';
        for (int i = 0; i < 4; i++) {   // 외부 for문 ==> 행


                for (int j = 0; j < 7; j++) {   // 내뷰 for문 ==> 열
                    System.out.print(ch++);
                    if (ch > 'z') {
                        break;
                    }
                }

            System.out.println();
        }


        System.out.println("\n~~~~~~~~~~~~~~~~\n");


        ch = 'a';

        for (int i = 0,j=0; i < 3; j++) {
            if (j < 7) {
                System.out.print(ch++);
            } else {
                i++;
                j = -1;
                System.out.println();
            }

        }




        System.out.println("\n~~~~~~~~~~~~~~~~\n");

        /*
            [0,0][0,1][0,2]  4행3열
            [1,0][1,1][1,2]
            [2,0][2,1][2,2]
            [3,0][3,1][3,2]
         */


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "," + j+"]");
            }
            System.out.println();
        }



        System.out.println("\n~~~~~~~~~~~~~~~~\n");

        /*
            [0,0][0,1][0,2]  3행 3열
            [1,0][1,1][1,2]
            [3,0][3,1][3,2]
         */


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 2) {
                    continue;
                }
                System.out.print("[" + i + "," + j+"]");
            }
            if (i!=2) {
                System.out.println();
            }
        }



        System.out.println("\n~~~~~~~~~~~~~~~~\n");

        /*
            [0,0][0,2]  2행 3열
            [1,0][1,2]
            [2,0][2,2]
            [3,0][3,2]
         */


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==1) {
                    continue;
                }
                System.out.print("[" + i + "," + j+"]");
            }
            System.out.println();
        }




        System.out.println("\n~~~~~~~~~~~~~~~~\n");
        System.out.println("안녕하세요\t내일\t또\t뵐께요~~");
        // "\t" 키보드의 탭

        /*
            501호    502호    503호    505호
            301호    302호    303호    305호
            201호    202호    203호    205호
            101호    102호    103호    105호
         */


        for (int i = 5; i > 0; i--) {
            if (i == 4){
                continue;
            }
            for (int j = 1; j < 6; j++) {
                if (j == 4) {
                    continue;
                } else {
                    System.out.print(i+"0"+j+"호\t");
                }
            }
            System.out.println();
        }

    }
}
