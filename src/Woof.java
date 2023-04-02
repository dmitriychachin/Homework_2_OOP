public class Woof extends Mammal implements Walkable, Predator{
    public Woof(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Уууррр";
    }

    @Override
    public int runSpeed() {
        return 40;
    }

    @Override
    public int speed() {
        return 40;
    }

    @Override
    public boolean jump() {
        return true;
    }
}
