package Lesson_1.Task3;

/**
 * Дочерний класс от абстрактного класса {@link Fruit}, служит для хранения объектов-апельсинов со свойством веса каждого объекта <b>weight</b>
 */
public class Orange extends Fruit {
    //Задаем значение веса каждого апельсина
    private float weight = 1.5f;

    /**
     * Метод переопределяет объявление метода {@link Fruit#getWeight} в базовом классе
     */
    @Override
    public float getWeight() {
        return weight;
    }

    /**
     * Метод переопределяет объявление метода {@link Fruit#setWeight} в базовом классе
     */
    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
