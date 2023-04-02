public interface Predator extends Feedable{
    default String feed(){
        return "Мясо";
    }

}
