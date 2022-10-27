import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //       System.out.println("Your name: ");
        System.out.printf("Your name: %s", name);
        System.out.printf("Your name: %d\n", age);
        System.out.print("Are you single?: ");
        boolean isSingle = scanner.nextBoolean();
        scanner.nextLine();

    }
}