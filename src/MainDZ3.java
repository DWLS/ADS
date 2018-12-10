import java.util.Deque;
import java.util.Stack;


public class MainDZ3 {


    /**
     * 1. Реализовать рассмотренные структуры данных в консольных программах.
     * 2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
     * 3. Создать класс для реализации дека.
     */
    public static void main(String[] args) {

        String str = "zxcvb";

        System.out.println(str);

        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();

        DeQueue deq = new DeQueueImpl(4);

        insertLeft(deq, 1);
        insertLeft(deq, 2);
        insertRight(deq, 3);
        insertRight(deq, 4);

        while (!deq.isEmpty()) {
            System.out.print(deq.remove());
        }
    }


    private static void insertLeft(DeQueue deq, int value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static void  insertRight(DeQueue deq, int value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static void removeLeft(DeQueue deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static void removeRight(DeQueue deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }


 }
