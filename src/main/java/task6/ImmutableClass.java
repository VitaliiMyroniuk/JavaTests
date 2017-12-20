package task6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Vitalii Myroniuk
 */
public final class ImmutableClass {
    private final int id;
    private final List<User> users;
    private final Date date;

    public ImmutableClass(int id, List<User> users, Date date) {
        this.id = id;
        this.users =  cloneUsers(users);
        this.date = (Date) date.clone();
    }

    public int getId() {
        return id;
    }

    public List<User> getUsers() {
        return cloneUsers(users);
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", users=" + users +
                ", date=" + date +
                '}';
    }

    private List<User> cloneUsers(List<User> users) {
        List<User> copyOfUsers = new ArrayList<>();
        for (User user : users) {
            User clone = new User(user);
            copyOfUsers.add(clone);
        }
        return copyOfUsers;
    }
}
