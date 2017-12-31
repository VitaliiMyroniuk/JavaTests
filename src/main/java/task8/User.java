package task8;

/**
 * @author Vitalii_Myroniuk
 */
public class User implements Cloneable {
    private StringBuilder name;
    private int age;

    public User(StringBuilder name, int age) {
        this.name = name;
        this.age = age;
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
