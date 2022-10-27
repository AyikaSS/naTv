public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi",2014,"black",4400.0);
        Car toyota = new Car("Toyota", 2017,"white", 4200.0);
        Car mersedes = new Car("Mersedes", 1999, "blue", 7000.0);
        Car volvo = new Car("Volvo", 2022, "red", 5200.0);
        calculateTax(audi);
        System.out.println("----------------");
        calculateTax(toyota);
        System.out.println("----------------");
        calculateTax(mersedes);
        System.out.println("----------------");
        calculateTax(volvo);
    }

    static void calculateTax(Car car){
        double res = 0;
        if(car.mnfYear<2015&car.volume>=3000){
            res = + car.volume*0.5;
            System.out.printf("Налог на %s с годом выпуска %d и объёмом %.1f: %.2f сом.\n",
                    car.model, car.mnfYear, car.volume, res);
        } else if(car.mnfYear>=2015&car.volume>=3000) {
            res = +car.volume * 0.3;
            System.out.printf("Налог на %s с годом выпуска %d и объёмом %.1f: %.2f сом.\n" ,
                    car.model, car.mnfYear,car.volume, res);
        } else if(car.mnfYear>=2015&car.volume<3000){
            res = + car.volume*0.5;
            System.out.printf("Налог на %s с годом выпуска %d и объёмом %.1f: %.2f сом.\n" ,
                    car.model, car.mnfYear, car.volume, res);

        }else if(car.mnfYear<=2015&car.volume<=3000) {
            res = +car.volume * 0.5;
            System.out.printf("Налог на %s с годом выпуска %d и объёмом %.1f: %.2f сом.\n" ,
                    car.model, car.mnfYear, car.volume, res);
        }
    }

//    double res = sum (7, 45,5){
//        }
//    static int sum(int x, int y){
//    int z = x*y;
//    return z;
//    }
//    static double sum(int x, int y, int z) {
//    return x+y+z;
//    }

}
// метод посчета налога на авто