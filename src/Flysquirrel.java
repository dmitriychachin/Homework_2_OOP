public class Flysquirrel extends Mammal implements Walkable, Flyable, Herbivore {
    public Flysquirrel(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "ктр-ктр-ктр";
    }

    @Override
    public int flySpeed() {
        return 25;
    }

    @Override
    public int runSpeed() {
        return 30;
    }

    @Override
    public int speed() {
        return 27;
    }

    @Override
    public boolean jump() {
        return true;
    }

    @Override
    public String feed() {
        return "Орехи, грибы";
    }
}
