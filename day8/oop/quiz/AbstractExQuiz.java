/*
  어느 동물원에 사육사가 동물을 관리하고 있었습니다. 그런데 동물들에게 먹이를 주는 일을 하려고 한다.
동물들이 다음과 같습니다. 사자, 토끼, 사슴, 악어입니다.
  각 동물에게 주는 먹이는 다르다

ex)
[먹이 주기]
사자 - 고기
토끼 - 당근
사슴 - 건초
악어 - 닭고기
[놀아 주기]
사자 - 사육장 밖에서 뛰어 놀게 합니다.
토끼 - 바위 타기를 시켜줍니다.
사슴 - 나무 사이 숨바꼭질을 합니다.
악어 - 물에서 물장구를 칩니다.


 (추상 클래스) - 사육사 zookeeper
 (자식 클래스 - 사자, 토끼, 사슴, 악어)
 클래스르 구성하고, 해당 동작을 구현하는 객체를 생성하여 적용
*/

package day8.oop.quiz;

public class AbstractExQuiz {
    public static void main(String[] args) {
        ZooKeeper[] z = new ZooKeeper[4];
        z[0] = new Lion("사자", "고기", "사육장 밖에서 뛰어 놀게 합니다.");
        z[1] = new Rabbit("토끼", "당근", "바위 타기를 시켜줍니다.");
        z[2] = new Deer("사슴", "건초", "나무 사이 숨바꼭질을 합니다.");
        z[3] = new Ali("악어", "닭고기", "물에서 물장구를 칩니다.");

        for (ZooKeeper a : z) {
            System.out.println(a);
            System.out.println("=====".repeat(8));
        }
    }
}

abstract class ZooKeeper {
    String animal;
    String food;
    String play;

    public ZooKeeper(String animal, String food, String play) {
        this.animal = animal;
        this.food = food;
        this.play = play;
    }

    abstract String feed();

    abstract String play();

}

class Lion extends ZooKeeper {

    public Lion(String animal, String food, String play) {
        super(animal, food, play);
    }

    @Override
    String feed() {
        return food;
    }

    @Override
    String play() {
        return play;
    }

    @Override
    public String toString() {
        return "Lion \n[" + animal + "는 " + food + "를 먹습니다.\n" + "먹이를 먹은 후 " + play + "]";
    }

}

class Rabbit extends ZooKeeper {
    public Rabbit(String animal, String food, String play) {
        super(animal, food, play);
    }

    @Override
    String feed() {
        return food;
    }

    @Override
    String play() {
        return play;
    }

    @Override
    public String toString() {
        return "Rabbit \n[" + animal + "는 " + food + "를 먹습니다.\n" + " 먹이를 먹은 후 " + play + "]";
    }

}

class Deer extends ZooKeeper {
    public Deer(String animal, String food, String play) {
        super(animal, food, play);
    }

    @Override
    String feed() {
        return food;
    }

    @Override
    String play() {
        return play;
    }

    @Override
    public String toString() {
        return "Deer \n[" + animal + "는 " + food + "를 먹습니다.\n" + " 먹이를 먹은 후 " + play + "]";
    }

}

class Ali extends ZooKeeper {
    public Ali(String animal, String food, String play) {
        super(animal, food, play);
    }

    @Override
    String feed() {
        return food;
    }

    @Override
    String play() {
        return play;
    }

    @Override
    public String toString() {
        return "Ali \n[" + animal + "는 " + food + "를 먹습니다.\n" + " 먹이를 먹은 후 " + play + "]";
    }
}