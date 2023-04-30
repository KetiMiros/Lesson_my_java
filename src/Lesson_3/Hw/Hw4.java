/*
 * Реализовать разность массивов и симметрическую разность.
 */
package Lesson_3.Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.UnaryOperator;
public class Hw4 {
    public static List<Integer> generateLists() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        System.out.println(list);
        return list;
    }
    public static List<Integer> getDifferenceOfArrays(List<Integer> list1, List<Integer> list2) {
        List<Integer> diff1 = new ArrayList<>(list1);
        List<Integer> diff2 = new ArrayList<>(list2);
        diff1.removeAll(diff2);
        System.out.println("Разность: \n" + diff1);
        return diff1;
    }
    public static void getSymDifferenceOfArrays(List<Integer> list3, List<Integer> list4) {
        List<Integer> copy1 = new ArrayList<>(list3);
        List<Integer> copy2 = new ArrayList<>(list4);
        List<Integer> symdiff1 = new ArrayList<>();
        List<Integer> symdiff2 = new ArrayList<>();
        symdiff1 = getDifferenceOfArrays(copy1, copy2);
        symdiff2 = getDifferenceOfArrays(copy2, copy1);
        symdiff1.addAll(symdiff2);
        System.out.println(symdiff1);


    }
}

