package Lesson_1.Task3;

/**
 * Дочерний класс от абстрактного класса {@link Fruit}, служит для хранения объектов-яблок со свойством веса каждого объекта <b>weight</b>
 */
public class Apple extends Fruit{
    //Задаем значение веса каждого яблока
    private float weight = 1.0f;

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
