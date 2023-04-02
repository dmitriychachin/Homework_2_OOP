public class Bear extends Mammal implements Walkable, Omnivorous, Swimable, Speakable{

    private int speed;
    public Bear(String name, int speed) {
        super(name);
        this.speed = speed;
    }


    @Override
    public String speak() {
        return "РРРЪ";
    }

    @Override
    public int runSpeed() {
        return speed;
    }

    @Override
    public int speed() {
        return 60;
    }

    @Override
    public boolean jump() {
        return true;
    }

    @Override
    public String feed() {
        return Omnivorous.super.feed();
    }

    @Override
    public int swimSpeed() {
        return 35;
    }
}
