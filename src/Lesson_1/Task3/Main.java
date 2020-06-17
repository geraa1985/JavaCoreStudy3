package Lesson_1.Task3;

/**
 * Главный класс всей программы
 */
public class Main {

    /**
     * Главный запускаемый метод всей программы
     * @param args опции при запуске (в нашем случае запуск осуществляем без опций)
     */
    public static void main(String[] args) {

        //Создаем собственно фрукты, которыми будем наполнять коробки
        Orange orange = new Orange();
        Apple apple = new Apple();

        //Создаем определенного типа коробки под соответствующие фрукты
        Box <Orange> orangeBox1 = new Box<>(orange);
        Box <Apple> appleBox1 = new Box<>(apple);

        //Заполняем коробки апельсинами и яблоками
        orangeBox1.addFruit(50);
        appleBox1.addFruit(30);

        //Выводим в консоль вес каждой из заполненных коробок
        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox1.getWeight());

        //Сравниваем вес коробки с апельсинами с весом коробки с яблоками
        System.out.println("Равны ли по весу коробки: " + orangeBox1.compareTo(appleBox1));

        //Создаем вторые коробки под соответствующие фрукты
        Box <Orange> orangeBox2 = new Box<>(orange);
        Box <Apple> appleBox2 = new Box<>(apple);

        //Пересыпаем апельсины из первой коробки во вторую (если подставить коробку с яблоками - компилятор заругает)
        orangeBox1.pourInto(orangeBox2);
        System.out.println(orangeBox2.getWeight());
        System.out.println(orangeBox1.getWeight());
    }
}
