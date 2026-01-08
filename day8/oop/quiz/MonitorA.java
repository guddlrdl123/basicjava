package day8.oop.quiz;

public class MonitorA {

    // 멤버변수
    public int resolution;
    public int size;
    public int bright;
    public boolean status;

    public MonitorA() {
        this.resolution = 100;
        this.size = 100;
        this.bright = 100;
        this.status = false; // 생략 가능. 기본값 false
    }

    public void powerButton() {
        this.status = !this.status;
    }

    @Override
    public String toString() {
        return "MonitorA [resolution=" + resolution + ", size=" + size + ", bright=" + bright + ", status=" + status
                + "]";
    }

}
