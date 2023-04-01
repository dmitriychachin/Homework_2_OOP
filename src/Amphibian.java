public abstract class Amphibian extends Animal implements Walkable, Swimable{
    public Amphibian(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return null;
    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public int swimSpeed() {
        return 0;
    }

    @Override
    public int runSpeed() {
        return 0;
    }
}
