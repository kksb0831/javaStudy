package my.day10.c.array;

public class TwoDimensionArrayMain {
    public static void main(String[] args) {

        // === 1차원 배열 ===
        int[] exArr = new int[5];


        /*
                        -------------------------
            index =>    | 0 | 1 | 2 | 3 | 4 | 5 |   1행 5열
                        -------------------------
         */


        // === 2차원 배열 ===
        int[][] pointArr = new int[4][3];


        /*
                        -------------------------
            index =>    | 0 | 1 | 2 | 3 | 4 | 5 |   1행 5열
                        -------------------------
                        -------------------------
            index =>    | 0 | 1 | 2 | 3 | 4 | 5 |   1행 5열
                        -------------------------
         */

        pointArr[0][0] = 10;
        pointArr[0][1] = 20;
        pointArr[0][2] = 30;

        pointArr[1][0] = 40;
        pointArr[1][1] = 50;
//        pointArr[1][2] = 60;

        pointArr[2][0] = 70;
        pointArr[2][1] = 80;
        pointArr[2][2] = 90;

//        pointArr[3][0] = 100;
//        pointArr[3][1] = 110;
//        pointArr[3][2] = 120;


        System.out.println("pointerArr.length => " + pointArr.length);
        // pointerArr.length => 4
        // 이차원 배열명의 행의 길이가 나온다.



        System.out.println("pointerArr[0].length => " + pointArr[0].length);
        // pointerArr[0].length => 3
        // 이차원 배열의 해당하는 행의 열의 길이가 나온다.


        System.out.println("pointerArr[1].length => " + pointArr[1].length);
        // pointerArr[1].length => 3
        // 이차원 배열의 해당하는 행의 열의 길이가 나온다.

        System.out.println("pointerArr[2].length => " + pointArr[2].length);
        // pointerArr[2].length => 3
        // 이차원 배열의 해당하는 행의 열의 길이가 나온다.

        System.out.println("pointerArr[3].length => " + pointArr[3].length);
        // pointerArr[3].length => 3
        // 이차원 배열의 해당하는 행의 열의 길이가 나온다.

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for (int i = 0; i < pointArr.length; i++) {     // 행
            for (int j = 0; j < pointArr[i].length; j++) { // 열
                System.out.print("[" + i + "]"+ "[" + j + "] => " + pointArr[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        for (int i = 0; i < pointArr.length; i++) {     // 행
            for (int j = 0; j < pointArr[i].length; j++) { // 열
                String str = (j < pointArr[i].length-1)? ", ": "";
                System.out.printf("%02d%s",pointArr[i][j],str);
            }
            System.out.println();
        }



        System.out.println("\n===============================\n");



        int[][] jumsuArr = {{90, 80, 70},   // 이순신
                            {80, 85, 76},   // 엄정화
                            {85, 70, 90},   // 서강준
                            {60, 80, 50}};  // 이혜리

        int[] totalArr = new int[jumsuArr.length];
        // 1. 각 학생별로 총점을 나타내어 보자.
        for (int i = 0; i < jumsuArr.length; i++) {
            for (int j = 0; j < jumsuArr[i].length; j++) {
                totalArr[i] += jumsuArr[i][j];
            }
        }


        for (int i : totalArr) {
            System.out.println(i);
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        int[] subjectArr = new int[jumsuArr[0].length];
        // 각 과목별 총점을 저장 시켜두는 곳


        for (int i = 0; i < jumsuArr.length; i++) {
            for (int j = 0; j < jumsuArr[i].length; j++) {
                subjectArr[j] += jumsuArr[i][j];
            }
        }

        for (int i : subjectArr) {
            System.out.println(i);
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("\n=== 각 과목별 평균 ===");
        System.out.println("----------------------");
        System.out.println("국어\t\t영어\t\t수학");
        System.out.println("----------------------");
        for (int i : subjectArr) {
                System.out.print(Math.round((double) i / jumsuArr.length*10)/10.0 + "\t");
        }






        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");



        // === 2차원 배열 ===
        int[][] numArr1 = new int[4][];

        /*
            numArr[0][0] = 10;  // 열의 크기를 설정하지 않았으므로 NullPointException  이 발생한다.
            numArr[0][1] = 20;
            numArr[0][2] = 30;
        */
        numArr1[0] = new int[3];
        numArr1[1] = new int[2];
        numArr1[2] = new int[4];
        numArr1[3] = new int[3];

        numArr1[0][0] = 10;
        numArr1[0][1] = 20;
        numArr1[0][2] = 30;

        numArr1[1][0] = 40;
        numArr1[1][1] = 50;
//        numArr[1][2] = 60;    java.lang.ArrayIndexOutOfBoundsException 발생

        numArr1[2][0] = 70;
        numArr1[2][2] = 90;

        for (int i = 0; i < numArr1.length; i++) {
            for (int j = 0; j < numArr1[i].length; j++) {
                String str = (j < numArr1[i].length - 1)? ",":"";
                System.out.printf("%d%s",numArr1[i][j] , str);
            }
            System.out.println();
        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        // === 2차원 배열 ===
        int[][] numArr2 = { {10, 20, 30},
                            {40, 50},
                            {70, 0, 90, 0},
                            {0, 0, 0}};


        for (int i = 0; i < numArr2.length; i++) {
            for (int j = 0; j < numArr2[i].length; j++) {
                String str = (j < numArr2[i].length - 1)? ",":"";
                System.out.printf("%d%s",numArr2[i][j] , str);
            }
            System.out.println();
        }

    }
}
