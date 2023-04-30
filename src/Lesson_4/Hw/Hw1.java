
/*
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернёет «перевёрнутый» список.
 */

package Lesson_4.Hw;

import java.util.LinkedList;

public class Hw1 {
    public static void run() {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.push("первый ");
        stringLinkedList.push("второй ");
        stringLinkedList.push("третий ");
        stringLinkedList.push("четвертый ");
        stringLinkedList.push("пятый ");
        stringLinkedList.push("шестой ");
        stringLinkedList.push("седьмой ");
        System.out.println(stringLinkedList);

        System.out.println(reverseLinkedList(stringLinkedList));
        // Collections.reverse(linklist); // Как говорится, не изобретаем велосипед, но
        // попрубуем и метод
        // System.out.println(linklist);

    }
public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
    LinkedList<String> reversedLinkedList = new LinkedList<String>();
    for (int i = list.size(); i > 0; i--)
        reversedLinkedList.add(list.get(i - 1));

    return reversedLinkedList;
    }

}
