package Lesson_1.Task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс "Коробка" содержит перечни объектов-фруктов
 * @param <T> определяет какими фруктами заполняется перечень
 */
public class Box<T extends Fruit> {
    T obj;
    private final List<T> count = new ArrayList<>();

    public Box(T obj) {
        this.obj = obj;
    }

    /**
     * Метод для заполнения перечня объектами-фруктами
     * @param count количество объектов, которое необходимо добавить
     */
    public void addFruit(int count) {
        for (int i = 0; i < count; i++) {
            this.count.add(obj);
        }
    }

    /**
     * Метод определяет вес всей "коробки"
     * @return перемножение веса одного объекта-фрукта на количество объектов в списке
     */
    public float getWeight(){
        return obj.getWeight() * count.size();
    }

    /**
     * Метод сравнивает разные "коробки" по весу
     * @param another любая другая "коробка", включая "коробки" с другими объектами-фруктами
     */
    public boolean compareTo(Box<?> another){
        float difference = Math.abs(this.getWeight() - another.getWeight());
        return difference < 0.00001;
    }

    /**
     * Метод заполняет вторую "коробку" объектами первой и удаляет все элементы из превой "коробки" (пересыпание всех фруктов)
     * @param another любая другая "коробка", иключая "коробки" с другими объектами-фруктами
     */
    public void pourInto (Box<T> another){
        another.count.addAll(this.count);
        this.count.clear();
    }

}
