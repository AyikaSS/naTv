import java.util.Scanner;

public class Laptop {
        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);

            System.out.print("Which model your laptop: ");
            String model = scan.nextLine();
            System.out.print("How long do you use? ");
            String useDate = scan.nextLine();
            System.out.print("Оперативная память вашего ноутбука? ");
            byte memory = scan.nextByte();
            System.out.print("Сколько весит ваш ноутбук? ");
            int kg = scan.nextInt();

        }
    }
