package services;

public interface CarService {
    default void start () {
        System.out.println("Машина едет! ");
    }
    void stop();
}
