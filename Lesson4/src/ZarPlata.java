import java.util.Scanner;
//Формула заработной платы по окладу выглядит следующим образом:
//
//        ЗП = О/Дк * Дф + П – Н — У
//
//        Здесь ЗП – заработная плата по окладу,
//
//        О – оклад работника,
//
//        Дк – количество календарных дней по производственному календарю,
//
//        Дф – количество фактически отработанных дней,
//
//        П – премии и надбавки, стимулирующие и мотивирующие выплаты (могут устанавливаться в определенной сумме или зависеть от определенных факторов),
//
//        Н – налог на доход физического лица, который составляет 13%,
//
//        У – различные удержания (алименты, штрафы)
public class ZarPlata {
    public static void main(String[] args) {
        final double TAX = 0.13;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите оклад: ");
        int o = scn.nextInt();
        System.out.print("Введите кол-во дней: ");
        int dk = scn.nextInt();
        System.out.print("Введите кол-во отроботанных дней: ");
        int df = scn.nextInt();
        System.out.print("Введите сумму премий: ");
        int p = scn.nextInt();
        System.out.print("Введите прочие удержание: ");
        int y = scn.nextInt();
        double salary = (o/dk*df + p)*(1-TAX) - y;
        System.out.println(salary);

    }
}