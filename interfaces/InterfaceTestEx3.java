package interfaces;

public class InterfaceTestEx3 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 부모 클래스 Pet, 인터페이스 Mammals(extends Animal)
        dog.eat();
        dog.paly();
        dog.running();
        dog.sleep();
        dog.walkingWith();

        Pet pet = dog; // dog는 Pet에 속해 있다.
        Mammals mammals = dog; // dog는 Mammals에 속해 있다.
        Animal animal = dog; // dog는 Animal에 속해 있다.
        pet.paly();
        pet.walkingWith();
        // pet.eat(); // Anibla의 eat() 메서드가 없다.
        mammals.running();
        mammals.eat();
        // mammals.paly(); // Mammals에는 paly() 메서드가 없다.
        animal.eat();
        animal.sleep();
    }
}

// 인터페이스 구현
interface Animal {
    void sleep();

    void eat();
}

// 다중 상속을 위해 선언한 인터페이스

interface Mammals extends Animal {
    String FEATURE = "정온 동물";

    void running();
}

interface Reptiles extends Animal {
    String FEATURE = "변온 동물";

    void hiding();
}

interface Fish extends Animal {
    String FEATURE = "아가미가 있다.";

    void swimming();
}

class Pet {
    void paly() {
        System.out.println("애완 동물과 놀아요.");
    }

    void walkingWith() {
        System.out.println("애완 동물과 산책해요.");
    };
}

class Dog extends Pet implements Mammals {

    // Mammal
    @Override
    public void running() {
        System.out.println("개는 달려요.");

    }

    // Animal
    @Override
    public void eat() {
        System.out.println("개는 밥을 먹어요");

    }

    // Animal
    @Override
    public void sleep() {
        System.out.println("개는 잠을자요");

    }

}