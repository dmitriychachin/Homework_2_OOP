public class Bat extends Mammal implements Flyable, Predator{
    public Bat(String name) {
        super(name);
    }

    @Override
    public String feed (){
        return "Насекомые";
    }
    @Override
    public String speak() {
        return "Sssss";
    }

    @Override
    public int flySpeed() {
        return 70;
    }

    @Override
    public int speed() {
        return 70;
    }

    @Override
    public boolean jump() {
        return false;
    }
}
