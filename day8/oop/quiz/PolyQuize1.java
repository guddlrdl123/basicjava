package day8.oop.quiz;

public class PolyQuize1 {

    public static void main(String[] args) {
        Human h;
        h = new Human("홍길동", 15);
        printInformation(h);
        h = new Student("홍학생", 25, "컴퓨터 공학");
        printInformation(h);
        h = new Teacher("홍선생", 45, "자바 프로그래밍");
        printInformation(h);
        h = new Employee("홍직원", 35, "마케팅");
        printInformation(h);
    }

    public static void printInformation(Human human) {
        String className = "";
        if (human instanceof Student) {
            System.out.printf("*".repeat(15) + " %s Info " + "*".repeat(15) + "\n",
                    human instanceof Student ? "Student" : "Unknown");
            className = "Student";
        } else if (human instanceof Teacher) {
            System.out.printf("*".repeat(15) + " %s Info " + "*".repeat(15) + "\n",
                    human instanceof Teacher ? "Teacher" : "Unknown");
            className = "Teacher";
        } else if (human instanceof Employee) {
            System.out.printf("*".repeat(15) + " %s Info " + "*".repeat(15) + "\n",
                    human instanceof Employee ? "Employee" : "Unknown");
            className = "Employee";
        } else if (human instanceof Human) {
            System.out.printf("*".repeat(15) + " %s Info " + "*".repeat(15) + "\n",
                    human instanceof Human ? "Human" : "Unknown");
            className = "Human";
        }

        System.out.println(className);
        System.out.println(human);
    }

}

class Human {
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
    String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", major=" + major + "]";
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