package Lesson_1.Task3;

/**
 * Абстрактный класс для всех фруктов
 */
public abstract class Fruit {

    /**
     * Абстрактный метод определяет вес объектов дочерних классов, все дочерние классы должны переопределить его
     */
    public abstract float getWeight();

    /**
     * Абстрактный метод задает вес объектов дочерних классов, все дочерние классы должны переопределить его
     */
    public abstract void setWeight(float weight);

}
