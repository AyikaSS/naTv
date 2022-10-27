public class Dog extends Animal{
    private String poroda;

    public Dog() {

    }

    public Dog(String food, String location, String name, int age, String poroda) {
        super(food, location, name, age);
        this.poroda = poroda;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
