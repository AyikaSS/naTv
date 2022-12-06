import java.util.Scanner;

public class DreamJob {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        String str="Cтрана - где я хочу реализовать себя: London" +
//                "\nЕжемесячный гонорар: $1000000L ";
//        System.out.println(str);
        System.out.println("Cтрана - где я хочу реализовать себя: ");
        String country = scn.nextLine();
        System.out.println("Ежемесячный гонорар:");
        int fees = scn.nextInt();

        System.out.println("Удобства для рабочего персонала: ");
        scn.nextLine();
        String comfort = scn.nextLine();
        System.out.println("График работы: ");
        String time = scn.nextLine();


    }
}

//    Опишите работу своей мечты с помощью переменных.
//        Например: страна, зарплата, есть кондиционер, количество рабочих дней и так далее