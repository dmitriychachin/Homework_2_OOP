public class Shark extends Fish  implements Predator, Pest{
    public Shark(String name){
        super(String.format("Акула %s", name));
    }

    @Override
    public String feed() {
        return Predator.super.feed();
    }

    @Override
    public int swimSpeed() {
        return 60;
    }

    @Override
    public void destroyEcosystem(Zoo ecosystem) {
        ecosystem.destroyAquaSystem();
    }
}
