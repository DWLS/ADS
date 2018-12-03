public class Main3 {

    public static void main (String[] args)  {
        testStack();
//        testBrackets();
//        testQueue();
//        testPriorityQueue();
    }


    private static void testPriorityQueue() {
        Queue queue = new PriorityQueue(5);
        addToQueue(queue, 4);
        addToQueue(queue, 1);
        addToQueue(queue, 5);
        addToQueue(queue, 3);
        addToQueue(queue, 2);

//        removeQueue(queue);
//        removeQueue(queue);


        addToQueue(queue, 6);
        addToQueue(queue, 7);

        while ( !queue.isEmpty() ) {
            System.out.println(queue.remove());
        }

    }

    private static void testQueue() {
        Queue queue = new QueueImpl(5);
        addToQueue(queue, 1);
        addToQueue(queue, 2);
        addToQueue(queue, 3);
        addToQueue(queue, 4);
        addToQueue(queue, 5);

        removeQueue(queue);
        removeQueue(queue);


        addToQueue(queue, 6);
        addToQueue(queue, 7);

        while ( !queue.isEmpty() ) {
            System.out.println(queue.remove());
        }

    }

    private static void removeQueue(Queue queue) {
        if ( !queue.isEmpty() ) {
            queue.remove();
        }
    }

    private static void addToQueue(Queue queue, int value) {
        if ( !queue.isFull() ) {
            queue.insert(value);
        }
    }


    private static void testBrackets() {
        Brackets brackets = new Brackets("    public int peek(] {        return data(size - 1];    ");
        brackets.check();
    }

    private static void testStack() {
        Stack stack = new StackImpl((char) 5);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('f');

        System.out.println("Top stack is " + stack.peek());
        System.out.println("Read stack:");
        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }
}
