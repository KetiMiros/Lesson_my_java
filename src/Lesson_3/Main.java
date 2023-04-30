package Lesson_3;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Random;
import Lesson_3.Hw.*;
public class Main {
    public static void main(String[] args) {

        //Task1.generateIntList();
        // ArrayList<String> poetry = new ArrayList<>();
        // poetry.add("Поэзия");
        // poetry.add("Евгений Онегин");
        // poetry.add("Облако в штанах");
        // ArrayList<String> prose = new ArrayList<>();
        // prose.add("Проза");
        // prose.add("Накануне");
        // prose.add("Война и мир");

        // Task2.fillLibrary(poetry);
        // Task2.fillLibrary(prose);
        //Task3.deleteIntFromList();
//Hw1

        ArrayList<Integer> list  = new ArrayList<>();
        Random random = new Random();
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        //list.add(random.nextInt(11));
        //System.out.println(list);
        //Hw1.sortArrayByMerge(list); //Алгоритм Тима Петерса слиянием

        //int[] scr = new int[]{0,7,0,4,1,3};
        //System.out.println("\nПростой массив: 0,7,0,4,1,3 ");
        //My_test_java.mergeSort(scr);

//Hw2

        Hw2.getOnlyEvenDigit(list);

//Hw3

        Hw3.searchMinMaxAverage(list);

//Hw4


        List<Integer> list1 = Hw4.generateLists();
        List<Integer> list2 = Hw4.generateLists();
        //Hw4.getDifferenceOfArrays(list1, list2);

        Hw4.getSymDifferenceOfArrays(list1, list2);
    }


}


