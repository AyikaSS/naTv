import java.util.Scanner;

public class SwitchCase0510 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        ...
        int x = scn.nextInt();
        switch (x) {
            case 1:
                System.out.println("Сегодня понедельник");
                break;
            case 2:
                System.out.println("Сегодня вторник");
                break;
            case 3:
                System.out.println("Сегодня среда");
                break;
            case 4:
                System.out.println("Сегодня четверг");
                break;
            case 5:
                System.out.println("Сегодня пятница");
                break;
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскресенье");
                break;
        }
        System.out.println("Отличный день!");
    }
}
