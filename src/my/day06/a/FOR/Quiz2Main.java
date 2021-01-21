package my.day06.a.FOR;

public class Quiz2Main {
    public static void main(String[] args) {

        String word = "super007Man";

        String str = "";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                break;
            } else {
                str += (word.charAt(i));
            }
        }
        System.out.println(str);
        System.out.println(str.length());

        // 최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> super
        // 최초로 숫자가 나오는 곳의 앞까지 문자열 길이 ==> 5

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
        /*
            알파벳 소문자를 출력하는데 아래처럼 나타내도록 하세요.
            a, c, e, g, i, k, m, o, q, s, u, w, y
         */

        String alpbetStr = "abcdefghijklmnopqrstuvwxyz";
        str = "";

        for (int i = 0; i < alpbetStr.length(); i += 2) {

            str += (i < alpbetStr.length() - 2) ? alpbetStr.charAt(i) + ", " : alpbetStr.charAt(i);
        }

        System.out.println(str);


        str = "";
        int len = 'z' - 'a' + 1;
        for (int i = 0; i < len; i+=2) {
            char ch = (char) ('a' + i);
            str += i < (len - 2)? ch + ", " : ch;
        }
        System.out.println(str);


        for (int i = 'a'; i <= 'z'; i+=2) {
            str = i < 'z' -2 ? ", " : "" ;
            System.out.print((char) i + str);
        }



    }
}
