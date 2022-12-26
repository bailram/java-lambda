package methodreference;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // static
        // lambda
        Predicate<String> predicateIsLowerCaseLambda = value -> StringUtil.isLowerCase(value);

        // Method reference
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCaseLambda.test("dhimas"));
        System.out.println(predicateIsLowerCase.test("dhimas"));

        // Method reference di parameter
        Function<String, String> funcitonUpper = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        // lambda
        Function<String, String> functionUpperLambda = value -> value.toUpperCase();

        // method referemce
        Function<String, String> functionUpperMethodReference = String::toUpperCase;

        System.out.println(funcitonUpper.apply("Dhimas"));
        System.out.println(functionUpperLambda.apply("Dhimas"));
        System.out.println(functionUpperMethodReference.apply("Dhimas"));
    }


    // non static
    public void run() {
        // lambda
        Predicate<String> predicateIsLowerCaseLambda = value -> MethodReferenceApp.this.isLowerCase(value);

        // Method reference
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCaseLambda.test("dhimas"));
        System.out.println(predicateIsLowerCase.test("dhimas"));
    }

    // object
    public void run2() {
        // lambda
        Predicate<String> predicateIsLowerCaseLambda = value -> MethodReferenceApp.this.isLowerCase(value);

        // Method reference
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCaseLambda.test("dhimas"));
        System.out.println(predicateIsLowerCase.test("dhimas"));
    }

    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) return false;
        }
        return true;
    }
}
