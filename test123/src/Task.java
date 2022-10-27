import java.util.Scanner;

public class Task {
        public static void main(String [] args) {
            final String TEAM = "JAVABOOTCAMP2209";

            Scanner scn = new Scanner (System.in);
            System.out.print ("Введите свое имя: ");
            String name = scn.next();

            System.out.print("Введите свой возраст: ");
            int age = scn.nextInt();
            scn.nextLine();

            System.out.print("Место работы: ");
            String work = scn.nextLine();


            System.out.print("Введите ваш рост: ");
            double height = scn.nextDouble();

            System.out.print("Женат/Замужем: ");
            boolean inMarried = scn.nextBoolean();
            System.out.print("Ваш пол: ");
            String gender = scn.next();
            System.out.println("------------------------");
            System.out.printf("Вас %s зовут. \nВаш возраст %d \n"
                    +"Ваше место работы %s \nВаш рост %.2f \nВаш пол %s \n"
                    +"Женат/Замужем %b \n" + "Ваша группа: %s", name, age, work, height, gender, inMarried, TEAM);
        }

    }

