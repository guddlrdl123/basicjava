package day8.oop;

public class ClassEx11 {
    // 다형성 테스트
    // 다형성 조건 - 상속 관계
    // 다형성을 표현할 수 있는 클래스는 부모 클래스(**)

    public static void main(String[] args) {
        // 다형성 예시(다형성 처리할 수 있는 클래스 -> 부모)
        Person p;
        p = new Student("김학생", 23, "20260112");
        // instanceof 연산자 : 객체 비교 연산자. (객체) instanceof (클래스)
        // 객체가 해당 클래스에 속하면 true, 그렇지 않으면 false
        System.out.println(p instanceof Person); // p는 Person
        System.out.println(p instanceof Student); // p는 Student
        p.getDetails(); // Person 객체에 들어가 있는 자식 Student로 Override된 메서드는 자식 거

        // Student 클래스 메서드인 singing()호출
        // p.singsing();
        // 이유 : 객체 p가 다형성으로 Person 클래스에 저장되어 있기 때문에
        // 살행하기 위해서는 Person에 있는 것만 사용이 가능함.
        Student p1 = (Student) p; // Student로 형변환
        p1.singing();
        p = new Teacher("김선생", 45, "JAVA");
        System.out.println(p instanceof Person); // p는 Person?
        System.out.println(p instanceof Teacher); // p는 Teacher?
        p.getDetails();

        // 이종 모음
        Person[] pArr = new Person[4];

        pArr[0] = new Person("홍길동", 15);
        pArr[1] = new Student("홍학색", 24, "컴공");
        pArr[2] = new Teacher("홍선생", 45, "자바");
        pArr[3] = new Employee("홍직원", 35, "마케팅");

        for (Person p2 : pArr)
            p2.getDetails();

    }
}

// ========================================================
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.println(name + "가 걸어갑니다.");
    }

    void doWork() {
        System.out.println(name + "가 일을 합니다.");
    }

    public void getDetails() {
        System.out.println("name=" + name + ", age=" + age);
    }
}

// ========================================================
class Student extends Person {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void singing() {
        System.out.println("노래방에서 노래합니다.");
    }

    @Override
    public void getDetails() {
        System.out.println("name=" + name + ", age=" + age + ", studentId=" + studentId);
    }
}

// ========================================================
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void getDetails() {
        System.out.println("name=" + name + ", age=" + age + ", subject=" + subject);
    }
}

class Employee extends Person {
    String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

}