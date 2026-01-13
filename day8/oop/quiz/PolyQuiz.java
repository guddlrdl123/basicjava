package day8.oop.quiz;

public class PolyQuiz {
    public static void main(String[] args) {
        Human h;
        h = new Human("홍길동", 15);
        printInfo(h);
        h = new Student("홍학생", 25, "컴퓨터 공학");
        printInfo(h);
        h = new Teacher("홍선생", 45, "자바 프로그래밍");
        printInfo(h);
        h = new Employee("홍직원", 35, "프로그램 개발");
        printInfo(h);
    }

    public static void printInfo(Human human) {
        String className = "";
        if (human instanceof Student) {
            System.out.printf("*".repeat(15) + "%s Info" + "*".repeat(15) + "\n",
                    (human instanceof Student) ? "Student" : "Unknown");
            className = "Student";
        } else if (human instanceof Teacher) {
            System.out.printf("*".repeat(15) + "%s Info" + "*".repeat(15) + "\n",
                    (human instanceof Teacher) ? "Teacher" : "Unknown");
            className = "Teacher";
        } else if (human instanceof Employee) {
            System.out.printf("*".repeat(15) + "%s Info" + "*".repeat(15) + "\n",
                    (human instanceof Employee) ? "Employee" : "Unknown");
            className = "Employee";
        } else if (human instanceof Human) {
            System.out.printf("*".repeat(15) + "%s Info" + "*".repeat(15) + "\n",
                    (human instanceof Human) ? "Human" : "Unknown");
            className = "Human";
        }

        System.out.println(className);
        System.out.println(human);

    }
}
