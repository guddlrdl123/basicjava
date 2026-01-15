/*
서론 : 동물원에 사육사와 동물들이 있습니다. 사육사는 동물들에게 먹이를 주는 메서드를 통해서 먹이를 줍니다.
    동물별로 먹이가 다르기 때문에 동물별로 메서드를 가져야 합니다. 
    동물들이 계속 추가가 된다면 모든 동물별로 메서드가 만들어져야 합니다. 
    이미 육식 동물과 초식 동물을 나타내기 위해서 각 동물들과 상속받는 형태에서
    상속으로는 문제를 해결할 수 없습니다.

사육사
동물  - 육식 동물(Carnivore)
      - 초식 동물(Herbivore)
    각 동물의 과는 달라도 먹이를 먹는 행동은 같습니다. 위에 클래스로 상속받은 형태에서도 
    다른 범주로 인스턴스들을 묶고 싶을 때, 인터페이스를 사용할 수 있습니다.
    Feed라는 인터페이스를 구현해서 각 동물별로 먹이를 얻는 메서드를 구현, 처리하는 프로그램을 작성해 봅시다.

육식 동물 클래스
동물들의 부모 클래스
calss Carnivore{}
calss Herbivore{}
사육사가 다루는 동물은 Deer, Lion
*/

package interfaces.quiz;

public class ZookeeperQuiz {
    public static void main(String[] args) {

    }

}

interface Feed {
    void feed();
}

class Zookeeper {

    String name;
    String food;

    public Zookeeper() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void feeding(Feed feed, Zookeeper zookeeper) {
        feed.feed();
    }

}

class Carnivore extends Zookeeper {

    public Carnivore(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}

class Herbivore extends Zookeeper {
    String food;
}