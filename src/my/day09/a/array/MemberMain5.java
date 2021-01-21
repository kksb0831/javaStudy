package my.day09.a.array;

import my.util.MyUtil;

import java.util.Scanner;

public class MemberMain5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Member4[] mbrArr = new  Member4[3];

        int menuNo = 0;

        do {
            System.out.println("\n\n======== >> 메뉴 << ========");
            System.out.println("1. 회원가입\t2. 모든회원조회\t3. 프로그램종료");
            try {
                System.out.print("▷번호 입력 => ");
                menuNo = Integer.parseInt(sc.nextLine());

                if (menuNo < 1 || menuNo > 3) {
                    System.out.println(">> 메뉴에 없는 번호입니다!! <<");
                    continue;
                }
                switch (menuNo) {
                    case 1:     // 회원 가입

                        Member4 mbr = new Member4();
                        Member4.count++;

                        System.out.print("\n1. 아이디 : ");
                        mbr.id = sc.nextLine();

                        String passwd;
                        do {
                            System.out.print("\n2. 비밀번호 : ");
                            passwd = sc.nextLine();
                            if (MyUtil.isCheckPasswd(passwd)) {
                                mbr.passwd = passwd;
                                break;
                            } else {
                                System.out.println(">>> 비밀번호는 8자에서 15자 사이로 대,소문자와 숫자,특수문자가 모두 포함되어야 합니다. <<<");

                            }
                        } while (true);

                        System.out.print("\n3. 성명 : ");
                        mbr.name = sc.nextLine();

                        for (int i = 0; i < mbrArr.length; i++) {
                            if (mbrArr[i] == null) {
                                mbrArr[i] = mbr;
                                break;
                            }
                        }

                        break;

                    case 2:     // 모든 회원 조회


                        System.out.println("\n\n=== 회원정보 출력 ===");
                        for (int i = 0; 0< Member4.count; i++) {
                                System.out.println(mbrArr[i].showInfo());
                        }

                        if (Member4.count == 0) {
                            System.out.println(">> 가입된 회원이 0명 입니다!! <<");
                        }

                        break;
                }



            } catch (NumberFormatException e) {
                System.out.println(">> 정수만 입력하세요!! << \n");
            }  catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(">> 회원가입은 3명까지만 가능합니다 <<");
            }

        } while (menuNo != 3);


        sc.close();
        System.out.println(">> 프로그램 종료 <<");
    }
}
