package my.day06.a.FOR;

public class Member {

    // field
    String id;
    String pwd;
    String name;


    // method
    boolean checkPwd(String pwd) {
        // 비밀번호는 8글자이상 15자이하에서 영문자, 숫자, 특수기호가 혼합되어야 함

        // pwd ==> "Ab123$" ==> false
        // pwd ==> "Ab123cdef" ==> flase
        // pwd ==> "Abcdefghi" ==> flase
        // pwd ==> "Abcdef@#$" ==> flase
        // pwd ==> "Abcdef@#$567" ==> true



        if (pwd.length() >= 8 && pwd.length() <=15) {
            boolean alphabetFlag = false;       // 영문자 깃발
            boolean numFlag = false;            // 숫자 깃발
            boolean specialFlag = false;        // 특수문자 깃발

            for (int i = 0; i < pwd.length(); i++) {

                if (Character.isAlphabetic(pwd.charAt(i))) {
                    alphabetFlag = true;
                } else if (Character.isDigit(pwd.charAt(i))) {
                    numFlag = true;
                } else {
                    specialFlag = true;
                }


            }

            return alphabetFlag && numFlag && specialFlag;

        } else {
            return false;
        }
    }

    void showInfo() {
        System.out.println("\n=== 회원정보 ===");
        System.out.println("1. 아이디 : " + id);
        System.out.println("2. 암호 : " + pwd);
        System.out.println("3. 회원명 : " + name);
    }
}
