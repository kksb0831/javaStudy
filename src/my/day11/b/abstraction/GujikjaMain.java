package my.day11.b.abstraction;

import my.util.MyUtil;

import java.util.Scanner;

public class GujikjaMain {
    public static void main(String[] args) {

        Gujikja[] guArr = new Gujikja[5];

        Gujikja gu1 = new Gujikja();
        gu1.userId = "leess";
        gu1.passwd = "qwer1234$A";
        gu1.name = "이순신";

        if (!MyUtil.isCheckPasswd(gu1.passwd)){
            System.out.println("비밀번호는 9~15자로 영문 대,소문자와 숫자, 특수문자가 모두 포함되어야합니다!!");
            return;
        }

        String jubun = "9501211";

        boolean bool = MyUtil.isCheckJubun(jubun);

        if (bool) {
            gu1.jubun = jubun;
            guArr[Gujikja.count++] = gu1;

        }

//        === 아래는 정규표현식(Regular Expression)을 이용하여 검사한 것이다.
//        boolean bool = MyUtil.isCheckJubun2(null);
//        bool = MyUtil.isCheckJubun2("950115");
//        bool = MyUtil.isCheckJubun2("95011512");
//        bool = MyUtil.isCheckJubun2("9501t51");
//        bool = MyUtil.isCheckJubun2("9501155");
//        bool = MyUtil.isCheckJubun2("9513151");
//        bool = MyUtil.isCheckJubun2("9501321");
//        bool = MyUtil.isCheckJubun2("9502301");


        Gujikja gu2 = new Gujikja();
        gu2.userId = "eomjh";
        gu2.passwd = "qwer1234$B";
        gu2.name = "엄정화";
        gu2.jubun = "9710202";

        guArr[Gujikja.count++] = gu2;


        Gujikja gu4 = new Gujikja();
        gu4.userId = "youks";
        gu4.passwd = "qwer1234$C";
        gu4.name = "유관순";
        gu4.jubun = "8510202";

        guArr[Gujikja.count++] = gu4;


        ////////////////////////////////////////////////////////////////////////////////
        GujikjaCtrl ctrl = new GujikjaCtrl();

        Scanner sc = new Scanner(System.in);
        String smenuNo;

        do {
            System.out.print("\n\n=== 메인 메뉴 ===\n" +
                               "1. 구직자 회원가입\t2. 구직자 모두 보기\t3. 검색\t4. 프로그램 종료\n" +
                               "▷메뉴번호 선택 => ");
            smenuNo = sc.nextLine();
            switch (smenuNo) {
                case "1":   // 구직자 회원가입
                    Gujikja gu3 = ctrl.register(sc, guArr);
                    guArr[Gujikja.count++] = gu3;
                    System.out.println(">> 회원가입 성공!! <<\n");
                    break;

                case "2":   // 구직자 모두보기
                    ctrl.showAll(guArr);
                    ctrl.showTable(guArr);
                    break;

                case "3":   // 검색메뉴를 보여주게 호출
                    searchMenu(sc, ctrl, guArr);

                case "4":
                    break;

                default:
                    System.out.println(">> 메뉴는 1~4을 입력해야 합니다!! <<");

            }
        } while (!"4".equals(smenuNo));
        sc.close();
        System.out.println("=== 프로그램 종료 ===");
    }



    static void searchMenu(Scanner sc,GujikjaCtrl ctrl, Gujikja[] guArr) {
        String sMenuNo;
        do {
            System.out.println("\n\n=== 검색 메뉴 ===\n" +
                    "1. 연령대 검색\t2. 성별 검색 \t3. 연령대 및 성별 검색\t4. 메인으로 돌아가기\n");
            System.out.print("▷검색메뉴번호 선택 = > ");
            sMenuNo = sc.nextLine();

            switch (sMenuNo) {
                case "1":   // 연령대 검색
                    try {
                        System.out.print("▷검색할 연령대를 입력해 주세요 => ");
                        String ageLine = sc.nextLine();
                        int age = Integer.parseInt(ageLine);
                        ctrl.showByAgeline(age,guArr);
                    } catch (NumberFormatException e) {
                        System.out.println(">> 잘못입력하셨습니다!! <<");
                    }

                    break;

                case "2":   // 성별 검색
                    System.out.print("▷검색할 성별을 입력해 주세요 => ");
                    String gender = sc.nextLine();
                    if (!(gender.equals("남") || gender.equals("여"))) {
                        System.out.println(">> 성별은 \"남\" 아니면 \"여\"만 가능합니다!! <<");
                        break;
                    }
                    ctrl.showByGender(gender, guArr);
                    break;

                case "3":
                    try {


                        System.out.print("▷검색할 연령대를 입력해 주세요 => ");
                        String ageLine = sc.nextLine();
                        int age = Integer.parseInt(ageLine);

                        System.out.print("▷검색할 성별을 입력해 주세요 => ");
                        String gender1 = sc.nextLine();
                        if (!(gender1.equals("남") || gender1.equals("여"))) {
                            System.out.println(">> 성별은 \"남\" 아니면 \"여\"만 가능합니다!! <<");
                            break;
                        }

                        ctrl.showByAgeAndGender(age, gender1, guArr);

                    } catch (NumberFormatException e) {
                        System.out.println(">> 잘못입력하셨습니다!! <<");
                    }

                    break;

                case "4":
                    break;

                default:
                    System.out.println("잘못된 번호를 입력하셨습니다!!");
                    break;

            }
        } while (!sMenuNo.equals("4"));


    }
}
