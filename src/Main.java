import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
//        System.out.println("Singleton 1: "+singleton.hashCode());
//        System.out.println("Singleton 2: "+singleton2.hashCode());
//        System.out.println("Singleton 3: "+singleton3.hashCode());

        printSpread("Enter ", "Your ", "Name ", "Here!");
//        printSpread(new String[]{"Enter ", "Your ", "Name ", "Here!"});
    }

    static void printSpread(String... a) {
        Arrays.stream(a).forEach(System.out::println);
    }
}

class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}

