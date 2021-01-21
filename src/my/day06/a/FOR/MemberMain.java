package my.day06.a.FOR;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Member mbr = new Member();


        System.out.println(">>> 회원가입 <<<");

        System.out.print("1. 아이디 : ");
        String id = sc.nextLine();
        if (id.length()>0) {
            mbr.id = id;
        }


        System.out.print("\n2. 회원명 : ");
        String name = sc.nextLine();
        if (name.length()>0) {
            mbr.name = name;
        }
        System.out.print("\n3. 비밀번호(8글자 이상 15글자 이하에서 영문자,숫자,특수기호가 혼합되어야함) : ");
        String pwd = sc.nextLine();
        if (mbr.checkPwd(pwd)) {
            mbr.pwd = pwd;
        } else {
            System.out.println(">> 비밀번호는 8글자 이상 15글자 이하에서 영문자,숫자,특수기호가 혼합되어야 합니다. <<");
        }



        if (mbr.id != null && mbr.name != null && mbr.pwd != null) {
            System.out.println("== 회원가입 성공!! ==");
            mbr.showInfo();
        } else {
            System.out.println("==회원가입 실패!! ==");
        }







        sc.close();
    }
}
