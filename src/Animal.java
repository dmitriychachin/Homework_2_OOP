public abstract class Animal implements Comparable<Animal>{
    private String name;
    private boolean alive;

    public Animal(String name) {
        this.name = name;
        this.alive = true;
    }

    public void die(){
        this.alive = false;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Животное: %s\n", this.name));
        if (alive == false){
            res.append("Животное погибло\n");
        }
//                .append(String.format("Корм: %s\n", feed()));
//                .append(String.format("Голос: %s\n", speak()));

        return res.toString();

    }

    @Override
    public int compareTo(Animal o) {
        if (!o.alive) return -1;
        if (!this.alive) return 1;
        return (this.name.compareTo(o.name));
    }
}
