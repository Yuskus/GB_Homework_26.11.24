/* Дана строка базового URL:
 https://example.com/search?
 Сформируйте полный URL, добавив к нему параметры для поиска.
 Параметры передаются в виде строки, где ключи и значения разделены =,
 а пары ключ-значение разделены &. Если значение null, то
 параметр не должен попадать в URL.
 Пример:
 params="query=java&sort=desc&filter=null"
 Результат:
 https://example.com/search?query=java&sort=desc */

package lesson2.task1;

public class Task {
    public static void main(String[] args) {
        String baseURL = args.length == 2 ? args[0] : "https://example.com/search?";
        String params = args.length == 2 ? args[1] : "query=java&sort=desc&filter=null";
        URLBuilder ans = new URLBuilder();
        String resultURL = ans.buildURL(baseURL, params);
        System.out.println(resultURL != null ? resultURL : "Произошла ошибка.");
    }
}