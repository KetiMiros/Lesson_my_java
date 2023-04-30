/*
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее арифметическое этого списка.
 */

package Lesson_3.Hw;

import java.util.ArrayList;
public class Hw3 {
    public static void searchMinMaxAverage(ArrayList<Integer> list){
        int sum = list.get(0);
        int min = list.get(0);
        int max = list.get(0);
        int temp;
        double average = 0;
        for (int i = 1; i < list.size(); i++) {
            temp = list.get(i); //чтоб не дергать часто метод
            if (temp > max) max = temp;
            if (temp < min) min = temp;
            sum += temp;
        }
        average = sum/list.size();
        System.out.println("Минимум: " + min  + " Максимум: " + max + " Ср.арифметическое: " + (float) sum/list.size());
    }
}
