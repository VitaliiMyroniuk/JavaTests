package task9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vitalii Myroniuk
 *
 * Різниця між <? extends Animal> та <T extends Animal>
 *
 * Відповідь:
 * <T extends Animal> дозволяє модифікувати об'єкт за рахунок того, що ми завжди можемо закаститись до типу T;
 * У випадку <? extends Animal> ми не можемо закаститись до ?.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        main.method1(animals);
        main.method2(animals);
        main.method3(animals);
    }

    private void method1(List<? extends Animal> animals) {
        System.out.println("Method1 is called...");
//        animals.add(new Dog());                // Не дозволено модифікувати список, бо не можемо закаститись до ?.
        ((List<Animal>) animals).add(new Dog()); // Однак за рахунок зведення типу для списка це обмеження можна обіійти.
        System.out.println(animals);             // Зчитувати дані дозволяється.
        System.out.println();
    }

    private <T extends Animal> void method2(List<T> animals) {
        System.out.println("Method2 is called...");
        animals.add((T) new Dog());
        System.out.println(animals);
        System.out.println();
    }

    private void method3(List animals) {
        System.out.println("Method3 is called...");
        animals.add("Oops!");            // Цей код спрацює без проблем, бо вхідний параметр не є Generic
        System.out.println(animals);
        System.out.println();
    }
}
