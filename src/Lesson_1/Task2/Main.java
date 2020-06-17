package Lesson_1.Task2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Главный класс всей программы
 */
public class Main {

    /**
     * Главный запускаемый метод всей программы
     *
     * @param args опции при запуске (в нашем случае запуск осуществляем без опций)
     */
    public static void main(String[] args) {
        //Задаём 2 разных массива со ссылочным типом данных
        Integer[] arr1 = new Integer[]{2, 3, 4, 6, 4, 8, 4, 2, 7};
        String[] arr2 = new String[]{"str1", "str2", "str3", "str4", "str5"};

        //Проверка работы метода arrToList() на двух массивах разного типа
        System.out.println(arrToList(arr1).add(25)); //выводит в консоль true - значит операция добавления элемента прошла успешно
        arrToList(arr2).add("str6");
    }

    /**
     * Метод, который преобразует массив в ArrayList
     *
     * @param arr передаваемый в метод массив
     * @param <T> тип возвращаемого ArrayList, который берется от заданного массива
     * @return ArrayList соответствующего типа
     */
    public static <T> ArrayList<T> arrToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
