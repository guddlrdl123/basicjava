package day8.oop.quiz;

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("이름 : %s, 나이 : %d\n", name, age);
    }

}

class Student extends Human {

    String subject;

    public Student(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void getInfo() {
        System.out.printf("이름 : %s, 나이 : %d, 학과 : %s\n", name, age, subject);
    }
}

class Teacher extends Human {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void getInfo() {
        System.out.printf("이름 : %s, 나이 : %d, 교과목 : %s\n", name, age, subject);
    }
}

class Employee extends Human {
    String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void getInfo() {
        System.out.printf("이름 : %s, 나이 : %d, 부서 : %s\n", name, age, department);
    }
}
