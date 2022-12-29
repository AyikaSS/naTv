public class Main {
    public static void main(String[] args) {
        Harp harp = new Harp(55);
        Violin violin = new Violin(4);
        Guitar guitar = new Guitar(6);
        Instrument[] instruments = {harp, violin, guitar};

        for (Instrument instrument :instruments) {
            if(instrument instanceof Harp);
            instrument.play();
        }



    }
}
