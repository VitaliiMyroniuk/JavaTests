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
        this.users = users;  // TODO not finished yet
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public List<User> getUsers() {
        List<User> copyOfUsers = new ArrayList<>();
        for (User user : users) {
            User userCopy = new User();
            userCopy.setId(user.getId());
            userCopy.setName(user.getName());
            userCopy.setAge(user.getAge());
            userCopy.setAdmin(user.isAdmin());
            copyOfUsers.add(userCopy);
        }
        return copyOfUsers;
    }

    public Date getDate() {
        return (Date) date.clone();
    }
}
