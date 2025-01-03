/* Подумать над структурой класса Ноутбук для магазина техники- выделить поля и
методы.
-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или
критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
фильтрации можно хранить в Map.
Например:
Введите цифру, соответствующую необходимому критерию:
1- ОЗУ
2- Объем ЖД
3- Операционная система
4- Цвет …
-Далее нужно запросить минимальные значения для указанных критериев
сохранить параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие
по условиям. */

package lesson6.task1;

import lesson6.task1.Init.CollectionInitialization;
import lesson6.task1.Objects.LaptopCollection;
import lesson6.task1.Search.Filter;

public class Task {
    public static void main(String[] args) {
        // creating initializator
        CollectionInitialization initializator = new CollectionInitialization();

        // initializing a collection by adding 8 laptops
        LaptopCollection collection = initializator.Initialization();

        // creating filter object
        Filter filter = new Filter();

        // start filter (by the way, you can use a few filter criteria)
        filter.startFilter(collection);

        // print collection
        collection.printCollection("Filtred collection: ");
    }
}
