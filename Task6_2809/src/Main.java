import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Введите номер маршрутки: ");
        int Busnum = scan.nextInt();
        System.out.print("Время приезда: ");
        int Bustime = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        boolean res = a > b & b ==15;
        System.out.println(res);
//        System.out.println(b);


    }
}

