import java.util.Scanner;

public class Acquaintance {
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

            System.out.print ("Университет: ");
            String uni = scn.next();

            System.out.print("Желаемая ЗП: ");
            int salary = scn.nextInt();

            System.out.print("Введите ваш рост: ");
            double height = scn.nextDouble();

            System.out.print("Женат/Замужем:");
            boolean inMarried = scn.nextBoolean();

            System.out.print("Ваш пол: ");
            String gender = scn.next();
            System.out.println("------------------------");
            System.out.printf("Вас %s зовут. \nВаш возраст %d \n"
                    +"Ваше место работы %s \nУниверситет %s \nЖелаемая ЗП %d \nВаш рост %.2f \nВаш пол %s \n"
                    +"Женат/Замужем %b \n" + "Ваша группа: %s", name, age, work, uni, salary, height, gender, inMarried, TEAM);
        }

    }
