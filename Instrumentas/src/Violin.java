public class Violin implements Instrument{
    public int countViolin;

    public Violin() {
    }

    public Violin(int countViolin) {
        this.countViolin = countViolin;
    }

    public int getCount() {
        return countViolin;
    }

    public void setCount(int countViolin) {
        this.countViolin = countViolin;
    }

    @Override
    public void play() {
        System.out.println("Приятный и теплый звук выходит от " + countViolin + " -x струнного виолончеля!");

    }
}
