package interfaces;

public class Machine implements Remocon {
    public static void main(String[] args) {

    }

    @Override
    public boolean power() {
        return false;
    }

}

class Air extends Machine implements Remocon {
    @Override
    public boolean power() {
        return false;
    }

}

class Computer extends Machine implements Remocon {
    @Override
    public boolean power() {
        return false;
    }
}

class Tv extends Machine implements Remocon {
    @Override
    public boolean power() {
        return false;
    }
}