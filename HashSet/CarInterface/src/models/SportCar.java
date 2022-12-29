package models;

import models.Auto;
import models.enums.CarCondition;
import services.LorryService;

public class SportCar extends Auto implements LorryService {
    private String model;
    private int mnfYear;
    private double price;

    private CarCondition condition;

    public CarCondition getCondition() {
        return condition;
    }

    public void setCondition(CarCondition condition) {
        this.condition = condition;
    }

    public SportCar(String model, int mnfYear, double price, CarCondition condition) {
        this.model = model;
        this.mnfYear = mnfYear;
        this.price = price;
        this.condition = condition;
    }

    public SportCar() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMnfYear() {
        return mnfYear;
    }

    public void setMnfYear(int mnfYear) {
        this.mnfYear = mnfYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void stop() {

    }

    @Override
    public void carrying() {

    }

    @Override
    public String toString() {
        return "models.SportCar{" +
                "model='" + model + '\'' +
                ", mnfYear=" + mnfYear +
                ", price=" + price +
                '}';
    }
}
