import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scn.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scn.nextInt();
        int summa = 1000;

        boolean res = num1 + num2 >=1000|num1%num2==0| num2*2>num1;
        System.out.println(res);

    }
}
        /*
                Введите два числа:
                Сумма чисел должна быть больше или ровно 1000 либо
                результат деления четное число должно быть либо
                второе как минимум вдвое меньше первого

                & первое число больше или равно 700
                */