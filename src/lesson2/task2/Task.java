/*Дан массив объектов, где каждый объект представляет собой строку данных, и
 массив заголовков. Создайте строку CSV, где строки данных разделяются новой
 строкой, а значения в строках разделяются запятыми.
 Пример:
 String[] headers = {"Name","Age","City"};
 String[][] data = {
   { "John", "30", "New York" },
   { "Alice", "25", "Los Angeles" },
   { "Bob", "35", "Chicago" }
 };
 Результат:
 Name, Age, City
 John, 30, NewYork
 Alice, 25, LosAngeles
 Bob, 35, Chicago */

package lesson2.task2;

public class Task {
    public static void main(String[] args) {
        String[] headers = new String[]{"Name", "Age", "City"};
        String[][] data = new String[][] {
          {"John", "30", "New York"},
          {"Alice", "25", "Los Angeles"},
          {"Bob", "35", "Chicago"}
        };
        CSVGenerator ans = new CSVGenerator();
        System.out.println(ans.generateCSV(headers, data));
    }
}