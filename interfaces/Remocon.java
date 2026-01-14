package interfaces;

public interface Remocon {

    public boolean power();

    default boolean getPower(boolean power) {
        return !power;
    }

    static void statue(boolean power) {
        System.out.println(power);
    }
}
