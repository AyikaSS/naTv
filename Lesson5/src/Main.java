import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Введите номер маршрутки: ");
        int busNum = scan.nextInt();
        System.out.print("Деньги в кармане: ");
        int money = scan.nextInt();
        int bus = 10;
        int fee = 15;

        boolean res = busNum == bus & money >= 15;
        System.out.println(res);
//        System.out.println();
    }
}
