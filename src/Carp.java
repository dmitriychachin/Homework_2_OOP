public class Carp extends Fish implements Herbivore{
    public Carp(String name) {
        super(String.format("карп %s",name));
    }

    @Override
    public int swimSpeed() {
        return 25;
    }
}
