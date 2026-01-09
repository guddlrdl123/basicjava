package day8.oop.objects;

public class Teacher extends Person {

    // 1. 멤버 변수
    String subject;
    String teacherId;

    // 2. 생성자
    public Teacher(String name, int age, String teacherId, String subject) {
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
        this.subject = subject;
    }

    // 3. 메서드
    @Override
    public void doWork() {
        // TODO Auto-generated method stub
        System.out.println("학생들을 가르치고 있습니다.");
    }

}
