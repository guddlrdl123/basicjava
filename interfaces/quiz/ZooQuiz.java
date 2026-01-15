package interfaces.quiz;

public class ZooQuiz {
    public static void main(String[] args) {
        Zookeeper zk = new Zookeeper();
        zk.feed(new Deer());
        zk.feed(new Lion());

    }
}

class Zookeeper {
    public void feed(Feed feed) {
        System.out.println(feed.getFood() + "를 줍니다.");
    }

}

// 동물들
// 초식, 육식
class Herbivore {
}

class Carnivore {
}

// 사자, 사슴
class Lion extends Carnivore implements Feed {

    @Override
    public String getFood() {
        return "고기";
    }

}

class Deer extends Herbivore implements Feed {

    @Override
    public String getFood() {
        return "건초";
    }
}

// 먹이를 준다...
interface Feed {
    String getFood(); // 추상 클래스 - public abstract 생략
}