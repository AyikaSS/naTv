import java.util.Scanner;

public class NaturalnyeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число: ");
        int natNum = scn.nextInt();
        int res = 0;
        while (natNum>0){
//            System.out.println(natNum%10+" "+natNum);
            if(res<natNum%10){
                res=natNum%10;
            }
            natNum=natNum/10;

        }
        System.out.println(res);
    }
}
//        С клавиатуры вводится натуральное число.
//        Найти его наибольшую цифру.Например, введено число 764580. Наибольшая цифра в нем 8.