package task3;

/**
 * @author Vitalii Myroniuk
 */
public class Parent {
    private static final String PARENT_STATIC_VARIABLE = init("Parent static variable");
    private String parentVariable1 = init("Parent variable");

    static {
        System.out.println("Static block1 in parent class");
    }

    {
        System.out.println("Block1 in parent class");
    }

    Parent() {
        System.out.println("Parent constructor");
    }

    static {
        System.out.println("Static block2 in parent class");
    }

    {
        System.out.println("Block2 in parent class");
    }

    private static void method() {
        System.out.println("Static method in parent");
    }

    private static String init(String message) {
        System.out.println(message);
        return message;
    }
}
