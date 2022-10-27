package vehicles;

import details.Engine;
import professions.Driver;

public class Embulance extends Car {

    public Embulance() {
    }

    public Embulance(String brand, String carClass, double weight, Driver driver, Engine engine) {
        super(brand, carClass, weight, driver, engine);
    }
    public void help(){
        System.out.println("Скорая: Я забираю пострадавших!");
    }
}
