package lambdasebagailazyparameter.readme;

public class BukanLazyApp {
    public static void main(String[] args) {
        testScore(60, getName());
        testScore(85, getName());

        /**
         * Method getName() dipanggil
         * Coba lagi tahun depan
         * Method getName() dipanggil
         * Selamat Dhimas Anda lulus
         */
    }

    public static void testScore(int score, String name) {
        if (score > 80) {
            System.out.println("Selamat " + name + " Anda lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Dhimas";
    }
}
