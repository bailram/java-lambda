package pengenalanlambda;

@FunctionalInterface
public interface SimpleAction {

    String action();

    // kalau mau menambahkan method baru bakal error, karena harus 1 method aja
//    String preaction();
}
