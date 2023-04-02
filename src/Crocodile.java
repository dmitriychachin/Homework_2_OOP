public class Crocodile extends Reptile implements Predator{
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public int speed() {
        return 16;
    }

    @Override
    public boolean jump() {
        return false;
    }

    @Override
    public int swimSpeed() {
        return 16;
    }

    @Override
    public int runSpeed() {
        return 12;
    }
}
