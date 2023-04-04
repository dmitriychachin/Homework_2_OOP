public class Frog extends Amphibian implements Predator{
    public Frog(String name) {
        super(String.format("лягушка %s",name));
    }

    @Override
    public int speed() {
        return 9;
    }

    @Override
    public boolean jump() {
        return true;
    }

    @Override
    public int swimSpeed() {
        return 9;
    }

}
