import java.util.Calendar;



public class DateObject {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 02);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.YEAR, 2022);


        java.util.Date dt = calendar.getTime();
        System.out.println("Date: "+dt);
    }
}

//    Напишите программу на Java для создания объекта Date с помощью класса Calendar