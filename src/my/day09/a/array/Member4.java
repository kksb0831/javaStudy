package my.day09.a.array;

public class Member4 {

    // field
    String id;
    String passwd;
    String name;

    static int count;   // Member4 객체를 생성한 개수를 알려주고자 하는 용도도


   // Method

    public String showInfo() {

        return "회원이름 : " + name +"\n" +
                "아이디 : " + id +"\n" +
                "비밀번호 : " + passwd + "\n";
    }

}
