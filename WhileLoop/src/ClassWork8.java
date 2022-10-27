import java.util.Scanner;

public class ClassWork8 {
    public static void main(String[] args) {
        final int Pin = 5555;
        Scanner scn = new Scanner(System.in);
        int enterPin = 0;
        int counter = 0;
        while (enterPin != Pin) {
            enterPin = scn.nextInt();
            counter++;
            if (enterPin == Pin) {
                System.out.println("Вы ввели неправильный Пин Код!");
            } else {
                System.out.println("Вы ввели правильный Пин Код!");
            }
            if (counter > 3) break;
        }
        if (counter <= 3) {
            System.out.println("Вы успешно авторизовались!");
        } else {
            System.out.println("Вы мошенник!");
        }
    }
}
