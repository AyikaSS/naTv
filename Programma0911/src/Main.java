import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeValueException {
        ArrayList<Double> as = new ArrayList<>();
        Collections.addAll(as, 3d, -6d, 11d, -5d, 22d);
        double b = 11;
        for (Double a:as){
            try {
                if (a<0){
                    throw new NegativeValueException("Для радиуса "+a+" и высоты "+b+"" +
                            " невозможно вычеслить объем");
                } else
                    System.out.printf("%.2f\n", valume(a,b));
            } catch (NegativeValueException e){
                System.out.println(e.getMessage());;
            }

        }

    }
    public static double valume(double a, double b){
        return Math.PI*a*a*b;
    }
}
