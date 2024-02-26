package Lessons;

public class Motorbike implements Vehicle{
    public static void main(String[] args) {

    }
    private int speed;

    public Motorbike(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp() {

    }

    @Override
    public void stop() {

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
