import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Person [] subbotnic = new Person[15];
        Person [] subbotnicOnSunday = new Person[5];
        for(int i=0; i<subbotnic.length; i++){
            System.out.println("Введите имя: ");
            String fio = scn.next();
            System.out.println("Введите отдел: ");
            String department = scn.next();
            System.out.println("Введите возраст: ");
            int age = scn.nextInt();
            System.out.println("Введите пол: ");
            String gender = scn.next();
            Person  person = new Person(fio, department, age, gender);
            subbotnic[i] = person;
            System.out.println("-----------------------");

        }
        for (int i=0; i<subbotnicOnSunday.length; i++){
            boolean exists = false;
            int ran = (int) (Math.random()*subbotnic.length);
            for (int r=0; r<subbotnicOnSunday.length; r++) {
                if (subbotnicOnSunday[r] == null) {
                    continue;
                } else if (subbotnicOnSunday[r].fio.equals(subbotnic[ran].fio)) {
                    exists = true;
                    i--;
                    break;
                }
            }if(!exists) subbotnicOnSunday[i]= subbotnic[ran];

            }
        for (Person p:subbotnic){
            System.out.println(p);

        }

    }
}
