public interface Herbivore extends Feedable{
    default String feed (){
        return "Трава";
    }

}
