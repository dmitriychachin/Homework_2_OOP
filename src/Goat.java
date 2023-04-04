public class Goat extends Mammal implements Herbivore, Walkable{
    public Goat(String name) {
        super(String.format("коза %s",name));
    }

    @Override
    public String speak() {
        return "Бее-е";
    }

    @Override
    public int runSpeed() {
        return 35;
    }

    @Override
    public int speed() {
        return 35;
    }

    @Override
    public boolean jump() {
        return true;
    }
}
