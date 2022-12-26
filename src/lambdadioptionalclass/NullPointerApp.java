package lambdadioptionalclass;

public class NullPointerApp {
    public static void main(String[] args) {
        sayHello("Dhimas");
        sayHello(null);
    }

    public static void sayHello(String name) {
        String nameUpper = name.toUpperCase();
        System.out.println("HELLO " + nameUpper);
    }
}
