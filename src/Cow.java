public class Cow extends Mammal implements Walkable{

    public Cow(String name) {
        super(String.format("корова %s",name));
    }

    @Override
    public String speak() {
        return "Мууу";
    }

    @Override
    public int runSpeed() {
        return 20;
    }

    @Override
    public int speed() {
        return 0;
    }

    @Override
    public boolean jump() {
        return false;
    }
}
