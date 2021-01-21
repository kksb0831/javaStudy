package my.day09.a.array;

public class Member2 {

    // field
    String id;
    String passwd;
    String name;


    // Method

    public String showInfo() {

        return "회원이름 : " + name +"\n" +
                "아이디 : " + id +"\n" +
                "비밀번호 : " + passwd + "\n";
    }

}
