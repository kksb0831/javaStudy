package my.day03.b.operator;

public class OperatorMain {
    public static void main(String[] args) {



        // === 연산자 === //

        // 1. 산술연산자 + - * / %
        int n = 10;
        System.out.println("n+3 = " + (n+3));   // n+3 = 13
        System.out.println("n-3 = " + (n-3));   // n-3 = 7
        System.out.println("n*3 = " + (n*3));   // n*3 = 30
        System.out.println("n/3 = " + (n/3));   // n/3 = 3
        System.out.println("(double) n/3 = " + ((double) n/3)); // (double) n/3 = 3.3333333333333335
        System.out.println("n%3 = " + (n%3));   // n%3 = 1


        // 2. 증감연산자 ++ --

        int a = 7, b = 3;
        System.out.println("a => " + a); // a => 7

//        a = a+1;
//        System.out.println("a => " + a); // a => 8

//        또는
        a++;
        System.out.println("a => " + a);    // a => 8
        System.out.println("++a => " + ++a); // ++a => 9
        ++a;
        System.out.println("a => " + a);    // a => 10

        System.out.println("b => " + b);    // b => 3
        // b = b-1; 또는
        b--;
        System.out.println("b => " + b);    // b => 2
        --b;
        System.out.println("b => " + b);    // b => 1

        // !!! 꼭 암기하세요 !!! //
        // 후위증감연산자(a++;, b--;) 는 다른 연산을 다 마친 이후에 1씩 증감한다.
        // 전위증감연산자(++a;, --b;) 는 맨먼저 증감을 마친 이후에 다른 연산을 한다.


        int x = 10, y = 10;
        int z = ++x;    // ++x; x=x+1; z=11
        System.out.println("z => " + z);    // z => 11
        System.out.println("x => " + x);    // x => 11

        z = y++;        // z=y; z=10; y++; y=y+1;
        System.out.println("z => " + z);    // z => 10
        System.out.println("y => " + y);    // y => 11


        // 3. 논리연산자 & | && ||
        /*
            수학에서는 T ∧ T ∧ F ==> F
            수학에서는 T ∧ T ∧ T ==> T

            수학에서는 T ∨ T ∨ F ==> T
            수학에서는 T ∨ T ∨ T ==> T
            수학에서는 F ∨ F ∨ F ==> F
         */

        int c = 50, d = 50, e = 70;

        boolean bool = (c > d) && (d < e) && (c == e);
                      // false && 스킵
        System.out.println("bool => " + bool);  // bool => false

        bool = (c > d) || (d < e) || (c == e);
             // false  || true    || 스킵
        System.out.println("bool => " + bool);  // bool => true
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        bool = (c > d) & (d < e) & (c == e);
             // false  &  true   &  false
        System.out.println("bool => " + bool);  // bool => false

        bool = (c > d) | (d < e) | (c == e);
             // false  |  true   |  false
        System.out.println("bool => " + bool);  // bool => true


        int n1 = 10;

        if (n1 < 20) {
            System.out.println(">> n1은 20보다 작습니다.");
        }





        System.out.println("\n~~~~~ 퀴즈1 ~~~~~~\n");
        int i=1;
        int j=i++;   // j = 1; i = 2;

        if( (i > ++j) & (i++ == j) ) { // 2 > 2 => false 2 == 2 => true  ==> false
            i=i+j;
        }

        System.out.println("i="+i); // i=3;

        i=1;
        j=i++;  // j = 1; i = 2;

        if( (i > ++j) && (i++ == j) ) { // 2 > 2 => false skip
            i=i+j;
        }

        System.out.println("i="+i); // i=2;

        System.out.println("\n~~~~~ 퀴즈2 ~~~~~~\n");

        int m1=0;
        n1=1;

        if( (m1++ == 0) | (n1++ == 2)  ) { // 0 == 0 true (m1=1) 1==2 false(n1=2) => true
            m1=42;   // m1=42
        }

        System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>42, n1=>2


        m1=0;
        n1=1;
        if( (m1++ == 0) || (n1++ == 2) ) { // true m1=1 skip
            m1=42;   // m1=42
        }

        System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>42, n1=>1




        // = 4. 비교연산자 ==
        // == 같다, != 같지 않다, >, >=, <, <=


        // == 5. 할당연산자(연산후 대입 연산자) ==
        int no = 1;
        no += 3;    // no = no + 3;
        System.out.println("no => " + no); // no => 4

        no -= 2;    // no = no - 2;
        System.out.println("no => " + no); // no => 2

        no *= 5;    // no = no * 5;
        System.out.println("no => " + no); // no => 10

        no /= 4;    // no = no - 4;
        System.out.println("no => " + no); // no => 2

        no %= 3;    // no = no % 3;
        System.out.println("no => " + no); // no => 2


        // == 6. 삼항연산자 == //
        /*
            변수선언 = (조건문)? (참일 경우)값1: (거짓일 경우)값2;
         */

        int num1 = 50, num2 = 60;
        int num3 = (num1>num2)?num1:num2;

        System.out.println("num3 => " + num3);
        // num3 => 60











    }
}
