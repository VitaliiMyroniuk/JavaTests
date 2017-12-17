package task4;

/**
 * @author Vitalii Myroniuk
 *
 * Властивості Integer pool?
 *
 * В-дь:
 * Integer pool – це множина цілих чисел, що міститься в heap і по дефолту складає діапазон [-128, 127].
 * Основні особливості Integer pool демонструє наступний код.
 */
public class Main {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 128;
        Integer i4 = 128;
        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        Integer i7 = Integer.valueOf(127);  // цей запис еквівалентний запису через літерал (те саме, що і1, і2)
        Integer i8 = Integer.valueOf(127);

        System.out.println(i1 == i2);       // true
        System.out.println(i3 == i4);       // false
        System.out.println(i5 == i6);       // false
        System.out.println(i7 == i8);       // true
    }
}
