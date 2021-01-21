package my.day08.c.random;

import java.util.Scanner;

public class MathRandomMain1 {
    public static void main(String[] args) {


        // === 랜던함 정수를 뽑아본다 === //

        double random = Math.random();
        System.out.println("random => " + random);

        /*
            java.lang.Math.random() 메소드는
            0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다.
            즉,  0.0 <= 임의의 난수(실수) < 1.0



            랜덤한 정수 = (int)(Math.random()*구간범위)+시작값;

             0.0        (int)(0.0*(10-1+1))+1         ==>  1
             0.23346438 (int)(0.23346438*(10-1+1))+1  ==>  3
             0.67835431 (int)(0.67835431*(10-1+1))+1  ==>  7
             0.99999999 (int)(0.99999999*(10-1+1))+1  ==> 10

             3 부터 7까지중 랜덤한 정수를 얻어와 본다.

             0.0        (int)(0.0*(7-3+1))+3         ==>  3
             0.23346438 (int)(0.23346438*(7-3+1))+3  ==>  4
             0.67835431 (int)(0.67835431*(7-3+1))+3  ==>  6
             0.99999999 (int)(0.99999999*(7-3+1))+3  ==>  7
         */

        int rand1 = (int) (Math.random()*10)+1;
        System.out.println("1부터 10까지 랜덤하게 발생한 값 : " + rand1);


        int rand2 = (int) (Math.random()*5)+3;
        System.out.println("3부터 7까지 랜덤하게 발생한 값 : " + rand2);

        int rand3 = (int) (Math.random()*('z' - 'a' + 1)+ 'a') ;
        System.out.println("a부터 z까지 랜덤하게 발생한 값 : " + (char)(rand3));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // 인증키는 숫자 3개 소문자 4개로 만든다
        // 예) 103abcd   020abat
        String prove ="";
        for (int i = 0; i < 7; i++) {
            if (i < 3) {
                prove += (int) (Math.random() * 10);
            } else {
                prove += (char)((int) (Math.random() * ('z' - 'a' + 1)) + 'a');
            }
        }

        System.out.println("인증키 => " + prove);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");



        prove ="";
        int rnd, cnt = 0;
        for (int i = 0; i < 7; i++) {
            rnd = (int) ((Math.random()*2)+1);
            if (rnd == 1 && cnt < 3) {
                prove += (int) (Math.random() * 10);
                cnt++;
            } else {
                prove += (char)((int) (Math.random() * ('z' - 'a' + 1)) + 'a');
            }
        }

        System.out.println("인증키 => " + prove);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //  rand1 이 짝수인지 홀수인지 맞춰보기

        Scanner sc = new Scanner(System.in);

        System.out.print("짝수일까요, 홀수일까요?? [1(홀) : 2(짝)] : ");
        String choice = sc.nextLine();


        int randNo = (int) (Math.random()*10)+1;
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
