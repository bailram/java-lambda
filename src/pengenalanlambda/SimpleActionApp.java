package pengenalanlambda;

public class SimpleActionApp {
    public static void main(String[] args) {
        // anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Dhimas";
            }
        };
        /**
         * Dhimas
         */

        System.out.println(simpleAction1.action());

        SimpleAction simpleAction2 = () -> {
          return "Bayu";
        };

        System.out.println(simpleAction2.action());
        /**
         * Bayu
         */
    }
}
