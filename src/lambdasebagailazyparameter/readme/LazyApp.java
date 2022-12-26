package lambdasebagailazyparameter.readme;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(60, () -> getName());
        testScore(85, () -> getName());

        /**
         * Anda tidak lulus
         * Method getName() dipanggil
         * Selamat Dhimas Anda lulus
         */
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + " Anda lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Dhimas";
    }
}
