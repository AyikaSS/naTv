public class Odds_number {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 0; i <= 1000; i++) {
            int x = (int) (Math.random() * (1000 + 1) - 1);
            if (x % 2 == 0) {
                counter++;
            }

        }
        double percent = (100 * counter) / 1000;
        System.out.println(percent);
    }
}
//    Проверить корректность работы генератора псевдослучайных чисел языка программирования
//    с помощью оценки вероятности выпадения четных чисел на выборке не меньше 1000 случайных чисел.
//        Вывести процент четных чисел.