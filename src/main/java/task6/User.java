package task6;

/**
 * @author Vitalii Myroniuk
 */
public class User {
    private int id;
    private String name;
    private boolean isAdmin;

    public User(int id, String name, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    // Copy constructor
    public User(User user) {
        new User(user.getId(), user.getName(), user.isAdmin);
    }

    // Factory method
    public static User newInstance(User user) {
        return new User(user.getId(), user.getName(), user.isAdmin);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
