public class GoldenFish extends Fish implements Omnivorous {
    private int counter = 0;

    public GoldenFish(String name) {
        super(name);
        this.counter++;
        if (this.counter > 1) {
            destroyEcosystem();
        }
    }

    @Override
    public int swimSpeed() {
        return 20;
    }

    private void destroyEcosystem() {
        int pair;
        if (this.counter % 2 == 0) {
            pair = this.counter / 2;
        } else {
            pair = (this.counter - 1) / 2;
        }
        while (pair>0){
            String name = String.format("generation %d", pair);
            GoldenFish fish = new GoldenFish(name);
        }
    }
}