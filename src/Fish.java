public abstract class Fish extends Animal implements Swimable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public boolean jump() {
        return true;
    }

    @Override
    public int speed() {
        return this.swimSpeed();
    }

}
