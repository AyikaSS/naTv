public class Staff {
    String name;
    int price;
    int rating;
    public Staff(){}
    public Staff(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String staffInfo(){
        return String.format("%s %dсомов\n на %d месте\n", name, price, rating);
    }
}
