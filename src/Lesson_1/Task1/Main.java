package Lesson_1.Task1;

/**
 * Главный класс всей программы
 */
public class Main {

    /**
     * Главный запускаемый метод всей программы
     * @param args опции при запуске (в нашем случае запуск осуществляем без опций)
     */
    public static void main(String[] args) {
        //Задаём 2 разных массива со ссылочным типом данных
        Integer[] arr1 = new Integer[]{2, 3, 4, 6, 4, 8, 4, 2, 7};
        String[] arr2 = new String[]{"str1", "str2", "str3", "str4", "str5"};

        //Проверяем работу метода массивом с элементами типа Стринг
        for (String i: arr2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        chIndx(arr2,1,3);
        for (String i: arr2) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        //Проверяем работу метода массивом с элементами типа Интеджер
        for (Integer i: arr1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        chIndx(arr1,1,3);
        for (Integer i: arr1) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        //Проверяем работу метода с обработкой исключения выхода за рамки массива
        for (String i: arr2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        chIndx(arr2,1,5);
        for (String i: arr2) {
            System.out.print(i + "\t");
        }System.out.println("\n");
    }

    /**
     * Статический метод класса {@link Main} меняет местами два элемента массива любого ссылочного типа данных
     * @param <T> обобщенный ссылочный тип данных
     * @param arr массив, в котором надо поменять местами элементы
     * @param index1 индекс первого элемента массива
     * @param index2 индекс второго элемента массива
     * @throws ArrayIndexOutOfBoundsException исключение, вызванное неверным указанием индексов
     */
    public static <T> void chIndx(T[] arr, int index1, int index2) {
        try {
            T temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Заданные Вами индексы выходят за пределы массива!");
        }
    }
}
