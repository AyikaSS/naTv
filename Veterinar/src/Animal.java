public class Animal {
    private String food;
    private String location;
    private String name;
    private int age;

    public Animal() {

    }
    public Animal(String food, String location, String name, int age){
        this.food = food;
        this.location = location;
        this.name = name;
        this.age = age;
    }
    public void makeNoise(){
        System.out.println("The dog is sleeping!");
    }
    public void sleep(){
        System.out.println("They sleep for 10 hours everyday.");;

    }
    public void eat(){
        System.out.println("The animals eating.");

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
