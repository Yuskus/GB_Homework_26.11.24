/* Реализуйте MyStack с использованием LinkedList с методами:
> push(String element) - добавляет элемент на вершину стека
> pop() - возвращает элемент с вершины и удаляет его
> peek() - возвращает элемент с вершины, не удаляя
> getElements() - возвращает все элементы стека */

package lesson4.task2;

public class Task {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        if (args.length == 0) {
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
        System.out.println(stack.getElements());
    }
}
