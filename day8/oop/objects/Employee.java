package day8.oop.objects;

public class Employee extends Person {

    // 1. 멤버 변수
    // String name; // 이미 부모의 내용을 다시 작성하는 것은 좋은 상속은 아니다.
    // String age;
    // String phone;
    String employeeId;
    String department;

    // 2. 생성자 - 생략
    public Employee() {
        name = "김사원";
        age = 29;
        employeeId = "20251229";
        department = "프로그램 개발";
    }

    // 3. 메서드
    // @ - 어노테이션

    @Override
    public String getInfo() {
        return String.format("이름 : %s, 나이 : %d, 부서 : %s", name, age, department);
    }

    @Override
    public void doWork() {
        System.out.println(department + " 부서에서 일을 합니다.");
    }

}
