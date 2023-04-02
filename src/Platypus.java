public class Platypus extends Mammal implements Walkable, Swimable, Predator{
    public Platypus(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ttt";
    }

    @Override
    public String feed() {
        return "Рыба, трава";
    }

    @Override
    public int runSpeed() {
        return 6;
    }

    @Override
    public int speed() {
        return 12;
    }

    @Override
    public boolean jump() {
        return false;
    }

    @Override
    public int swimSpeed() {
        return 22;
    }
}
