import java.util.Scanner;

public class Kopilka {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int sum = scn.nextInt();
        int vznos = 0;
        int kopilka = 0;
        while (kopilka<sum) {
            System.out.print("Введите сумму взноса: ");
            vznos = scn.nextInt();
            kopilka +=vznos;
        }
        System.out.printf("Поздравляем, вы накопили %d сом! ", kopilka);

    }
}
//    Необходимо ввести сумму, которую нужно накопить. Далее вводить значения, пока не накопится нужная сумма.
//        Например:
//        Сколько хотите накопить? 100
//        Взнос: 10
//        Взнос: 30
//        Взнос: 70
//        Поздравляю! Вы накопили 110 сомов!