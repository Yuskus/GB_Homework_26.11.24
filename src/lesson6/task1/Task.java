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
        CollectionInitialization initializator = new CollectionInitialization();
        LaptopCollection collection = initializator.Initialization();

        Filter filter = new Filter();
        filter.startFilter(collection);

        collection.printCollection("Filtred collection: ");
    }
}
