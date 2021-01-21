package my.day10.d.string;

import my.util.MyUtil;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {


        // === 1. "문자열".charAt(int index) ===
        //         "안녕하세요".charAt(2) ==> '하'
        // index => 0 1 2 3 4


        char ch = "안녕하세요".charAt(2);
        System.out.println("ch => " + ch);
        // ch => 하

        String str = "안녕하세요";
        String result = "";


        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }


        System.out.println(result);


        // === 2. "문자열".toCharArray() ===
        // "안녕하세요".toCharArray() ==> char 타입의 배열로 만들어준다.
        //----------------------------------
        //| '안' | '녕' | '하' | '세' | '요' |
        //----------------------------------
        //   0      1      2     3      4       <== index

        char[] chArr = "안녕하세요".toCharArray();
        result = "";

        for (int i = chArr.length-1; i >= 0; i--) {
            result += chArr[i];
        }

        System.out.println(result);



        // === 3. "문자열".substring(int 시작인덱스, int 끝인덱스)
        // "안녕하세요".substring(1, 4); ==> 1번 인덱스인 "녕"부터 4번 인덱스의 앞인 "세"까지를 String 으로 뽑아온한다.
        //  0 1 2 3 4



        str = "안녕하세요".substring(1,4);

        System.out.println(str);


        // === 4. "문자열".substring(int 시작인덱스, int 끝인덱스)
        // "안녕하세요".substring(2); ==> 2번 인덱스인 "하"부터 끝까지를 String 으로 뽑아온한다.
        //  0 1 2 3 4

        str = "안녕하세요".substring(2);
        System.out.println(str);

        // === 5. "문자열".indexOf("찾을 문자열") ===
        //        "문자열" 에서 최초로 나오는 "찾을 문자열"의 시작 인덱스 값을 int로 반환

        int index = "시작하라 안녕하세요 건강하세요".indexOf("하세요");

        System.out.println(index);

        System.out.println("\n===========================================\n");

        // ============ [퀴즈] ============ //
        String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
                                 "D:/mymusic.mp3",
                                 "C:/photo/내얼굴.jpg "};
        for (int i = 0; i < pathFileNameArr.length; i++) {
            System.out.println(pathFileNameArr[i]);
        }


        System.out.println("\n-------------------경로 떼기---------------------\n");
        /*
            C:/mydocument/resume/나의이력서.hwp
            D:/mymusic.mp3
            C:/photo/내얼굴.jpg

            여기서

            파일 이름만 나오도록

            나의이력서.hwp
            mymusic.mp3
            내얼굴.jpg
         */

        String[] pathFileName = new String[pathFileNameArr.length];
        Arrays.fill(pathFileName, "");

        for (int i = 0; i < pathFileNameArr.length; i++) {
            String reverse = "";
            for (int j = pathFileNameArr[i].length()-1; j >= 0; j--) {
                reverse += pathFileNameArr[i].charAt(j);
            }
            int slash = reverse.indexOf("/");
            reverse = reverse.substring(0, slash);

            for (int l = reverse.length()-1; l >= 0; l--) {
                pathFileName[i] += reverse.charAt(l);
            }
        }



        for (String s : pathFileName) {
            System.out.println(s);
        }


        System.out.println("\n------------------확장자 떼기------------------\n");


        for (int i = 0; i < pathFileName.length; i++) {
            int dot = pathFileName[i].indexOf(".");
            pathFileName[i] = pathFileName[i].substring(0,dot);
        }

        for (String s : pathFileName) {
            System.out.println(s);
        }


        


        System.out.println("\n=== 강사님ver 파일명만 뽑아온 결과물 ===");

        for(int i=0; i<pathFileNameArr.length; i++) {
            String pathFileName1 = pathFileNameArr[i];
            char[] chrArr = pathFileName1.toCharArray();

            String strReverse = "";
            for(int j=chrArr.length-1; j>=0; j--) {
                strReverse += chrArr[j];
            }

            //   System.out.println(strReverse);

            int idxSlash = strReverse.indexOf("/");

            strReverse = strReverse.substring(0, idxSlash);
            //   System.out.println(strReverse);

            chrArr = strReverse.toCharArray();

            String fileName = "";
            for(int j=chrArr.length-1; j>=0; j--) {
                fileName += chrArr[j];
            }

            System.out.println(fileName);
        }


        System.out.println("\n===========================================\n");


        // === 6. "문자열".lastIndexOf("찾을 문자열") ===
        //        "문자열" 에서 마지막으로 나오는 "찾을 문자열"의 시작 인덱스 값을 int로 반환
        index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하세요");

        for (int i = 0; i < pathFileNameArr.length; i++) {
            int idx = pathFileNameArr[i].lastIndexOf("/");

            System.out.println(pathFileNameArr[i].substring(idx+1));
        }

        System.out.println(index);



        // === [퀴즈] === //

        String money1 = "1,000,000";
        String money2 = "5,000";

        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println(df.format(MyUtil.delComma(money1) + MyUtil.delComma(money2)));





        // === 7. "문자열".split("구분자") ===
        //        "문자열을 "구분자"로 잘라서 String 타입의 배열로 리턴 시켜주는 것이다.

        System.out.println("\n1. =============================================\n");

        String food = "파스타,국밥,볶음밥,고구마,계란말이";


        String[] foodArr = food.split(",");

        for (String s : foodArr) {
            System.out.println(s);
        }
        /*
            파스타
            국밥
            볶음밥
            고구마
            계란말이
         */


        System.out.println("\n2. =============================================\n");

        food = "파스타   고구마    국밥   볶음밥    계란말이";

        foodArr = food.split("   ");

        for (String s : foodArr) {
            System.out.println(s);
        }
        /*
            파스타
            국밥
            볶음밥
            고구마
            계란말이
         */



        System.out.println("\n3. =============================================\n");

        food = "파스타.고구마.국밥.볶음밥.계란말이";


        foodArr = food.split(".");
        // ==> 0 이 나옴. 즉 . 단독만으로는 구분자로 인식을 못함.
        // split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로
        // 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다. 즉, [구분자] 이렇게 말이다.



        foodArr = food.split("[.]");

        for (String s : foodArr) {
            System.out.println(s);
        }
        /*
            파스타
            국밥
            볶음밥
            고구마
            계란말이
         */






        System.out.println("\n4. =============================================\n");

        food = "파스타|국밥|볶음밥|고구마|계란말이";


        foodArr = food.split("[|]");

        for (String s : foodArr) {
            System.out.println(s);
        }
        /*
            파스타
            국밥
            볶음밥
            고구마
            계란말이
         */




        System.out.println("\n5. =============================================\n");

        food = "파스타,국밥,볶음밥,고구마,계란말이";


        foodArr = food.split("\\,");
 // 또는 foodArr = food.split("[,]");

        for (String s : foodArr) {
            System.out.println(s);
        }
        /*
            파스타
            국밥
            볶음밥
            고구마
            계란말이
         */


        // == 참고 : \ 를 escape 문자라고 부른다. ==
        System.out.println("나의 이름은 \"이순신\" 입니다.");
        // 나의 이름은 "이순신" 입니다.

        System.out.println("C:\\movie\\koreamovie\\경이로운소문.mp4");
        // C:\movie\koreamovie\경이로운소문.mp4

        System.out.println("나의 이름은 '엄정화' 입니다.");
        // 나의 이름은 '엄정화' 입니다.

        System.out.println("\n6. =============================================\n");

        food = "파스타,국밥.볶음밥\t고구마,계란말이";


//      foodArr = food.split(",|\\.|\t");
//      또는
        foodArr = food.split("[,.\t]");

        for (String s : foodArr) {
            System.out.println(s);
        }
        /*
            파스타
            국밥
            볶음밥
            고구마
            계란말이
         */

        System.out.println("\n7. =============================================\n");

        food = "파스타1국밥2볶음밥3고구마4계란말이";


        foodArr = food.split("\\d");    // \\d 에서 d는 정규표현식의 하나로써 숫자를 의미한다.
//      또는                                      즉, 숫자가 구분자가 되는 것이다.
//      foodArr = food.split("[,.\t]");

        for (String s : foodArr) {
            System.out.println(s);
        }
        /*
            파스타
            국밥
            볶음밥
            고구마
            계란말이
         */



        System.out.println("\n8. =============================================\n");

        food = "파스타1국밥2볶음밥3고구마4계란말이";


        foodArr = food.split("\\D");    // \\D 에서 D는 정규표현식의 하나로써 숫자가 아닌것을 의미한다.
//      또는                                      즉, 숫자가 구분자가 되는 것이다.
//      foodArr = food.split("[,.\t]");

        for (String s : foodArr) {
            System.out.println(s);
        }

        /*



                1

                2


                3


                4

         */

        // === 8. String.join("구분자", 문자열배열명) ===
        //        문자열배열을 "구분자"로 합쳐서 String 타입의 배열로 리턴 시켜주는 것이다.


        String[] nameArr = {"한석규", "두석규","세석규","네석규","오석규"};
        String names = String.join("-", nameArr);
        System.out.println(names);
        // 한석규-두석규-세석규-네석규-오석규



        // === 9. "문자열".replaceAll("변경대상문자열", "새로이변경될문자열") ===
        //        "문자열"에서 "변경대상문자열"을 모두 "새로이변경될문자열" 로  교체해서 반환하는 것이다.

        names = names.replaceAll("석규", "SK");
        System.out.println(names);
        // 한SK-두SK-세SK-네SK-오SK


        // === 10. "문자열".replaceFirst("변경대상문자열", "새로이변경될문자열") ===
        //        "문자열"에서 "변경대상문자열"을 첫번째만 "새로이변경될문자열" 로  교체해서 반환하는 것이다.

        names = names.replaceFirst("SK", "석규");
        System.out.println(names);
        // 한석규-두SK-세SK-네SK-오SK


        // === [퀴즈] === //
        names = "한SK-두SK-세SK-네SK-오SK";

        for (int i = 0; i < 3; i++) {
            names = names.replaceFirst("SK","석규");
        }
        System.out.println(names);
        // 한석규-두석규-세석규-네SK-오SK

        names = "한SK-두SK-세SK-네SK-오SK";
        nameArr = names.split("-");

        for (int i = 0; i < nameArr.length; i++) {
            if (nameArr[i].charAt(0) == '두'||nameArr[i].charAt(0) == '세') {
                nameArr[i] = nameArr[i].replaceFirst("SK","석규");
            }
        }

        names = String.join("-", nameArr);

        System.out.println(names);
        // 한SK-두석규-세석규-네SK-오SK


        System.out.println("\n===== [ 퀴즈 ] =====");

        String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"};


        for (int i = 0; i < contents.length; i++) {
            int idx = contents[i].indexOf("건강");
            if (idx != -1) {
                System.out.println(contents[i]);
            }
        }
        // "건강" 이라는 단어가 포함된것을 출력하세요.
        // 건강하세요
        // 즐겁고 건강한 하루되세요


        // "건강" 이라는 단어로 시작하는 것만 출력하세요.

        for (int i = 0; i < contents.length; i++) {
            int idx = contents[i].indexOf("건강");
            if (idx == 0) {
                System.out.println(contents[i]);
            }
        }
        // 건강하세요



        // 또는 아래와 같이 할수도 있습니다.
        // === 11. "문자열".startsWith("찾고자하는문자열")  ===
        //       "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오면 true 를 반환.
        //      "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오지 않으면 false 를 반환.

        for (String content : contents) {
            if (content.startsWith("건강")) {
                System.out.println(content);
            }
        }
        // 건강하세요


        // "건강" 이라는 단어로 시작하는 것만 출력하세요.


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        // === 12. "문자열".endsWith("찾고자하는문자열")  ===
        //       "문자열" 에서 "찾고자하는문자열"이 맨마지막에 나오면 true 를 반환.
        //      "문자열" 에서 "찾고자하는문자열"이 맨마지막에 나오지 않으면 false 를 반환.

        for (String content : contents) {
            if (content.endsWith("하세요")) {
                System.out.println(content);
            }
        }
        // 호호안녕하세요
        // 건강하세요



        // === 13. "문자열".trim()  ===
        //       "문자열".trim 은 "문자열"의 좌,우에 공백이 있으면 공백을 모두 제거하고서 반환하여 주는 것이다.

        String insa = "         수고            많으셨습니다      ";

        System.out.println("하하하" + insa + "내일 뵐께요~~");
        // 하하하         수고            많으셨습니다      내일 뵐께요~~
        System.out.println("하하하" + insa.trim() + "내일 뵐께요~~");
        // 하하하수고            많으셨습니다내일 뵐께요~~
        String result1 ="";
        for (int i = 0; i < insa.length(); i++) {

            if (insa.charAt(i) == ' ') {
                continue;
            }
            result1 += insa.charAt(i);
        }
        insa = result1;
        System.out.println("하하하" + insa + "내일 뵐께요~~");

        // === 14. "문자열".isEmpty()  ===
        //       "문자열" 이 아무것도 없으면 true를 반환해주고.
        //       "문자열" 이 뭔가 있으면 false를 반환한다.

        String str1 = "", str2 = "abc", str3 = "             ";

        System.out.println(str1.isEmpty());         // true
        System.out.println(str2.isEmpty());         // false
        System.out.println(str3.isEmpty());         // false
        System.out.println(str3.trim().isEmpty());  // true



        // === 15. "문자열".toUpperCase()  ===
        //       "문자열" 에 소문자가 있으면 모두 대문자로 변경해서 반환.

        String words = "My Name is Tom 입니다.";
        System.out.println(words.toUpperCase());
        // MY NAME IS TOM 입니다.





        // === 16. "문자열".toUpperCase()  ===
        //       "문자열" 에 대문자가 있으면 모두 소문자로 변경해서 반환.

        words = "My Name is Tom 입니다.";
        System.out.println(words.toLowerCase());
        // my name is tom 입니다.

        // === 17. "문자열".equals("비교대상문자열")  ===
        //       대문자와 소문자를 구분하면서 비교
        //       "문자열" 과 "비교대상문자열"을 비교하여 같으면 true 아니면 false를 반환



        // === 18. "문자열".equalsIgnoreCase("비교대상문자열")  ===
        //       대문자와 소문자와 관계없이 비교
        //       "문자열" 과 "비교대상문자열"을 대,소문자 관계없이 비교하여 같으면 true 아니면 false를 반환

        String[] strArr = {"korea", "seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세", null};

        // 검색어를 "korea"
        for (String s : strArr) {
            if ("korea".equalsIgnoreCase(s)) {      // null.메소드 는 불가능하기 때문에 상수를 앞에 쓰는 것을 권장한다.
                System.out.println(s);
            }
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");

        // 검색어를 "korea", "KOREA", "kOrEA" 와 같이 3개중에 아무거나 입력하면
        // "korea", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세"가 출력되도록 한다.

        String search = "kOrEA";    // "KOREA"      "korea"

        for (String s : strArr) {
            search = search.toUpperCase();   // "KOREA"

            if (s != null && s.toUpperCase().contains(search)) {    // 배열안에 이 단어가 포함되어 있는지 확인하는 메소드 .contains(검색할문자열)
                System.out.println(s);
            }
        }


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");







    }

}
