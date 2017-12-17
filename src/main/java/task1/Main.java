package task1;

/**
 * @author Vitalii Myroniuk
 *
 * Чи можна переозначати статичні методи?
 *
 * В-дь: Ні, в тому сенсі, що не буде днамічного поліморфізму.
 */
class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.method();
        Parent.method();
        Child.method();
    }
}
