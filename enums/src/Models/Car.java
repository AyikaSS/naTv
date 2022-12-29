package Models;

import Models.enums.CarCondition;

public class Car {
    private String model;
    private double price;
    private String color;
    private int mnfYear;


    private CarCondition condition;

    public Car() {
    }

    public Car(String model, double price, String color, int mnfYear, CarCondition condition) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.mnfYear = mnfYear;
        this.condition = condition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMnfYear() {
        return mnfYear;
    }

    public void setMnfYear(int mnfYear) {
        this.mnfYear = mnfYear;
    }

    public CarCondition getCondition() {
        return condition;
    }

    public void setCondition(CarCondition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", mnfYear=" + mnfYear +
                ", condition='" + condition + '\'' +
                '}';
    }
}
