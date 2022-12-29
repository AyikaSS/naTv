import java.sql.CallableStatement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Calendar cl = new GregorianCalendar();
//        System.out.println(cl.getTime());
//        Date dt = new Date();
//
//        DateFormat dff = new SimpleDateFormat("dd MM yyyy  hh:mm:ss", new Locale("ru"));
//        dff.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//        System.out.println(dff.format(dt));
//        for (String s : TimeZone.getAvailableIDs()){
//            System.out.println(s);

        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
        System.out.println();

    }
}
