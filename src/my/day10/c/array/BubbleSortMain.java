package my.day10.c.array;


import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortMain {


    /*
           == 입사문제 ==
           >> 버블 정렬(Bubble Sort)은
            정렬 대상 리스트(배열)의 항목을 수평방향으로 나열했다고 가정했을 때,
            왼쪽 끝에서부터 시작해서 인접하는 두 항목의 값을 비교하여
            올바른 순서(오름차순 또는 내림차순)로 되어있지 않으면 서로 위치를 교환하는 정렬방법이다.

            이렇게 인접하는 항목의 값을 비교해서 위치를 교환하는 과정을
            리스트(배열)의 마지막 항목까지 반복해서 제일 큰(또는 작은) 값이 끝에 오도록 한다.

            각 회전(Pass)과정이 끝날때마다 정렬은 뒤에서부터 하나씩 완료된다.
        */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        outer:
        do {
            try {
                int[] numA = new int[5];

                System.out.print("버블 정렬을 원하는 5자리 숫자열을 입력하세요(공백으로 구분) => ");
                String num = sc.nextLine();

                String[] num1 = num.split(" ");


                for (int i = 0; i < num1.length; i++) {
                    numA[i] = Integer.parseInt(num1[i]);
                }

                for (int i : numA) {
                    if (i == 0) {
                        System.out.println("5자리의 숫자열은 자연수로 입력해 주세요!!");
                        continue outer;
                    }
                }

                int[] numArr = {9,7,3,5,1};


                /*
                    numArr[0] => 9
                    numArr[1] => 7
                    numArr[2] => 3
                    numArr[3] => 5
                    numArr[4] => 1
                 */

                System.out.println("===  정렬하기전 ===");
                for (int i = 0; i < numArr.length; i++) {
                    String str = (i < numArr.length-1)? ",": "\n";
                    System.out.print(numArr[i]+str);
                }
                /*
                    ===  정렬하기전 ===
                    9,7,3,5,1
                 */

                System.out.println("=== 버블정렬 한 후 ===");
                System.out.println("=== 오름차순 ===");
                for (int i = 0; i < numArr.length-1; i++) {
                    for (int j = 0; j < numArr.length-1-i; j++) {
                        if (numArr[j]>numArr[j+1]) {
                            int tmp = numArr[j];
                            numArr[j] = numArr[j+1];
                            numArr[j+1] = tmp;
                        }
                    }

                }

                for (int i = 0; i < numArr.length; i++) {
                    String str = (i < numArr.length-1)? ",": "\n";
                    System.out.print(numArr[i]+str);
                }



                System.out.println("=== 내림차순 ===");
                for (int i = 0; i < numArr.length-1; i++) {
                    for (int j = 0; j < numArr.length-1-i; j++) {
                        if (numArr[j]<numArr[j+1]) {
                            int tmp = numArr[j];
                            numArr[j] = numArr[j+1];
                            numArr[j+1] = tmp;
                        }
                    }

                }

                for (int i = 0; i < numArr.length; i++) {
                    String str = (i < numArr.length-1)? ",": "\n";
                    System.out.print(numArr[i]+str);
                }


                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

                System.out.println("===  정렬하기전 ===");
                for (int i = 0; i < numA.length; i++) {
                    String str = (i < numA.length-1)? ",": "\n";
                    System.out.print(numA[i]+str);
                }


                System.out.println("=== 버블정렬 한 후 ===");
                System.out.println("=== 오름차순 ===");
                for (int i = 0; i < numA.length-1; i++) {
                    for (int j = 0; j < numA.length-1-i; j++) {
                        if (numA[j]>numA[j+1]) {
                            int tmp = numA[j];
                            numA[j] = numA[j+1];
                            numA[j+1] = tmp;
                        }
                    }

                }

                for (int i = 0; i < numA.length; i++) {
                    String str = (i < numA.length-1)? ",": "\n";
                    System.out.print(numA[i]+str);
                }



                System.out.println("=== 내림차순 ===");
                for (int i = 0; i < numA.length-1; i++) {
                    for (int j = 0; j < numA.length-1-i; j++) {
                        if (numA[j]<numA[j+1]) {
                            int tmp = numA[j];
                            numA[j] = numA[j+1];
                            numA[j+1] = tmp;
                        }
                    }

                }

                for (int i = 0; i < numA.length; i++) {
                    String str = (i < numA.length-1)? ",": "\n";
                    System.out.print(numA[i]+str);
                }

                int[] numArr2 = {9,7,3,5,1};

                System.out.println("===  정렬하기전 ===");
                for (int i = 0; i < numArr2.length; i++) {
                    String str = (i < numArr2.length-1)? ",": "\n";
                    System.out.print(numArr2[i]+str);
                }

                Arrays.sort(numArr2);
                System.out.println("=== Arrys.sort 정렬 후 ===");
                for (int i = 0; i < numArr2.length; i++) {
                    String str = (i < numArr2.length-1)? ",": "\n";
                    System.out.print(numArr2[i]+str);
                }
                // 내림차순 정렬을 하려면 Arrys.sort(대상배열, Collections.reverseOrder())
                // 을 통하여 Collections 클래스의 reverseOrder메소드를 뒤에 붙여주면 된다.
                // ※주의사항 ==> 사용하려면 대상 배열이 일반적인 배열인 경우는 래퍼클래스로 만들어야
                // 뒤에 붙여주는 것이 가능함!!



                break;
            } catch (NumberFormatException e) {
                System.out.println(">> 올바른 정수를 입력해주세요 <<");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(">> 5자리만 가능합니다!! <<");
            }
        } while (true);
        sc.close();

    }
}
