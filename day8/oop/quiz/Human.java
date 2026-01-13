package day8.oop.quiz;

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + "]";
    }

}

class Student extends Human {

    String subject;

    public Student(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", subject=" + subject + "]";
    }

}

class Teacher extends Human {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", subject=" + subject + "]";
    }

}

class Employee extends Human {
    String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", department=" + department + "]";
    }

}
