package StreamFilter;

import javax.swing.text.Position;

public class Employee {
    private String name;
    private double salary;
    private Position position;

    public Employee(String name, double salary, Position position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public Employee() {
    }

    public enum Position {
        JUNIOR,
        MIDDLE,
        SENIOR
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}