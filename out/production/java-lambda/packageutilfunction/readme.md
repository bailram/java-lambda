### Package java.util.function
- Saat Java 8 keluar dengan fitur Lambda nya
- Java juga menyediakan sebuah package baru bernama java.util.function
- Package ini berisikan banyak sekali functional interface yang bisa kita gunakan untuk kebutuhan membuat lambda
- Dengan menggunakan interface-interface yang ada di package ini, kita mungkin tidak perlu lagi membuat sendiri functional interface secara manual

### Interface Consumer
```java
@FunctionalInterface
public interface Consumer<T> {

    /**
     * Performs this operation on the given argument.
     * 
     * @param t the input argument
     */
    void accept(T t);
    
    ...
```
- melakukan perintah/operasi didalam lambda. ex. lambda buat forEach

### Interface Function
```java
@FunctionalInterface
public interface Function<T, R> {

    /**
     * Applies this function to the given argument.
     * 
     * @param t the function argument
     * @return the function result
     */
    R apply(T t);
    
    ...
```
- membuat lambda dengan memasukkan parameter dan diolah. 
- lalu datanya dikembalikan dengan bentuk yang diinginkan

### Interface Predicate
```java
@FunctionalInterface
public interface Predicate<T> {
    /**
     * Evaluates this predicate on the given argument
     * 
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    boolean test(T t);
    
    ...
```
- untuk melakukan pengecekan pada sebuah parameter dengan return boolean

### Interface Supplier
```java
@FunctionalInterface
public interface Supplier<T> {
    /**
     * Gets a result.
     * 
     * @return a result
     */
    T get();
}
```
- panggil lambda tanpa mengirim parameter buat mendapatkan data

### Dan Masih Banyak
- Function
  - BiConsumer (I)
  - BiFunction (I)
  - BinaryOperator (I)
  - BiPredicate (I)
  - BooleanSupplier (I)
  - Consumer (I)
  - DoubleBinaryOperator (I)
  - DoubleConsumer (I)
  - DoubleFunction (I)
  - DoublePredicate (I)
  - DoubleSupplier (I)
  - DoubleToIntFunction (I)
  - DoubleToLongFunction (I)
  - DoubleUnaryOperator (I)
  - Function (I)
  - IntBinaryOperator (I)
  - IntConsumer (I)
  - IntFunction (I)
  - IntPredicate (I)
  - IntSupplier (I)
  - IntToLongFunction (I)
  - IntUnaryOperator (I)
  - LongBinaryOperator (I)
  - LongConsumer (I)
  - LongFunction (I)
  - LongPredicate (I)
  - LongSupplier (I)
  - LongToDoubleFunction (I)
  - LongToIntFunction (I)
  - LongUnaryOperator (I)
  - ObjDoubleConsumer (I)
  - ObjIntConsumer (I)
  - ObjLongConsumer (I)
  - Predicate (I)
  - Supplier (I)
  - ToDoubleBiFunction (I)
  - ToDoubleIntFunction (I)
  - ToIntBiFunction (I)
  - ToIntFunction (I)
  - ToLongBiFunction (I)
  - ToLongFunction (I)
  - UnaryOperator (I)