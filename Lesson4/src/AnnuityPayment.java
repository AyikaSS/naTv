import java.util.Scanner;

public class AnnuityPayment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Сумма кредита: ");
        int k = scn.nextInt();
        System.out.println("Процентная ставка: ");
        int p = scn.nextInt();
        System.out.println("Кол-во мес-в: ");
        int m = scn.nextInt();
        double amount = 20000;
        double percent = 12;
        double term = 36;
        double perMonth = amount*((percent/12/100)*Math.pow(1+(percent/12/100),term)-1);
        System.out.println(perMonth);
    }

}
//    Формула расчета аннуитетного платежа (А) представляет собой следующее соотношение:
//    А=К*(П/(1+П)-М-1), где К – сумма кредита, П – процентная ставка, М – количество месяцев.
//
///*
//       a=(y*(1+y)^z)/((1+y)^z-1)
//       x – сумма кредита
//       p – процентная ставка в процентах(годовых)
//       y – процентная ставка (сумма в месяц) формула подсчета (x*p/100)/12)
//       z – количество месяцев
//       */