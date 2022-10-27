import java.util.Scanner;

public class MassivTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cityArray = new String[10];
//        for (String i : cityArray) {
//            System.out.println(i);
//        }
//        System.out.println("---------------");
//        cityArray[1] = null;
//        for (String i : cityArray) {
//            System.out.println(i);
//        }
        for (int i = 0; i < cityArray.length; i++) {
            System.out.println("Хотите добавить город? Y/N");
            String yesNo = scan.next();
            if (yesNo.equals("Yes") || yesNo.equals("No")) {
                if (yesNo.equals("Yes")) {
                    System.out.println("Введите название города: ");
                    String city = scan.next();
                    boolean cityInArr = true;
                    for (int j = 0; j < cityArray.length; j++) {
                        if (cityArray[j] != null && cityArray[j].equals(city)) {
                            System.out.println("Этот город в списке!");
                            cityInArr = false;
                            i--;
                            break;
                        }
                    }
                    if (cityInArr) {
                        cityArray[i] = city;
                    }
                } else break;
            } else {
                System.out.println("Вы ввели неправильный символ");
                i--;
            }
        }
        for (int i = 0; i < cityArray.length; i++) {
            System.out.println("Хотите удалить город из списка? ");
            String yesNo = scan.next();
            if (yesNo.equals("Yes") || yesNo.equals("No")) {
                if (yesNo.equals("Yes")) {
                    System.out.println("Введите название города: ");
                    String city = scan.next();
                    boolean cityInArr = true;
                    for (int j = 0; j < cityArray.length; j++) {
                        if (cityArray[j] != null && cityArray[j].equals(city)) {
                            cityInArr = false;
                            System.out.printf("Город %s удален из списка!" , cityArray[j]);
                            cityArray [j]= null;
                        }
                    }
                    if (cityInArr) {
                        System.out.println("Такого города нет в списке!");
                    }
                } else break;
            } else {
                System.out.println("Вы ввели неправильный символ!");
                i--;
                continue;
            }
            int counter = 0;
            for (String j : cityArray) {
                if (j != null) {
                    System.out.println(j);
                } else {
                    counter++;
                }
            }

        }
    }
}

//        Хотите добавить город? y/n
//        y:
//        Название города: Бишкек
//        Город Бишкек успешно добавлен в список
//        n:
//        Останавливаем цикл заполнения городов, и переходим к пункту 1.3
//
//        **Если пользователь ввел неверный символ, вывести соответствующий текст,
//        а также сделать минус одну итерацию
//        чтобы он заполнил пропущенную ячейку, или прекратил заполнение массива
//
//        1.3) Ввести в консоли названия городов для удаления.
//        Хотите удалить город из списка? y  n
//        y:
//        Город Бишкек удален!
//        array[i] = null;
//
//        n:
//        Останавливаем цикл удаление городов, и переходим к пункту 1.4
//
//        Если введенный город не был найден в массиве, выводим сообщение:
//        Такого города нет!
//
//        1.4) Вывести на экран количество позиций со значением null (то есть пустых ячеек массива)
//        1.5) Через цикл foreach распечатать весь список