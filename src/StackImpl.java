public class StackImpl implements Stack {

    private char[] data;
    private int size;

    public StackImpl (char MaxSize) {
        this.data = new char[MaxSize];
//        this.size = 0; // 0 по дефолту
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(char value) {
        data[size++] = value;
    }

    @Override
    public char pop() {
        return data[--size];
    }

    @Override
    public char peek() {
        return data[size - 1];
    }
}
