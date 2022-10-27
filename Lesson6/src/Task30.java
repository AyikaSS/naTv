import java.util.Scanner;

public class Task30 {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scn.nextInt();

        if (num >= 100 && num <= 999) {
            int firstNum = num / 100;
            int secondNum = num % 100 / 10;
            int thirdNum = num % 10;
            if (num % 2 == 0) {
                int result = firstNum + secondNum + thirdNum;
                System.out.println("Сумма чисел равна: " + result);
            } else {
                int res = firstNum * secondNum * thirdNum;
                System.out.println("Произведение цифр: " + res);
            }
        } else {
            System.out.println("Число не трехзначное");
        }
         System.out.println("Программа завершена!");

    }

}
