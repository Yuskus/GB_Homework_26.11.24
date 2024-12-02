/* Дана строка с несколькими строками текста, разделенными переводами строки.
 Напишите метод, который удаляет все пустые строки из текста. */

package lesson2.task3;

public class Task {
    public static void main(String[] args) {
        String text = args.length > 0 ? args[0] : "line1\n\nline2\n\nline3";
        TextCleaner ans = new TextCleaner();
        String result = ans.removeEmptyLines(text);
        System.out.println(result != null ? result : "Произошла ошибка.");
    }
}