package task2;

/**
 * @author Vitalii Myroniuk
 *
 * Де можна ініціалізувати статичні та нестатичні змінні?
 *
 * В-дь: нестатичні - при оголошенні, динамічному блоці, конструкторі;
 *       статичні - при оголошенні, в статичному блоці, динамічному блоці, конструкторі;
 */
class Main {
    private static String a = "a";
    private static String b;
    private static String c;
    private static String d;
    private static String e;

    static {
        b = "b";
    }

    {
        c = "c";
    }

    private Main() {
        d = "d";
    }

    private static void init() {
        e = "e";
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.a);
        System.out.println(main.b);
        System.out.println(main.c);
        System.out.println(main.d);
        System.out.println(main.e);   // статичний метод не ініціалізує ститичні змінні
    }
}
