import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cow("Бурёнка"));
        zoo.addAnimal(new Bear("М.Потапыч", 60));
        zoo.addAnimal(new Platypus("Пэрри"));
        zoo.addAnimal(new Woof("Серый"));
        zoo.addAnimal(new Carp("Усатик"));
        zoo.addAnimal(new Carp("Толстяк"));
        zoo.addAnimal(new Goat("Маня"));
        zoo.addAnimal(new Bat("Микки"));
        zoo.addAnimal(new Bear("Косолапыч", 61));
        zoo.addAnimal(new Tuna("Попрыгунчик"));
        zoo.addAnimal(new Tuna("Обжора"));
        zoo.addAnimal(new GoldenFish("Немо", zoo));
        zoo.addAnimal(new Frog("Царевна"));

        run(zoo);

    }

    public static void run(Zoo zoo) {
        Scanner input = new Scanner(System.in);
        int choise=-1;
        while (choise != 0){
            printMenu();
            choise = input.nextInt();
            switcher(choise, zoo);
        }
    }

    public static void printMenu(){
        StringBuilder header = new StringBuilder();
        header
                .append("г---------------  Меню  ----------------|\n")
                .append("|  1. Показать всех                     |\n")
                .append("|  2. Прислушаться                      |\n")
                .append("|  3. Провести соревнования             |\n")
                .append("|  4. Подселить золотую рыбку Синтию    |\n")
                .append("|       (Нельзя этого делать!           |\n")
                .append("|        Они разрушат экосистему.)      |\n")
                .append("|                                       |\n")
                .append("|  0. Выйти                             |\n")
                .append("|_______________________________________|\n")
                .append("|         Выберите пункт:               |\n");


        System.out.println(header);
    }

    public static void switcher (int choise, Zoo zoo){
        switch (choise) {
            case 1:
                System.out.println("\n Все:");
                zoo.showAll();
                break;
            case 2:
                zoo.noise();
                break;
            case 3:
                System.out.println();
                System.out.println("Чемпион по бегу: ");
                System.out.println(zoo.championByRun());
                System.out.println();
                System.out.println("Чемпион по полёту: ");
                System.out.println(zoo.championByFly());
                System.out.println();
                System.out.println("Чемпион по плаванию: ");
                System.out.println(zoo.championBySwim());
                break;
            case 4:
                zoo.addAnimal(new GoldenFish("Синтия", zoo));

//                System.out.println("\nПогибли:");
//                zoo.showDie();

                System.out.println("\nВыжили:");
                zoo.showSurvive();
                break;
            case 0:
                break;
            default:
                System.out.println("Такого пункта нет, можете просто ходить по зоопарку.");
                zoo.noise();
                zoo.showAll();
                break;
        }
    }
}