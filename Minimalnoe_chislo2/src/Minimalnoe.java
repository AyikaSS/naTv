import java.util.Scanner;

public class Minimalnoe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
 //       System.out.println("Enter minimum number: " + Math.min(num1, num2));

       if(num1 > num2){
           System.out.println("Minimalnoe: " + num2);
       }else {
            System.out.println("Minimalnoe: " + num1);
        }

    }
}
//введите 2 числа. Найдите минимальное