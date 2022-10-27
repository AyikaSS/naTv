public class User {
    String login;
    String password;
    Basket userBuy;
    public User(){}


    public User(String login, String password, Basket userBuy){
        this.login = login;
        this.password = password;
        this.userBuy = userBuy;
    }
}
