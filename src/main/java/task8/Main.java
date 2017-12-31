package task8;

/**
 * @author Vitalii_Myroniuk
 *
 * Як клонувати об'єкт?
 */
public class Main {
    public static void main(String[] args) throws Throwable {
        StringBuilder name = new StringBuilder("Ivan");
        User user = new User(name, 20);
        System.out.println(user);
        User clone = (User) user.clone();
        name.append("!");
        System.out.println(clone);
    }
}
