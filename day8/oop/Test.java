package day8.oop;

class ExampleObject {
    String name;
    int age;

    ExampleObject(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class OverrideExampleObject extends Object {
    String name;
    int age;

    OverrideExampleObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // 객체 주소가 아닌 필드값 기준으로 비교
        // equals는 Object로 받아와서 형변환 해야함.
        OverrideExampleObject other = (OverrideExampleObject) obj;

        if (this.name == other.name && this.age == other.age) {
            return true;
        }

        return false;
    }
}

class Main {
    public static void main(String[] args) {
        ExampleObject e1 = new ExampleObject("a", 20);
        ExampleObject e2 = new ExampleObject("a", 20);

        System.out.println(e1 == e2); // false
        System.out.println(e1.equals(e2)); // false
        System.out.println(e1.hashCode()); // e1 객체가 저장된 주소값
        System.out.println(e2.hashCode()); // e2 객체가 저장된 주소값
        System.out.println(e1.hashCode() == e2.hashCode()); // false

        System.out.println("========================================");

        OverrideExampleObject overrideE1 = new OverrideExampleObject("a", 20);
        OverrideExampleObject overrideE2 = new OverrideExampleObject("a", 20);

        System.out.println(overrideE1 == overrideE2); // false
        System.out.println(overrideE1.equals(overrideE2)); // true
        System.out.println(overrideE1.hashCode()); // overrideE1 객체가 저장된 주소값
        System.out.println(overrideE2.hashCode()); // overrideE2 객체가 저장된 주소값
        System.out.println(overrideE1.hashCode() == overrideE2.hashCode()); // false
    }
}