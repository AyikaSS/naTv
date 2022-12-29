import java.util.*;

public class InfoCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(Locale.getDefault());

        System.out.println(calendar.getTime());

    }
}
//abstract class Cal extends Calendar{
//    @Override
//    public String toString() {
//        return
//                "fields=" + Arrays.toString(fields) +
//                ",\n isSet=" + Arrays.toString(isSet) +
//                ",\n time=" + time +
//                ",\n isTimeSet=" + isTimeSet +
//                ",\n areFieldsSet=" + areFieldsSet;
//    }
//}

//    Напишите программу на Java для получения и отображения информации
//        (год, месяц, день, час, минута) календаря по умолчанию.