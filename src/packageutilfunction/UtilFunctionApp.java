package packageutilfunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UtilFunctionApp {
    public static void main(String[] args) {
        // Consumer
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("Dhimas Bayu");
        /**
         * Dhimas Bayu
         */

        // Function
        Function<String, Integer> functionLength = value -> value.length();
        System.out.println(functionLength.apply("Dhimas"));
        /**
         * 6
         */

        // Predicate
        Predicate<String> predicateCheckBlank = value -> value.isBlank();
        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Dhimas"));
        /**
         * true
         * false
         */

        // Supplier
        Supplier<String> supplierName = () -> "Dhimas Bayu";
        System.out.println(supplierName.get());
        /**
         * Dhimas Bayu
         */
    }
}
