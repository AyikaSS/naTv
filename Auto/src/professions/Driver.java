package professions;

public class Driver extends Person {
    private String fio;
    private int experience;

    public Driver() {
    }

    public Driver(String fio, int experience, int age, char gender) {
        super(age, gender);
        this.fio = fio;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return fio +", Стаж вождения: " + experience+"г., " +
                "Возраст: " + getAge() + ", пол: " + getGender() ;
    }
}
