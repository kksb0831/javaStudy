package my.day01;

public class Member {

/*
	만약에 쇼핑몰 프로그램을 작성하고자 한다면
	회원, 제품, 장바구니, 주문내역 부품이 필요할 것이다.
	각각의 설계도가 필요할 것이다.
	여기서 필요로하는 부품의 설계도면을 "클래스"라고 보면 된다.
*/

//	추상화 ==> 필요한 속성만 뽑아내는 것을 말한다.
//	회원가입(병원) ==> 신장, 혈액형, 몸무게, 혈압
//	회원가입(쇼핑몰) ==> 이름, 주소, 아이디, 비밀번호, 연락처, 이메일, 마일리지(포인트)...
//	attribute == property == field == 속성

//	instance(인스턴스)변수
//	instance(인스턴스)변수는 다른말로 non static 변수라고도 한다.
//	instance(인스턴스)변수는 서로 다른 instance 끼리 공유하지도 못하고 각자 자기의 instance 내에서만 사용 가능하다 .
//	instance(인스턴스)변수는 클래스가 메모리(RAM)에 올라가서 실제 사용가능한 객체로 되어진 상태를 말한다.



//	static 변수
//	static 변수는 동일한 클래스로 생성되어진 서로 다른 instance들 끼리 공유하는 변수 클래스가 참조되는 순간 생성
    static String maker;


    //인스턴스 변수
    String id; 		//아이디
    String pwd;		//비밀번호
    String name;	//이름
    String email;	//이메얼

    //	생성자
    public Member() {

    }


    //	behavior == 행위 == 기능 == method(메소드)
    //	회원의 정보를 조회해주는 기능을 생성
    void showInfo() {
        System.out.println("===회원 정보===" + "\n" +
                "1. 회원 이름 : " + this.name + "\n" +
                "2. 회원 아이디 : " + this.id + "\n" +
                "3. 회원 비밀번호 : " + this.pwd + "\n" +
                "4. 회원 이메일 : " + this.email + "\n" +
                "5. 구매 상표 : " + maker + "\n"
        );
    }
}


