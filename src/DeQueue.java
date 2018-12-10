public interface DeQueue extends Queue {

    void insertLeft(int value);
    void insertRight(int value);


    int removeLeft();
    int removeRight();


}
