package membuatlambda;

public class LambdaApp {
    public static void main(String[] args) {
        // option 1
        SimpleActionWithParameter simpleActionWithParameter = (String name) -> {
            return name;
        };
        System.out.println(simpleActionWithParameter.action("Dhimas"));
        /**
         * Dhimas
         */

        // option 2
        SimpleActionWithParameter simpleActionWithParameter1 = (name) -> {
            return name;
        };
        System.out.println(simpleActionWithParameter1.action("Bayu"));
        /**
         * Bayu
         */

        // option 3
        SimpleActionWithParameter simpleActionWithParameter2 = (value) -> {
            return value;
        };
        System.out.println(simpleActionWithParameter2.action("Ilham"));
        /**
         * Ilham
         */

        // option oneline
        SimpleActionWithParameter simpleActionWithParameter3 = name -> "Halo " + name;
        System.out.println(simpleActionWithParameter3.action("Ramadhan"));
        /**
         * Halo Ramadhan
         */
    }
}
