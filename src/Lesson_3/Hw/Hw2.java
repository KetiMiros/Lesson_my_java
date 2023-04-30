 /*
  * Пусть дан произвольный список целых чисел, удалить из него чётные числа
  */

package Lesson_3.Hw;
import java.util.ArrayList;
import java.util.List;

    public class Hw2 {
        public static void getOnlyEvenDigit(ArrayList<Integer> list) { //
            System.out.println("Наш лист " + list);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    list.remove(i);   //Для простого List не сработает
                }
            }

            System.out.println("Результат" + list);

        }
    }



