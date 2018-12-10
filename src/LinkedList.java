public interface LinkedList extends Iterable<Integer> {

    void add(int value);

    boolean remove(int value);

    char remove();

    boolean find(int value);

    boolean isEmpty();

    int getSize();

    void display();

    char getFirstElement();
}
