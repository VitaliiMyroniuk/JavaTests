package task10;

import java.util.*;

/**
 * @author Vitalii Myroniuk
 */
public class Outer {
    private static List<String> cities;
    private String name;
    private Set<String> countries = new HashSet<String>() {     // Anonymous class in declaration
        @Override
        public boolean remove(Object o) {
            System.out.println("Not supported remove operation!");
            throw new UnsupportedOperationException();
        }
    };

    static {
        cities = new ArrayList<String>() {                      // Local anonymous class in static block
            @Override
            public boolean remove(Object o) {
                System.out.println("Not supported remove operation!");
                throw new UnsupportedOperationException();
            }
        };
    }

    static class Nested {                           // Nested static class
        Nested(List<String> cities) {
            Outer.cities = cities;
        }
    }

    class Regular {                                 // Regular inner class
        private int age = 25;
        Regular(String name, int age) {
            Outer.this.name = name;
            this.age = age;
        }
    }

    static void method(String message) {
        Date date = new Date();
        class MethodLocal {                         // Local class
            private String end = "!";
            private MethodLocal() {
                System.out.println(date.toString() + ": " + message + end);
            }
        }
        MethodLocal local = new MethodLocal();
        System.out.println(local.end);
    }
}
