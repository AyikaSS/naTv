public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.setColor("Red");
        guitar.setStringCount(6);
        guitar.tune();
//        guitar.play();
        System.out.println("Цвет гитары: " + guitar.getColor() + "\nСколько струн у гитары?" + guitar.getStringCount());
        guitar.play();
    }
}
