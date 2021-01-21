package my.day11.b.abstraction;

import my.util.MyUtil;

import java.util.Scanner;

public class GujikjaCtrl {
    // 구직자(Gujikja) 신규 회원가입을 주는 메소드 생성하기
    public Gujikja register(Scanner sc, Gujikja[] guArr) {
        String userid;
        String passwd;
        String name;
        String jumin;

//        int passCnt = 0, juminCnt = 0;

        boolean useridFlag, passwdFlag, juminFlag;
        do {
            useridFlag = false;
            System.out.print("1. 아이디를 입력하세요 : ");
            userid = sc.nextLine();

            // == 중복아이디 검사하기 == //
            for (int i = 0; i < Gujikja.count; i++) {
                if (userid.equals(guArr[i].userId)) {
                    System.out.println(">>> 이미 존재하는 아이디입니다!! <<<");
                    useridFlag = true;
                    break;
                }
            }
        } while (useridFlag);

        do {
            System.out.print("2. 비밀번호를 입력하세요 : ");
            passwd = sc.nextLine();
            passwdFlag = MyUtil.isCheckPasswd(passwd);

//            passCnt++;

            if (!passwdFlag) {
//                System.out.println(passCnt + "번 틀리셨습니다!! (5회 오류시 종료됩니다)");
                System.out.println(">> 암호는 8~15글자의 영문 대,소문자,숫자,특수문자를 모두 포함하여야 합니다!! <<");
//                if (passCnt >= 5) {
//                    System.out.println("입력 횟수를 초과하셨습니다. 회원가입을 종료합니다.");
//                    Gujikja.count--;
//                    return null;
//                }
            }
        } while (!passwdFlag);

        System.out.print("3. 성명를 입력하세요 : ");
        name = sc.nextLine();

        do {
            System.out.print("4. 주민등록번호 앞의 7자리를 입력하세요 : ");
            jumin = sc.nextLine();
            juminFlag = MyUtil.isCheckJubun(jumin);

//            juminCnt++;

            if (!juminFlag) {
//                System.out.println(juminCnt + "번 틀리셨습니다!! (5회 오류시 종료됩니다)");
                System.out.println(">> 올바른 주민등록번호를 입력해주세요!! <<");
//                if (juminCnt >= 5) {
//                    System.out.println("입력 횟수를 초과하셨습니다. 회원가입을 종료합니다.");
//                    Gujikja.count--;
//                    return null;
//                }
            }
        } while (!juminFlag);

        Gujikja gu = new Gujikja();
        guArr[Gujikja.count] = gu;

        gu.userId = userid;
        gu.passwd = passwd;
        gu.name = name;
        gu.jubun = jumin;

        return gu;
    }

    public void showAll(Gujikja[] guArr) {

        for (int i = 0; i < Gujikja.count; i++) {
            guArr[i].showInfo();
        }
    }

    public void showTable(Gujikja[] guArr) {

        System.out.println("--------------------------------------------------");
        System.out.printf("%-8s\t%-10s\t%-8s\t%-3s\t%-2s\n","아이디","비밀번호","성명","현재나이","성별");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < Gujikja.count; i++) {
            guArr[i].tableInfo();
        }
    }
    // == 연령대를 입력받아 해당 연령대에 속하는  구직자 정보를 출력해주는 메소드 ==
    public void showByAgeline(int age, Gujikja[] guArr) {

        boolean flag = false;

        System.out.println("--------------------------------------------------");
        System.out.printf("%-8s\t%-10s\t%-8s\t%-3s\t%-2s\n","아이디","비밀번호","성명","현재나이","성별");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < Gujikja.count; i++) {
            if (guArr[i].getAge()/10 == age/10) {

                guArr[i].tableInfo();
                flag = true;
            }
        }

        if (!flag) {
            System.out.println(">> 검색하신 " + age/10 * 10 + "대는 없습니다!! <<");
        }
    }

    // == 성별을 입력받아 해당 연령대에 속하는  구직자 정보를 출력해주는 메소드 ==
    public void showByGender(String gender, Gujikja[] guArr) {

        System.out.println("--------------------------------------------------");
        System.out.printf("%-8s\t%-10s\t%-8s\t%-3s\t%-2s\n","아이디","비밀번호","성명","현재나이","성별");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < Gujikja.count; i++) {
            if (gender.equals(guArr[i].getGender())) {
                guArr[i].tableInfo();
            }
        }
    }

    public void showByAgeAndGender(int age, String gender, Gujikja[] guArr) {
        boolean ageFlag = false, allFlag = false;

        System.out.println("--------------------------------------------------");
        System.out.printf("%-8s\t%-10s\t%-8s\t%-3s\t%-2s\n","아이디","비밀번호","성명","현재나이","성별");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < Gujikja.count; i++) {
            if (guArr[i].getAge()/10 == age/10) {
                ageFlag = true;
            }
            if (guArr[i].getAge()/10 == age/10 && gender.equals(guArr[i].getGender()) ) {
                guArr[i].tableInfo();
                allFlag = true;
            }
        }

        if (!ageFlag) {
            System.out.println(">> 검색하신 " + age/10 * 10 + "대는 없습니다!! <<");
        }
        if (!allFlag) {
            System.out.println(">> 검색하신 " + age/10 * 10 + "대의 " + gender + "성은 없습니다!! <<");
        }
    }
}
