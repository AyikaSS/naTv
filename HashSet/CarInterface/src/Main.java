import models.Lorry;
import models.SportCar;
import models.enums.CarCondition;
import services.CarService;
import services.LorryService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        models.SportCar sportCar = new models.SportCar();
//        sportCar.start();

//        LorryService lorry = new Lorry();
//        LorryService car = new SportCar();
//        ((Lorry)lorry).setModel("Tesla");
//
//        testMethod(car);
//        System.out.println(((Lorry)testMethod(lorry)).getModel());
//        car.start();
//        car.stop();
//
//    }
// static LorryService testMethod(LorryService lorryService){
//     System.out.println(lorryService);
//        return lorryService;

        SportCar tesla = new SportCar("Tesla", 2022, 5000.25, CarCondition.NEW);
////        System.out.println(CarCondition.CRASHED.ordinal());
//        for (CarCondition c : CarCondition.values()) {
//            System.out.println(c + " " + c.ordinal());
//        System.out.println(CarCondition.valueOf("USED").ordinal());ordinal
//        switch (tesla.getCondition()) {
//            case NEW -> System.out.println("Машина новая! ");
//            case RESTORED -> System.out.println("Машина восстановленная! ");
//            case USED -> System.out.println("Машина Б/У");
//            case CRASHED -> System.out.println("Машина не на ходу");
        switch (tesla.getCondition()) {
            case NEW:
                System.out.println("Машина новая! " + " " + tesla.getCondition().ordinal());
                break;
            case RESTORED:
                System.out.println("Машина восстановленная! ");
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
