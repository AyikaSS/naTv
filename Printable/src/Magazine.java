public class Magazine implements Printable {
    public String list;
    public double price;

    public Magazine() {
    }

    public Magazine(String list, double price) {
        this.list = list;
        this.price = price;
    }
    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Том каждый день покупает новый журнал. \n"
                +"Name of magazine: " + getList() + "\n Price: " + getPrice());
    }
    public static void printMagazines(Printable[] printable){
        for (Printable magazine :
                printable) {
            if (magazine instanceof Magazine)
                magazine.print();
        }

    }
}
