import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = scn.nextDouble();
        System.out.println("Enter second number:");
        double b = scn.nextDouble();
        System.out.println("Which operation:");
        String operator = scn.next();

        if (operator.equals("+")) {
            System.out.println("Result:" + (a+b) );
        }else if (operator.equals("-")){
            System.out.println("Result" + (a-b) );
        }else if (operator.equals("*")){
            System.out.println("Result:" + (a*b));
        }else if(operator.equals("/")){
            if (b==0) {
                System.out.println("cannot divide by zero");
            }else {
                System.out.println("Result:" + (a / b));
            }
        }else{
            System.out.println("Error: underfined operator!");
        }
    }
}
