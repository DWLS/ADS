import java.util.Iterator;

public interface ListIterator extends Iterator<Integer> {
    void reset();

    void insertBefor(int value);

    void insertAftert(int value);

}
