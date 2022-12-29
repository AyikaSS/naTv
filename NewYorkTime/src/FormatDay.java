import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FormatDay {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy mm dd");
        DateFormat dateFormat2 = new SimpleDateFormat("dd MMM yyyy GG");
        System.out.println(dateFormat2.format(DateFormat.getAvailableLocales()));
        System.out.println(dateFormat1);
        System.out.println(dateFormat);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        try {
            String name = scanner.next();
            if (!name.matches("[A-z\\d[@$!%*#?&]]{8,}"))
                throw new WrongLoginException("Not matched to regEx");
            else
                System.out.println("логин валиден");
        } catch (WrongLoginException e){
            e.printStackTrace();
        }

        System.out.println("Enter password: ");
        try {
            String name = scanner.next();
            if (!name.matches("[A-z\\d_]{8,}"))
                throw new WrongPasswordException("Error password");
            else
                System.out.println("пароль валиден у вас");
        } catch (WrongPasswordException e){
            e.printStackTrace();
        }

    }
}
//    Напишите программу с несколькими форматами даты.