package task3;

/**
 * @author Vitalii Myroniuk
 */
public class Child extends Parent {
    private static final String CHILD_STATIC_VARIABLE = init("Child static variable");
    private String childVariable = init("Child variable");

    static {
        System.out.println("Static block in child class");
    }

    {
        System.out.println("Block in child class");
    }

    Child() {
        System.out.println("Child constructor");
    }

    private static String init(String message) {
        System.out.println(message);
        return message;
    }
}
