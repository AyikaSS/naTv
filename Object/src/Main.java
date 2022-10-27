import Models.Lorry;
import Services.LorryService;

public class Main {
    public static void main(String[] args) {
//        Models.Car tesla = new Models.Car("Model S");
//        Models.Car tesla1 = new Models.Car("Model S");
////        System.out.println(tesla.hashCode());
////        System.out.println(tesla1.hashCode());
//        System.out.println(Models.Building.inst(tesla1));
        LorryService lorry = new Lorry();
        LorryService car = new SportCar();

        testMethod(car);
        System.out.println();
    }

}
