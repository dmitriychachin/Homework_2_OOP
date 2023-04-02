import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoo {
    private List <Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();

    private static Lake terrarium = new Lake();

    public void addAnimal (Animal newAnimal){
        this.animals.add(newAnimal);
    }

    public void showAll (){
        for (Animal animal: this.animals) {
            System.out.println(animal);
        }
    }

    public void noise (){
        for (Speakable speak:noises()) {
            System.out.print(speak.speak());
        }
        System.out.println();
    }

    private List<Speakable> noises (){
        List<Speakable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Speakable) {
                    res.add((Speakable) animal);
            }
        }
        res.add(radio);
        return res;
    }

    private List<Walkable> runners (){
        List<Walkable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Walkable) {
                res.add((Walkable) animal);
            }
        }
        return res;
    }

    public Animal championByRun () {
        List<Walkable> start = runners();
        Walkable champ = start.get(0);
        for (Walkable runner:start) {
            if (champ.runSpeed()< runner.runSpeed()){
                champ = runner;
            }
        }
        return (Animal)champ;
    }

    private List<Flyable> flyers (){
        List<Flyable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Flyable) {
                res.add((Flyable) animal);
            }
        }
        return res;
    }

    public Animal championByFly () {
        List<Flyable> start = flyers();
        Flyable champ = start.get(0);
        for (Flyable flyer:start) {
            if (champ.flySpeed()< flyer.flySpeed()){
                champ = flyer;
            }
        }
        return (Animal)champ;
    }

    public Animal championBySwim(){
        return this.terrarium.championBySwim(this.animals);
    }

    protected void destroyAquaSystem (){
        Random rnd = new Random();
        int war = 5;
        while (war>0) {
            for (int i = this.animals.size() - 1; i >= 0; i--) {
                if (this.animals.get(i) instanceof Swimable && !(this.animals.get(i) instanceof Walkable) && !(this.animals.get(i) instanceof Pest)) {
                    int event = rnd.nextInt(100);
                    if (event > 10) {
                        this.animals.remove(this.animals.get(i));
                    }
                }
                if (this.animals.get(i) instanceof Swimable && !(this.animals.get(i) instanceof Walkable) && !(this.animals.get(i) instanceof Predator)) {
                    int event = rnd.nextInt(100);
                    if (event > 30) {
                        this.animals.remove(this.animals.get(i));
                    }
                }
            }
            war--;
        }
    }
}
