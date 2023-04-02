public interface Omnivorous extends Feedable{
    default String feed(){
        return "Мясо разной степени свежести, фрукты овощи";
    }

}
