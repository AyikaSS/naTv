package details;

import professions.Driver;

public class Engine extends Driver {
    private int hp;
    private String manufacture;

    public Engine() {
    }
    public Engine(int hp, String manufacture) {
        this.hp = hp;
        this.manufacture = manufacture;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Мощность: " + hp +" лс.,"+" Производитель: " + manufacture+".";
    }
}
