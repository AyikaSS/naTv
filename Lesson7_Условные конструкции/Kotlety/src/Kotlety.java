import java.util.Scanner;

public class Kotlety {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество котлет: ");
        int num = scn.nextInt();
        System.out.println("Введите вместимость котлет на сковороде: ");
        int cap = scn.nextInt();
        System.out.println("Введите время прожарки с одной стороны: ");
        int time = scn.nextInt();
        int res;
        if (num% cap==0) {
            res = num/cap*time*2;
            System.out.printf("Вы потратите %d минут\n", res);
        }else {
            res = (num / cap + 1) * time * 2;
            System.out.printf("Вы потратите %d минут\n", res);
        }
        System.out.println("Программа завершена! \n Приятного аппетита!");

    }
}
