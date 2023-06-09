import java.util.ArrayList;
import java.util.List;

public class Lake extends Zoo{
    @Override
    public void addAnimal(Animal newAnimal) {
        super.addAnimal(newAnimal);
    }

    @Override
    public void showAll() {
        super.showAll();
    }

    private List<Swimable> swimers (List<Animal> animals){
        List<Swimable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Swimable) {
                res.add((Swimable) animal);
            }
        }
        return res;
    }

    public Animal championBySwim (List<Animal> animals) {
        List<Swimable> start = swimers(animals);
        Swimable champ = start.get(0);
        for (Swimable swimer:start) {
            if (champ.swimSpeed()< swimer.swimSpeed()){
                champ = swimer;
            }
        }
        return (Animal)champ;
    }

}
