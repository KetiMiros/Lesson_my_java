package Lesson5;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) throws IOException {

            Logger logger = Logger.getLogger(Task2_2.class.getName());          // создаем логгер
            FileHandler fileHandler = new FileHandler("log.txt");        //файлхэндлер создали
            logger.addHandler(fileHandler);                                     //подключение логгера к файлу
            logger.warning("Что-то пошло не так: ");                      //вывод сообщения
            fileHandler.close();                              //Закрытие именно файлхэнжлера не ЛОГЕРА!!!!

            Task1_1.run();
            Task2_2.sortedName();
        }
    }

