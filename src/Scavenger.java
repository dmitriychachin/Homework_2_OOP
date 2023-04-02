public interface Scavenger extends Feedable{
    default String feed(){
        return "Подгнившее мясо";
    }
}
