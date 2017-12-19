package task7;

import java.util.*;

/**
 * @author Vitalii_Myroniuk
 *
 * Як переозначити equals та hashCode?
 *
 */
public class Main {
    private ArrayList<User> users;
    private Date date;
    private int[] array;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Main main = (Main) o;

        if (users != null ? !users.equals(main.users) : main.users != null) return false;
        if (date != null ? !date.equals(main.date) : main.date != null) return false;
        return Arrays.equals(array, main.array);

    }

    @Override
    public int hashCode() {
        int result = users != null ? users.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
