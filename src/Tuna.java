public class Tuna extends Fish implements Predator, Pest{
    public Tuna(String name) {
        super(String.format("тунец %s",name));
    }

    @Override
    public String feed() {
        return Predator.super.feed();
    }

    @Override
    public int swimSpeed() {
        return 40;
    }

    @Override
    public void destroyEcosystem(Zoo ecosystem) {
        ecosystem.destroyAquaSystem();
    }
}
