import java.util.Random;

/**
1. Создать массив большого размера (100к элементов).
2. Написать методы удаления, добавления, поиска элемента массива.
3. Заполнить массив случайными числами.
4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
 **/

public class Main {
    private static final int ARRAY_CAPACITY = 100000;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {

        Array arr1 = new ArrayImpl(ARRAY_CAPACITY);
        Array arr2 = new ArrayImpl(ARRAY_CAPACITY);
        Array arr3 = new ArrayImpl(ARRAY_CAPACITY);

        random(arr1, arr2, arr3);

        System.out.println(arr1);

//        arr1.sortSelect();
//        arr1.sortBubble();
        arr1.sortInsert();

        System.out.println(arr1);




    }

    private static void random(Array...arrays){
        Random r = new Random();

        for (int i = 0; i < ARRAY_CAPACITY; i++) {
            int value = r.nextInt(MAX_VALUE);
            for (Array array : arrays) {
                array.add(value);
            }
        }
    }

}


