public class Person {
    String fio;
    String department;
    int age;
    String gender;


    public Person() {
    }

    public Person(String fio, String department, int age,String gender){
        this.fio = fio;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public Person(String fio, int age) {
        this.fio = fio;
        this.age = age;

    }

    void personInfo() {
        System.out.printf("ФИО: %s.\n Название отдела: %s.\n Возраст сотрудника: %d.\n Пол сотрудника: %s.\n");

    }

    @Override
    public String toString() {
        return "FIO= " + fio + "\n" +
                "Department= " + department + "\n" +
                "Age= " + age + "\n" +
                "Gender= " + gender+"\n-----------------------";
    }
}
