public class Horse extends Animal{
    private String name;
    private int speed;

    public Horse() {
    }

    public Horse(String food, String location, String name, int age, int speed) {
        super(food, location, name, age);
        this.speed = speed;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }
}
