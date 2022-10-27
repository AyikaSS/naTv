public class Car {
    String model;
    int mnfYear;
    String color;
    double volume;

    public Car() {
    }

    public Car(String model, int mnfYear, String color, double volume){
        this.model = model;
        this.mnfYear = mnfYear;
        this.color = color;
        this.volume = volume;
    }
    public Car(int mnfYear, double volume){
        this.mnfYear = mnfYear;
        this.volume = volume;
    }
    void carInfo(){
        System.out.printf("Модель машины %s, ");
    }

}