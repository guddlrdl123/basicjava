package day8.oop.objects;

public class Student extends Person {

    // 1. 멤버변수 선언
    String studentId;
    String subject;

    // 2. 생성자
    public Student() {

    }

    // 부모인 Person의 Person(String name, int age)를 불러와서
    // 자식인 Student의 멤버를 추가해서 생성자를 만들었어요.
    public Student(String name, int age, String studentId, String subject) {
        super(name, age); // super() 부모 클래스의 생성자를 의미함.
        this.studentId = studentId;
        this.subject = subject;
    }

    // 3. 메서드
    public void doStudy() {
        System.out.println(name + "학생은 공부를 합니다.");
    }

    @Override
    public String getInfo() {
        return String.format("%s\n당신의 학번은 %s이고, 학과는 %s 입니다.", super.getInfo(), studentId, subject);

    }

}
