import java.util.Scanner;

public class LandauFormula {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Кто ввел формулу по женской привлекательности: ");
        String name = scn.next();
        System.out.print("Введите обхват по бюсту: ");
        int k = scn.nextInt();
        System.out.print("Введите см бедра: ");
        int m = scn.nextInt();
        System.out.print("Введите см талии: ");
        int n = scn.nextInt();
        System.out.print("Введите рост в см: ");
        int t = scn.nextInt();
        System.out.print("Введите вес в кг: ");
        int p = scn.nextInt();
        double result = ((k*m*t)/((n*n)*p));
        System.out.println(result);

    }

}
