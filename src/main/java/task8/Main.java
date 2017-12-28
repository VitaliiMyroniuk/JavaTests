package task8;

/**
 * @author Vitalii_Myroniuk
 *
 * Як клонувати об'єкт?
 */
public class Main {
    public static void main(String[] args) throws Throwable {
        User user = new User("Ivan", 20);
        System.out.println(user);
        User clone = (User) user.clone();
        user.setAge(22);
        user.setName("Petro");
        System.out.println(user.clone());
        user.finalize();
        System.out.println(user);
    }
}
