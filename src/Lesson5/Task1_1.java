package Lesson5;
import java.util.*;
import java.util.logging.Logger;
public class Task1_1 {
        public static void main(String[] args) {

        }
        private static final Map<String, List<String>> nameNumber = new HashMap<>();

        public static void run () {


            nameNumber.put("Иванов", Collections.singletonList("+375441515"));//МЕТОД put включает в себя ключ и значение
            nameNumber.put("Сидоров", Collections.singletonList("+375442342"));
            nameNumber.put("Петров", Collections.singletonList("+375234234"));
            nameNumber.put("Широкий", Collections.singletonList("+375234521"));
            nameNumber.put("Батов", Collections.singletonList("+375325643"));
//Можно написать и String String


            System.out.println(nameNumber);
        }
    }

