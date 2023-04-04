public class GoldenFish extends Fish implements Omnivorous, Pest {
    private static int counter;


    public GoldenFish(String name, Zoo ecosystem) {
        super(name);
        this.counter++;
        if (this.counter > 1 && this.counter <= 30) {
            destroyEcosystem(ecosystem);
        }
    }

    public GoldenFish(String name, Zoo ecosystem, boolean occupation) {
        super(name);
        this.counter++;
        if (occupation) {
            ecosystem.addAnimal(this);
        }
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
            GoldenFish gf = new GoldenFish(name, ecosystem, true);
            ecosystem.addAnimal(gf);
//            if (counter % 30 == 0) ecosystem.destroyAquaSystem();
        } else if (this.counter == 30) {
            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n|   Нельзя было запускать золотых рыбок в этот водоём!   |\n|              Увы, экосистема уничтожена.               |\n|________________________________________________________|");
            System.out.println();
            ecosystem.destroyAquaSystem();
        }
    }


}