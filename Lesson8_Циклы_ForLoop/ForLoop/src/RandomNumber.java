import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int x = (int) (Math.random() * (100 - 1) + 1);

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
        System.out.println("Введите число (1 - 100) :");
             int num = scn.nextInt();

            if (num == x) {
                System.out.println("Вы угадали! Загаданное число:" +num + "=" + x);
                break;
            } else {
                if (num > x) {
                    System.out.println("Введенное число БОЛЬШЕ загаданного!" +num + ">" + "x");
                } else { System.out.println("Введенное число МЕНЬШЕ загаданного!" +num + "<" + "x");
                }
            }
        }
        System.out.println("Игра закончилась");

    }
}