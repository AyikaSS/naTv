import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.Locale;

public class DayOfWeek {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("RU"));
        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.printf(s + "\n");

        }

    }
}
//    Напишите программу, чтобы получить локализованное название дня в неделе.