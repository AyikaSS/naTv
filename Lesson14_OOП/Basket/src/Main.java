import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Category meet = new Category("Мясо", new Staff[]{

                new Staff("Говядина -", 600, 1),
                new Staff("Баранина -", 500, 2),
                new Staff("Курица -", 300, 3),
                new Staff("Рыба -", 450, 4),
        });
        Category bakery = new Category("Выпечка", new Staff[]{
                new Staff("Лепешка -", 27, 1),
                new Staff("Круассаны -", 45, 5),
                new Staff("Булочки -", 90, 10),
        });

        Category tools = new Category("Инструменты", new Staff[]{
                new Staff("Lamp -", 90, 1),
                new Staff("Pliers -", 650, 0),
                new Staff("Socket -", 50, 2),
    });
        Category[] categoies = {meet, bakery, tools};
        Basket myBasket = new Basket();
        User user = new User("Login", "qwerty123", myBasket);

        System.out.println("Введите логин: ");
        String userName = scn.nextLine();
        System.out.println("Введите пароль: ");
        String userPass = scn.nextLine();
        if(userName.equals(user.login)&& userPass.equals(user.password)){
            System.out.println("Вы вошли в систему!");
            System.out.println("Выберите категорию товара: ");
            for(Category i : categoies) {
                System.out.println(i.staffInfo());
            }
        } else System.out.println("Неправильный логин или пароль! ");
    }

}
