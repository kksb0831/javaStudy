package my.day05.d.SWITCH;

public class Sungjuk {
    // field
    String hakbun;
    String name;
    int kor;
    int eng;
    int math;

    public Sungjuk() {

    }

    // method
    int total() {
        int result;
        result = kor + eng + math;

        return result;
    }

    float avg() {
        float result;
        result = Math.round(total()/3.0f*10)/10.0f;
        return result;
    }

    String grade() {
        String result;

        // avg() ==> 100.0  96.7   91.3    90.0     ==> "A"
        // avg() ==> 89.7   81.3   80.0             ==> "B"
        // avg() ==> 79.7   71.3   70.0             ==> "C"
        // avg() ==> 69.7   61.3   60.0             ==> "D"
        // avg() ==> 나머지                          ==> "F"

        // (int) (avg()) / 10 ==> 10  9   9    9        ==> "A"
        // (int) (avg()) / 10 ==> 8   8   8             ==> "B"
        // (int) (avg()) / 10 ==> 7   7   7             ==> "C"
        // (int) (avg()) / 10 ==> 6   6   6             ==> "D"
        // (int) (avg()) / 10 ==> 나머지                 ==> "F"

        switch (((int) avg()/10)) {     // ()괄호 속에는 String, byte, short, int, char 만 들어올 수 있다.
            case 10:
            case 9:
                result = "A";
                break;
            case 8:
                result = "B";
                break;
            case 7:
                result = "C";
                break;
            case 6:
                result = "D";
                break;
            default:
                result = "F";
                break;
        }
        return result;
    }

    String gift() {
        String gift = "";
        // 학점이 "A" 이라면 "놀이공원이용권, 치킨, 피자, 아이스크림"
        // 학점이 "B" 이라면 "치킨, 피자, 아이스크림"
        // 학점이 "C" 이라면 "피자, 아이스크림"
        // 학점이 "D" 이라면 "아이스크림"
        // 학점이 "F" 이라면 "꿀밤3대"
        switch (grade()) {
            case "A":
                gift += "놀이공원이용권, ";
            case "B":
                gift += "치킨, ";
            case "C":
                gift += "피자, ";
            case "D":
                gift += "아이스크림";
                break;
            default:
                gift = "꿀밤3대";
                break;

        }



        return gift;
    }

}
