package lesson2.task3;

class TextCleaner {
    String removeEmptyLines(String text) {
        return text != null ? text.replaceAll("\n+", "\n") : text;
    }
}
