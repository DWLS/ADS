import java.util.Random;

public class MainDZ6 {

    /**
     * 1. Создать и запустить программу для построения двоичного дерева.
     * В цикле построить двадцать деревьев с глубиной в 4 уровней.
     * Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
     * Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -20 до 20.
     *
     * 2. Проанализировать, какой процент созданных деревьев являются несбалансированными.
     */


    public static void main(String[] args) {

        Random random = new Random();
        int treeCount = 20;
        int maxLevel = 4;

        int nodeCount = (int) (Math.pow(2,maxLevel) - 1);
        int maxValue = 20;

        int balancedTreeCount = 0;

        boolean treeView = false;

        for (int i = 0; i < treeCount ; i++) {
            Tree tree = new TreeImpl(maxLevel);
            initializationTree(random, nodeCount, maxValue, tree);
                if (tree.isBalanced()) {
                    balancedTreeCount++;
                    if (!treeView) {
                        treeView = true;
                        tree.displayTree();
                    }
                }


        }


    }

    private static void initializationTree(Random random, int nodeCount, int maxValue, Tree tree) {
        for (int i = 0; i < nodeCount ; i++) {
            tree.add(new Person("Andrey", random.nextInt(maxValue * 2 + 1)  - maxValue));
        }
    }
}
