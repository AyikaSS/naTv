public class Cat extends Animal{
    private boolean lazy;
    private boolean sinister;

    public Cat(boolean lazy, boolean sinister) {
        this.lazy = lazy;
        this.sinister = sinister;
    }

    public Cat(String food, String location, String name, int age, boolean lazy, boolean sinister) {
        super(food, location, name, age);
        this.lazy = lazy;
        this.sinister = sinister;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    public boolean isSinister() {
        return sinister;
    }

    public void setSinister(boolean sinister) {
        this.sinister = sinister;
    }


    @Override
    public void makeNoise() {
        System.out.println("Кот " + lazy + " мяукает!");
    }

    @Override
    public void sleep() {
        System.out.println("Кот " + lazy + " спит!");
    }
    @Override
    public void eat(){
        System.out.println("Кот "+lazy+" кушает "+ getFood()+" и живёт "+getLocation()+"!");
    }
}
