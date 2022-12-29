package Models;

import Models.enums.CarCondition;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", 5864.45,"Red", 2022, CarCondition.NEW);
//        for (CarCondition c: CarCondition.values()) {
//            System.out.println(c+ " "+c.ordinal());
//        }
        switch (tesla.getCondition()){
            case NEW:
                System.out.println("Машина новая" + " " + tesla.getCondition().name());
                break;
            case RESTORED:
                System.out.println("Машина восстановленная");
                break;
            case USED:
                System.out.println("Машина Б/У");
                break;
            case CRASHED:
                System.out.println("Машина не на ходу");
                break;
        }
    }

}
