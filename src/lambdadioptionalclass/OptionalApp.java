package lambdadioptionalclass;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Dhimas");
        sayHello(null);
    }

    public static void sayHello(String name){
        // lebih ringkas
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(value -> System.out.println("HELLO " + value));

        // optional biasa
//        Optional<String> nameOpt = Optional.ofNullable(name);
//        Optional<String> optNameUpper = nameOpt.map(value -> value.toUpperCase());
//        optNameUpper.ifPresent(value -> System.out.println("HELLO " + value));
    }
}
