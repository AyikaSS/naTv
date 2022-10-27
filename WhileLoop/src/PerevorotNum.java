import java.util.Scanner;

public class PerevorotNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("");
        int x = scn.nextInt();
        int res = 0;
        while (x > 0) {
            res = 10 * res + x % 10;
            x/=10;
        }
        System.out.println(res);
    }
}

//     Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
//        Например, если введено число 3486, то надо вывести число 6843.