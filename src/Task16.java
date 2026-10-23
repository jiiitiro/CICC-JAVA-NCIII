import java.util.List;
public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        System.out.println("Fed: " + gorilla.feed(true));
        System.out.println("Fed: " + gorilla.feed(false));
        gorilla.groom();
        gorilla.pet();

        // lambda version
//        List<Runnable> actions = List.of(
//                () -> System.out.println("Fed: " + gorilla.feed(true)),
//                () -> System.out.println("Fed: " + gorilla.feed(false)),
//                gorilla::groom,
//                gorilla::pet);
//
//        actions.forEach(Runnable::run);
    }
}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Putting gorilla food into cage.");
            return true;
        }
        return false;
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla.");
    }
}
