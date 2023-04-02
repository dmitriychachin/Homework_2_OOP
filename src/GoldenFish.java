public class GoldenFish extends Fish implements Omnivorous, Pest {
    private static int counter;


    public GoldenFish(String name, Zoo ecosystem) {
        super(name);
        this.counter++;
        if (this.counter > 1 && this.counter <= 30) {
            destroyEcosystem(ecosystem);

        }
    }

    @Override
    public int swimSpeed() {
        return 20;
    }

    @Override
    public void destroyEcosystem(Zoo ecosystem) {
        int pair;
        if (this.counter < 30) {
            if (this.counter % 2 == 0) {
                pair = this.counter / 2;
            } else {
                pair = (this.counter - 1) / 2;
            }
            String name = String.format("Золотая рыбка %d-го поколения", pair);
            ecosystem.addAnimal(new GoldenFish(name, ecosystem));
        }
        else if (this.counter == 30) {
            System.out.println("Нельзя было запускать золотых рыбок в этот водоём. \nУвы, экосистема уничтожена.");
            ecosystem.destroyAquaSystem();
        }
    }


}