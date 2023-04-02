public class Carp extends Fish implements Herbivore{
    public Carp(String name) {
        super(name);
    }

    @Override
    public int swimSpeed() {
        return 25;
    }
}
