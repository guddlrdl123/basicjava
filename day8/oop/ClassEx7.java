package day8.oop;

import day8.oop.objects.Employee;
import day8.oop.objects.Person;
import day8.oop.objects.Student;
import day8.oop.objects.Teacher;

public class ClassEx7 {
    // 상속 관계 테스트

    public static void main(String[] args) {
        // 상속 관계 구성..
        // oop.objects의 Person이 부모
        // Student, Teacher, Employee 생성.
        Person person = new Person("홍길동", 24);
        Student student = new Student("이순신", 45, "123456", "해양학");
        Teacher teacher = new Teacher("유성룡", 50, "2324", "정치학");
        Employee employee = new Employee(); // 부모 생성자 상속 X

        System.out.println(person);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(employee);

        // 오버라이드 (재설정) -> 부모의 내용을 수정해서 초기화
        System.out.println();
        person.doWork();
        teacher.doWork();
        student.doWork();

    }
}
