package vehicles;

import details.Engine;
import professions.Driver;
import vehicles.Car;

public class Lorry extends Car {
    private int lorryCapacity;

    public Lorry(){
        
    }

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, int lorryCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.lorryCapacity = lorryCapacity;
    }

    public int getLorryCapacity() {
        return lorryCapacity;
    }

    public void setLorryCapacity(int lorryCapacity) {
        this.lorryCapacity = lorryCapacity;
    }

    @Override
    public String toString() {
        return "Грузоподъемность: " + lorryCapacity + " тонн.";
    }
    public void carCrush(){
        System.out.println("Грузовик: Я забираю разбитые машины!");
    }

}
