import java.util.Scanner;

public class AllNumber {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int x = 0;
//
//        while (x < 100) {
//            x = scn.nextInt();
//            if (x > 100) {
//                System.out.println("Вы ввели число больше 100!");
//            } else {
//                System.out.println("Вы ввели число меньше 100!");
//            }
//        }
//    }
//}
        int i = 0; // отвечает количество чисел
        int x = 0;  // отвечает общую сумму (сумма всех чисел)

        do {
            i++;
            x += i;
            System.out.print(i);
            if (i <= 1000) {
                System.out.print("+");
            }
        }while (x <= 1000);
        System.out.print("=" + x);
            }
        }


//        i++;
//        x += i;
//        System.out.print(i);
//        if (i <= 1000) {
//            System.out.print("+");
//        }
//        while (x <= 1000)
//            System.out.print(x);
//    }
//}


//        1. Вывести на экран все числа, пока сумма всех этих чисел не превысит 1000.
//        2. Пользователь вводит число. Программа завершится,
//        когда пользователь введет значение больше 100. Ответ: Вы ввели число больше 100