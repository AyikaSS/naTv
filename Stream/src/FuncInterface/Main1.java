package FuncInterface;

public class Main1 {
    public static void main(String[] args) {
        Junior junior = new Junior();
        Senior senior = new Senior();

//        Junior.print();
        Print print = (a,b) -> a+b;
//        print.print();

//        Print print=()-> System.out.println("Hello");
        printAnything(print);
    }

    static void printAnything(Print print) {
//        print.print();
        System.out.println(print.math(2,3));

    }
}