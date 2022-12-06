public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sherlok Holms", 350);
        Book book2 = new Book("Harry Poter", 500);
        Book book3 = new Book("Alica", 250);
        Magazine mag1 = new Magazine("Fortune500", 2000);
        Magazine mag2 = new Magazine("Forbes",1500.50);

        Printable[] printables = {book1, book2, book3, mag1, mag2, new Magazine(), new Book()};
//        Book.printBook(printables);
//        Magazine.printMagazines(printables);
        for (int i = 0; i<printables.length; i++){
            printables[i].print();
        }
    }
}
