public class Tuna extends Fish implements Predator{
    public Tuna(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return Predator.super.feed();
    }

    @Override
    public int swimSpeed() {
        return 40;
    }
}
