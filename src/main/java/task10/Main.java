package task10;

import java.util.Collections;

/**
 * @author Vitalii Myroniuk
 *
 * Особливості внутрішніх класів?
 *
 * Відповідь:
 * Внутрішній клас – це клас, який оголошений всередині іншого класу.
 * Розрізняють наступні види внутрішніх класів:
 *  1)	Регулярний внутрішній клас – не є локальним, анонімним та статичним;
 *  2)	Локальний внутрішній клас – оголошений в методі або якомусь блоці;
 *  3)	Анонімний внутрішній клас – клас без явно заданого імені;
 *  4)	Вкладений статичний клас – клас позначений модифікатором static;
 */
public class Main {
    public static void main(String[] args) {
        Outer.Regular regular = new Outer().new Regular("Vitalii", 28);
        Outer.Nested nested = new Outer.Nested(Collections.emptyList());

        System.out.println(regular);
        System.out.println(nested);
        Outer.method("Hello");
    }
}
