package day8.oop.quiz;

public class PersonA {

    public String name;
    public int age;
    public float height;
    public float weight;
    public int birthYear;

    public PersonA(String name) {
        this.name = name;
    }

    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "PersonA [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", birthYear="
                + birthYear + "]";
    }

}
