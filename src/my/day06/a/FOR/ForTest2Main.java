package my.day06.a.FOR;

public class ForTest2Main {
    public static void main(String[] args) {

        System.out.println(">> 1. break <<");

        for (int i = 0; i < 10; i++) {
            if (i==5){
                break;      // 반복문에서 break; 를 만나면 가장 가까운 반복문을 벗어난다.
            }
            System.out.println(i+1);

        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~`\n");

        int cnt = 0;

        for (;;) {
            System.out.println(++cnt+"번째 반복");
            if (cnt == 5) {
                break;
            }
        }

        System.out.println(">> 2. continue <<");

        for (int i = 0; i < 10; i++) {
            if ( (i+1)%2 ==0)
            {
                continue;       // continue를 만나면 실행순서가 밑으로 내려감
            }
            System.out.print(i+1 + " ");
        }

    }
}
