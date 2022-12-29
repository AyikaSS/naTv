import java.time.Duration;
import java.util.Calendar;
import java.util.Date;



public class DatingDay {
    public static void main(String[] args) {
        int dateDay = 14;
        Calendar cal = Calendar.getInstance();
        Date cdate = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, dateDay);
        Date date = cal.getTime();
        System.out.println("\nCurrent Date: " + cdate+"\n");
        System.out.println("Date day: " + date+"\n");

        System.out.println("До дня свидание осталась " + dateDay + "дней.");

    }
}
//    Напишите программу, чтобы назначить свидание через 2 недели.