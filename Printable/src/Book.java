public class Book implements Printable {
    public int price;
    public String name;

    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Книги -  лекарство для души и ума! \n" + "Name of book: "
                + getName() + "\n Price: " + getPrice());
    }

    public static void printBook(Printable[] printable) {
//        for (Printable printable :
//                printables) {
//            if (printable instanceof Book) {
//                printable.print();
//                System.out.println();
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Book)
                System.out.println("Name of book: " + ((Book) printable[i]).getName());

        }
    }
}
