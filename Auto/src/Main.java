import details.Engine;
import professions.Driver;
import vehicles.Car;
import vehicles.Embulance;
import vehicles.Lorry;
import vehicles.Sportcar;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)throws InterruptedException {
//        Driver shumaher = new Driver("Michael Schumacher", 22, 34, 'M');
//        Engine twoJZ = new Engine(245, "Toyota Motor Company");
//        Car mark2 = new Car("Toyota","Buiseness",1800.0, shumaher, twoJZ);
//        System.out.println(mark2);
//
//        mark2.start();
//        mark2.stop();
//        mark2.turnRight();
//        mark2.turnLeft();

        Engine ferrariE = new Engine(700, "Ferrari Company");
        Driver stick = new Driver("Stick", 15, 47,'m');
        Sportcar ferrari = new Sportcar("Ferrari", "sport", 1300.0, ferrariE, stick, 320 );

        Engine skylineE = new Engine(600, "Nissan");
        Driver john = new Driver("John", 10, 39, 'm');
        Sportcar skyline = new Sportcar("Skyline", "sport", 1200, skylineE, john, 400);

        Engine shelbyE = new Engine(650, "Ford");
        Driver alex = new Driver("Alex", 18, 48, 'm');
        Sportcar shelby = new Sportcar("Shelby", "sport", 1400, shelbyE, alex, 420);

        Engine porsheE = new Engine(800, "Porshe");
        Driver mandarin = new Driver("Mandarin", 3, 22, 'f' );
        Sportcar porshe = new Sportcar("Porshe", "sport", 1360,porsheE, mandarin , 760 );

        Engine mercedesE = new Engine(900, "Mercedes Benz");
        Driver limon = new Driver("Limon", 9, 28, 'f');
        Sportcar mercedes = new Sportcar("Mercedes", "sport", 1570, mercedesE, limon, 480);

        Engine skorayaE = new Engine(150, "Mercedes");
        Driver stig = new Driver("Stig", 10, 36, 'm');
        Embulance skoraya = new Embulance("Mercedes", "skoraya pomosh", 2300, stig , skorayaE);

        Engine lorryE = new Engine(320, "Tesla");
        Driver mark = new Driver("Mark", 19, 40, 'f');
        Lorry gruzovik = new Lorry("Tesla", "gruzovik", 3260, mark, lorryE, 7);

        Sportcar[] sportcars = {ferrari, skyline, shelby, porshe, mercedes};
//
//        skoraya.help();
//        gruzovik.carCrush();
//
//        System.out.println(race(sportcars).getBrand());
        System.out.println(race(sportcars, skoraya,gruzovik));

    }
    public static Sportcar race(Sportcar[] sportcars){
        int randomNum = (int) (Math.random() * sportcars.length);

        return sportcars[randomNum];

        }

        public static String race(Sportcar[] sportcars, Embulance embulance, Lorry lorry) throws InterruptedException{
            System.out.println("Ведущий: Сегодня у нас гонка на Ньюрбургринге! \nПроверка готовности! Скорая готова?");
            Thread.sleep(2000L);
            embulance.help();
            Thread.sleep(1000L);
            System.out.println("Ведущий: Грузовик готов?");
            Thread.sleep(2000L);
            lorry.carCrush();
            Thread.sleep(2000L);
            System.out.println("Ведущий: Гонщики, на старт!");
            Thread.sleep(1000L);
            System.out.println("Ведущий: Внимание!");
            Thread.sleep(1000L);
            System.out.println("Ведущий: Поехали!");
            Thread.sleep(1000L);
            for(Sportcar s:sportcars){
                Thread.sleep(500L);
                s.start();
            }
            Thread.sleep(5000L);
            System.out.println("<<<<-------------->>>>>");
            return "Ведущий: Побеждает спорткар:\n"+race(sportcars).toString();
        }
}

