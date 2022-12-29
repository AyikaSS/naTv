public class Harp implements Instrument {
    private int pedalSize;

    public Harp() {
    }

    public Harp(int pedalSize) {
        this.pedalSize = pedalSize;
    }

    public int getPedalSize() {
        return pedalSize;
    }

    public void setPedalSize(int pedalSize) {
        this.pedalSize = pedalSize;
    }

    @Override
    public void play() {
        System.out.println("Играет арфа с  " + pedalSize + " см размерными педалями!");
    }
}
