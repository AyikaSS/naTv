package professions;
public class Person {
    private int age;
    private char gender;

    public Person() {
        }

        public Person(int age, char gender) {
            this.age = age;
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

    }
