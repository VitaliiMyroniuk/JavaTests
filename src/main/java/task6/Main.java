package task6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Vitalii Myroniuk
 *
 * Як створити immutable клас?
 *
 * В-дь:
 * 1)	Зробити усі поля private та final.
 * 2)	Видалити усі сетери та методи, які дозволяють змінювати поля класу (якщо поля final, то сетери не потрібні).
 * 3)	Заборонити наслідування. Найпростіший спосіб це зробити – позначити клас модифікатором final.
 *      Інший спосіб – зробити конструктор приватним і створювати об’єкти у статичному фабричному методі.
 * 4)	Якщо клас містить змінні, що посилаються на mutable об’єкт, то потрібно запобігти витоку цих посилань
 *      за межі класу:
 *         a) В конструкторі присвоювати копії mutable об’єктів;
 *         b) В гетерах завжди повертати копії mutable об’єктів.
 */
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ivan", true));
        users.add(new User(2, "Petro", false));
        ImmutableClass immutableClass = new ImmutableClass(1, users, new Date());
        System.out.println(immutableClass);
    }
}
