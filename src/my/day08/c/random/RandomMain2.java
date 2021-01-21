package my.day08.c.random;

import java.util.Random;
import java.util.Scanner;

public class RandomMain2 {
    public static void main(String[] args) {

        // === 랜던함 정수를 뽑아본다 === //
        // 보안상 Math.random 보다는 new Random(); 을 활용하는 것이 더안전하다.


        Random rnd = new Random();

        //  rnd.nextInt(마지막수 - 처음수 +1)+처음수



        int rand1 = rnd.nextInt(10)+1;
        System.out.println("1부터 10까지 랜덤하게 발생한 값 : " + rand1);


        int rand2 = rnd.nextInt(5) + 3;
        System.out.println("3부터 7까지 랜덤하게 발생한 값 : " + rand2);

        int rand3 = rnd.nextInt('z' - 'a' + 1) + 'a';
        System.out.println("a부터 z까지 랜덤하게 발생한 값 : " + (char)(rand3));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // 인증키는 숫자 3개 소문자 4개로 만든다
        // 예) 103abcd   020abat
        String prove ="";
        for (int i = 0; i < 7; i++) {
            if (i < 3) {
                prove += rnd.nextInt(10);
            } else {
                prove += (char)(rnd.nextInt('z' - 'a' +1) + 'a');
            }
        }

        System.out.println("인증키 => " + prove);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");



        prove ="";
        int rndx, cnt = 0;
        for (int i = 0; i < 7; i++) {
            rndx = (int) ((Math.random()*2)+1);
            if (rndx == 1 && cnt < 3) {
                prove += rnd.nextInt(10);
                cnt++;
            } else {
                prove += (char)(rnd.nextInt('z' - 'a' +1) + 'a');
            }
        }

        System.out.println("인증키 => " + prove);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //  rand1 이 짝수인지 홀수인지 맞춰보기

        Scanner sc = new Scanner(System.in);

        System.out.print("짝수일까요, 홀수일까요?? [1(홀) : 2(짝)] : ");
        String choice = sc.nextLine();


        int randNo = rnd.nextInt(10)+1;
        int holJjak = (randNo%2==0)?2:1;
        String result="";
        switch (choice) {
            case "1":
                if (Integer.parseInt(choice)== holJjak) {
                    result = "정답입니다!! 정답 : " + randNo;
                } else {
                    result = "틀렸습니다!! 정답은 짝이였습니다!! 정답 : " + randNo;
                }
                break;


            case "2":
                if (Integer.parseInt(choice)== holJjak) {
                    result = "정답입니다!! 정답 : " + randNo;
                } else {
                    result = "틀렸습니다!! 정답은 홀이였습니다!! 정답 : " + randNo;
                }
                break;
        }
        System.out.println(result);



        sc.close();
    }
}
