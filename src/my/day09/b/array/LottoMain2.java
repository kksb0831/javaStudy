package my.day09.b.array;

import java.util.Arrays;
import java.util.Random;

public class LottoMain2 {
    public static void main(String[] args) {

        /*
            int ball ==>   1,   2,   3,   4, .... 43,  44,  45
                     ==> 101, 102, 103, 104, ....143, 144, 145


             int[] ballArr = new int[45];
            ---------------------------------------------------------
            | 0 | 1 | 2 | 3 | 4 | 5 | .... | 40 | 41 | 42 | 43 | 44 |
         */



        int[] ballArr = new int[45];
        int[] tempArr = {-1, -1, -1, -1, -1};    // 기존에 뽑았던 방번호를 기억시켜두는 저장소
        /*
            공을 꺼내어 오면 공의 방번호(index 번호)를 기억하는 곳으로 사용되는데
            꺼내온 공의 방번호(index 번호)가 0(실제값은 1번볼)이 들어올 수 있으므로
            데이터 값은 방번호(index 번호)로 사용하지 않는 -1로 모두 (5개) 초기화 한다.
         */

        Random rnd = new Random();

        for (int i = 0; i < ballArr.length; i++) {
            // 배열의 방마다 데이터값 입력하기
            ballArr[i] = i+1;
        }
        String result ="";

        // 공의 방번호(배열의 index)를 꺼내는 작업을 6번 반복
        // 0번방부터 44번 방까지 랜덤하게 6번뽑아야 한다.
        // 즉, 0~44까지 난수를 생성.
        outer:
        for (int i = 0; i < 6; i++) {
            int idx = rnd.nextInt(45);
            // 9    0   12  7   34  20

            // int[] tempArr <== 랜덤하게 뽑은 배열의 방번호를 기억하는 저장소
            /*
                        -------------------------------
                index   |  0  |  1  |  2  |  3  |  4  |
                        -------------------------------
                값      | -1  | -1  | -1  | -1  | -1  | ==>
                        -------------------------------
                값      |  9  | -1  | -1  | -1  | -1  |
                        -------------------------------
             */

            for (int j = 0; j < tempArr.length; j++) {
                if (idx == tempArr[j]) {    // 새로 뽑아온 방번호(idx)가 기존의 뽑은 것(tempArr[j])과 같다라면 다시 새로이 뽑아야 한다!!
                    i--;                    // 즉, 0 ~ 44중에 새롭게 뽑아야 한다는 것이다.
                    continue outer;
                }

            }

            if (i<5) {
                tempArr[i] =idx;
            }
            String comma = (i < 5)? "," : "";
            result += ballArr[idx] + comma;


        }
        System.out.println("\n로또 1등 당첨번호 : " + result);
    }
}
