package task5;

/**
 * @author Vitalii Myroniuk
 *
 * Властивості String pool?
 *
 * В-дь:
 * String pool – це множина літералів String, що містяться в heap.
 * Основні особливості String pool демонструє наступний код.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "He" + "llo";
        String s4 = "He";
        String s5 = "llo";
        String s6 = new String("Hello");
        String s7 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4 + s5);
        System.out.println(s1 == s6);
        System.out.println(s6 == s7);
    }
}
