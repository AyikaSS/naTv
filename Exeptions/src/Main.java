import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        try {
            String name = scanner.next();
            if (!name.matches("[A-z\\d[@$!%*#?&]]{8,}"))
                throw new WrongLoginException("Not matched to regEx");
            else
                System.out.println("логин валиден");
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }


        System.out.println("Enter password: ");
        try {
            String name = scanner.next();
            if (!name.matches("[A-z\\d_]{8,}"))
                throw new WrongPasswordException("Error password");
            else
                System.out.println("пароль валиден у вас");
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");


//        String name = "Alaska1#"
//        System.out.println( );
        }

    }
}