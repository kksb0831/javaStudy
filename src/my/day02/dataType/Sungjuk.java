package my.day02.dataType;

public class Sungjuk {
    /*
            === *** 자료형 *** ===

              ※ 자료형의 종류

        1. 원시형 타입(Primitive Type)

          1.1 정수형(byte, short, int, long)
              -- 자바에서 정수형의 기본타입은 int 이다.
              -- 그러므로 정수형의 값이 -2,147,483,648 ~ 2,147,483,647 범위를 벗어난 것이라면 반드시 숫자뒤에 소문자 l 또는 대문자  L 을 붙여야 한다.

              byte (1byte == 8bit)  : -2^7  ~ 2^7-1  ==> -128 ~ 127
              short(2byte == 16bit) : -2^15 ~ 2^15-1 ==> -32,768 ~ 32,767
              int  (4byte == 32bit) : -2^31 ~ 2^31-1 ==> -2,147,483,648 ~ 2,147,483,647
              long (8byte == 64bit) : -2^63 ~ 2^63-1 ==> -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807

          1.2 실수형(float, double)
              float(4byte)  : 단정밀도   소수점이하 7자리까지 표현됨.     135.3246235
              double(8byte) : 배정밀도   소수점이하 15~16자리까지 표현됨. 135.3246234502345642
              -- 자바에서 실수형의 기본타입은 double 이다.
                            그러므로 실수값을 float 형태로 나타내기 위해서는 실수뒤에 반드시 소문자 f 또는 대문자 F를 붙여야 한다.


          1.3 문자형(char)
             char : 자바는 유니코드 체계를 사용하므로
                                 문자형 타입인 char 는 2byte 이며, 범위는 0 ~ 65535 이다.
                                 그래서 char 타입에는 문자 1개 또는 숫자(0~65535)도 올 수 있다.

             UNICODE 표 참조
             http://www.tamasoft.co.jp/en/general-info/unicode.html

          === !!! 꼭 기억합시다 !!! ===
          int(4byte) 아래의 크기인  byte(1byte), short(2byte), char(2byte) 타입이
               사칙연산(+ - * /)을 만나면 자동적으로 int 타입으로 자동 형변환이 발생된다.

          'A' => 65     'a' => 97
          'B' => 66     'b' => 98
          'C' => 67     'c' => 99

          '대문자' + 32 => 소문자에 해당하는 숫자
          '소문자' - 32 => 대문자에 해당하는 숫자

          '0' => 48
          '1' => 49
          '2' => 50
          '9' => 57
          ' ' => 32


          1.4 참(true) 또는 거짓(false)을 담아주는 boolean 타입 -- 크기가 1byte 이다.


        2. 참조형 타입(Reference Type)
           --> 클래스 객체(==object ==instance) 타입
           --> 메모리상에 저장되어진 객체의 메모리 주소를 참조하는 것이다.
           --> 참조형 타입(Reference Type) 메모리상에 크기는 4byte 를 차지한다.
     */

    // === 속성, property, attribute, field ===
/*
      ※ === 변수의 명명규칙 ===
       1. 변수명의 길이에는 제한이 없다.
       2. 대,소문자 구분이 있다.
       3. 첫글자가 숫자는 안된다.
       4. 특수문자는 '_' 와 '$' 만 사용이 가능하다.
       5. 예약어(예 package, import, public, class, String, int, float ....)는 변수명으로 사용불가하다.
       6.<권장사항이지 규칙은 아니다> 첫글자는 소문자로 시작하고 단어와 단어가 결합된 경우이라면 두번째 단어는 대문자로 시작하는것이 일반적이다.
*/
    String hakbun;          // 학번       String
    String name;            // 학생명     String
    byte kor;               // 국어       int
    byte eng;               // 영어       int
    byte math;              // 수학       int

    char hakjum;



    // === 기능, 행위, behavior, method ===


    public void showSungjuk() {

        short total = (short)(kor + eng + math);
        // Java에서 데이터 타입이 bye 또는 short 또는 char인 변수가 사칙연산(+, -, /, *)를 만나면
        // 자동적으로 그 변수의 데이터 타이은 int로 변하게 되어있다
        // kor + eng + math ==> 자동적으로 int 타입으로 변화됨
        // (short)(kor + eng + math) ==> 강제 형변환(casting)

        float avg1 = (float)(Math.round((total/3.0)*100)/100.0);
        // Math 함수의 round() 메소드는 소수점 첫번째자리를 반올림하여 정수로 리턴시켜주는 메소드이다.
        // 이 메서드를 활용하여 Math.round((구할값)*100) / 100.0 과 같은 식으로 몇 번째 소수부분에 반올림을 적용하여 구할 수 있다.

        float avg2 = total/3.0f;
        double avg3 = total/3.0;
        long money = 5000000000L;
        if (avg1 >= 90) {
            hakjum = 'A';
        } else if (avg1 >= 80) {
            hakjum = 'B';
        }else if (avg1 >= 70) {
            hakjum = 'C';
        }else if (avg1 >= 60) {
            hakjum = 'D';
        }else {
            hakjum = 'F';
        }

        String star = null;

        if (hakjum == 'A') {
            star = "☆☆☆☆☆";
        } else if (hakjum == 'B') {
            star = "☆☆☆☆";
        } else if (hakjum == 'C') {
            star = "☆☆☆";
        } else if (hakjum == 'D') {
            star = "☆☆";
        } else {
            star = "☆";
        }


        System.out.println("=== 성적 결과 ===" + "\n" +
                "1. 학번 : " + this.hakbun + "\n" +
                "2. 성명 : " + this.name + "\n" +
                "3. 국어 : " + this.kor + "\n" +
                "4. 영어 : " + this.eng + "\n" +
                "5. 수학 : " + this.math + "\n" +
                "6. 총점 : " + total + "\n" +
                "7. 평균1 : " + avg1 + "\n" +
                "8. 평균2 : " + avg2 + "\n" +
                "9. 평균3 : " + avg3 + "\n" +
                "10. 장학금 : " + money + "\n" +
                "11. 성적 : " + hakjum + "\n" +
                "12. 학점(☆) : " + star);   //




    }


    public void totalGrade(byte kor, byte eng, byte math) {

        System.out.println("국어 성적 : " + setGrade(kor));
        System.out.println("영어 성적 : " + setGrade(eng));
        System.out.println("수학 성적 : " + setGrade(math));

    }

    public String setGrade(byte sungjuk) {
        char nowGrade;
        String yourGrade;

        if (sungjuk>=90) {
            nowGrade = 'A';
        } else if (sungjuk>=80) {
            nowGrade = 'B';
        } else if (sungjuk>=70) {
            nowGrade = 'C';
        } else if (sungjuk>=60) {
            nowGrade = 'D';
        } else {
            nowGrade = 'F';
        }

        if (sungjuk%10 >=5 && sungjuk >=60 || sungjuk ==100) {
            yourGrade = nowGrade + "+";
        } else {
            yourGrade = nowGrade + "";
        }

        return yourGrade;
    }
}
