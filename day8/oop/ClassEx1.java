package day8.oop;

public class ClassEx1 {
    public static void main(String[] args) {
        // Member 클래스를 객체로 호출
        Member member = new Member();
        Member member2 = new Member();
        System.out.println(member); // 해시값 출력
        System.out.println(member2); // 해시값 출력
        // 클래스로 생성된 객체는 참조 타입 데이터

        if (member == member2) {
            System.out.println("member와 member2는 같다.");
        } else {
            System.out.println("member와 member2는 같지 않다.");
        }

        // member, member2 // '.' 은 참조 연산자
        member.name = "홍길동"; // member.name 속성에 값을 대입.
        member.greeting(); // print로 member.nam 값과 "님 반가워요" 를 출력
        System.out.println("member 객체 내 name에 저장된 내용 :" + member.getname());
        System.out.println("member 객체 내 name에 저장된 내용 :" + member.name);

    }
}

// 클래스 앞에 public이 있는 클래스는 하나의 파일에 하나만 존재한다.
// public이 붙은 클래스명으로 .java 파일이 만들어져야 한다.
// 다르면 오류남

class Member { // 클래스를 만들어 가는 과정: 객체 추상화
    // 필드(속성)-멤버 => 변수
    // 자동 초기화 처리.
    // 참조형의 기본 데이터값은 Null
    String name;
    int age;
    String gender;
    String phone;

    // 생성자(constructors) - 클래스로 객체 생성시 필요한 정보를 통해서 객체 생성 (자기 자신이 반환타입이라 반환타입을 굳이 적을
    // 필요 X)
    public Member() {
        // 객체 생성시 필요한 내용...
        // 주로 필드(속성)멤버를 초기화 합니다.
    }

    // 메서드 - 클래스에 선언된 필드를 사용하여 동작하는 기능을 의미함.
    public String getname() {
        return name;
    }

    public void greeting() {
        System.out.println(name + "님 반가워요");
    }

}
