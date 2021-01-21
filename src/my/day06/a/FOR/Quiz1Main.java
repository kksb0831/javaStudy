package my.day06.a.FOR;

public class Quiz1Main {
    public static void main(String[] args) {

        String word = "Abz3Sa0#$T";
        int upperCnt = 0, lowerCnt = 0, numCnt = 0, specialCnt = 0;




        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCnt++;
            } else if (Character.isLowerCase(ch)) {
                lowerCnt++;
            } else if (Character.isDigit(ch)) {
                numCnt++;
            } else {
                specialCnt++;
            }

//            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
//                large++;
//            } else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
//                small++;
//            } else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
//                num++;
//            } else {
//                special++;
//            }
        }

        System.out.println(word + "의 문자열의 길이(글자수) : " + word.length() + "\n\n");

        System.out.println(word);
        System.out.println("대문자 개수 : " + upperCnt);
        System.out.println("소문자 개수 : " + lowerCnt);
        System.out.println("숫자 개수 : " + numCnt);
        System.out.println("특수문자 개수 : " + specialCnt);

        /*
            Abz3Sa0#$T
            대문자 개수 : 3
            소문자 개수 : 3
            숫자 개수 : 2
            특수문자 개수 : 2
         */


    }
}
