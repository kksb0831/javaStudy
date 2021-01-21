package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtil {


    // === 현재시각을 알려주는 메소드 생성 ===
    public static void currentTime() {
        Date now = new Date();      // 현재시각

        SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd EEE HH:mm:ss");
        String date = sdfrmt.format(now);
        System.out.println(">> 현재시각 : " + date + " <<");
    }

    // === 비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성 ===
    // 비밀번호 규칙
    // 1. 비밀번호의 길이는 8글자 이상 15글자 이하여야 하고,
    // 또한 비밀번호는 영문대문자, 영문소문자, 숫자, 특수기호가 혼합되어야 한다.


    public static boolean isCheckPasswd(String passwd) {

        if (passwd.length() < 8 || passwd.length() > 15) {
            return false;
        }
        char[] pwd = passwd.toCharArray();

        boolean isUpper = false, isLower = false, isNum = false, isSpecial = false;

        for (char c : pwd) {
           if (Character.isUpperCase(c)) {
               isUpper = true;
           } else if (Character.isLowerCase(c)) {
               isLower = true;
           } else if (Character.isDigit(c)) {
               isNum = true;
           } else {
               isSpecial = true;
           }
        }
        if (isLower && isUpper && isNum && isSpecial) {
            return true;
        } else {
            return false;
        }
    }

    // === ,가 들어있는 숫자로 되어진 문자열을 ,를 제거해서 정수로 리턴시켜주는 메소드 생성하기 ===
    public static int delComma(String money) {
        int cnt = 0;
        for (int i = 0; i < money.length(); i++) {
            if (','==money.charAt(i)){
                cnt++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            int idx = money.indexOf(",");
            money = money.substring(0, idx) + money.substring(idx+1);

        }
        return Integer.parseInt(money);
    }


    // === 주민번호 7자리를 입력받아서 올바른데이터인지 검사해주는 메소드 생성 ===
    public static boolean isCheckJubun(String jubun) {

        if (jubun == null) {
            return false;
        }



        if (jubun.length() != 7){
            return false;
        }
        char[] chArr = jubun.toCharArray();

        for (char c : chArr) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        if (chArr[6] < '1' || chArr[6] > '4') {
            return false;
        }

        int birthMonth = Integer.parseInt(jubun.substring(2,4));
        int birthDay = Integer.parseInt(jubun.substring(4,6));

        if (birthMonth < 1 || birthMonth > 12) {
            return false;
        }

        switch (birthMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (birthDay < 1 || birthDay > 31) {
                    return false;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (birthDay < 1 || birthDay > 30) {
                    return false;
                }
                break;

            case 2:
                if (birthDay < 1 || birthDay > 29) {
                    return false;
                }
                break;


        }


        return true;
    }

    public static boolean isCheckJubun2(String jubun) {
        // jubun ==> "9501151"  "9501152"   "0105103"   "0105104"

        if (jubun == null) {
            return false;
        }

        // 정규표현식(Regular Expression)이란?
        // ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어


        // == 1. 정규표현식(Regular Expression) 패턴을 작성한다. ===
//        Pattern p = Pattern.compile("^[0-9]{2}[01][0-9][0-3][0-9][1-4]$");
        // ^는 시작을 의미한다.
        // $는 끝을 의미한다.
        // []는 글자 1개가 들어오는 것을 의미한다.
        // [0123456789] 은 0또는 1또는 2또는 .....8또는 9만 들어온다는 뜻이다.
        // [0123456789] 은 [0-9] 와 같다.
        // [0-9]{2} 은 [0-9] 가 연속해서 2번 나온다는 뜻이다.

        Pattern p = Pattern.compile("^\\d{2}[01]\\d[0-3]\\d[1-4]$");
        // [0-9] 와 \\d 는 같은 것이다.



        // == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. ==
        Matcher m = p.matcher(jubun);


        // == 3. 판별하도록 한다 ==
        // 주어진 정규식 패턴과 일치하면 true, 일치하지 않으면 false 를 리턴해준다.

        return m.matches();
    }


}
