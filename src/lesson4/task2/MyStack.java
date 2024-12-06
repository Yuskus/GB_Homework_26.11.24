package lesson4.task2;

import java.util.LinkedList;

class MyStack {
    private LinkedList<String> values;

    MyStack() {
        values = new LinkedList<>();
    }

    MyStack(String... params) {
        values = new LinkedList<>();
        for (String value : params) {
            values.offerFirst(value);
        }
    }

    public void push(String element) {
        values.offerFirst(element);
    }

    public String pop() {
        return values.pollFirst();
    }

    public String peek() {
        return values.peekFirst();
    }

    public LinkedList<String> getElements() {
        LinkedList<String> copy = new LinkedList<>();
        for (String value : values) {
            copy.offer(value);
        }
        return copy;
    }
}
