package task11;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Vitalii Myroniuk
 *
 * Особливості змінних capacity та loadFactor в HashMap?
 *
 * Відповідь: Діапазон значень:
 *      0 <= capacity <= 2^30
 *      0 < loadFactor <= Float.MAX_VALUE
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>(0, 2.0f);
        for (int i = 0; i < 10; i++) {
            map.put("1" + i, "1");
            Field[] fields = map.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.getName().equals("table")) {
                    field.setAccessible(true);
                    Object[] table = (Object[]) field.get(map);
                    System.out.println("capacity = " + table.length);
                }
            }
        }
    }
}
