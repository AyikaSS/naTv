package vehicles;

import details.Engine;
import professions.Driver;

public class Sportcar extends Car {
    private int maxSpeed;

    public Sportcar(){

    }

    public Sportcar(String brand, String carClass, double weight,  Engine engine, Driver driver,int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"\nПредельная скрость: " + maxSpeed;
    }

}
