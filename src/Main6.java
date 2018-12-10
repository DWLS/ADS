public class Main6 {

    public static void main(String[] args) {
        Tree tree = new TreeImpl();
        tree.add(new Person("Andrey", 60));
        tree.add(new Person("Andrey", 25));
        tree.add(new Person("Andrey", 66));
        tree.add(new Person("Andrey", 15));
        tree.add(new Person("Andrey", 45));
        tree.add(new Person("Andrey", 5));
        tree.add(new Person("Andrey", 20));
        tree.add(new Person("Andrey", 30));
        tree.add(new Person("Andrey", 55));
        tree.add(new Person("Andrey", 69));
//        tree.add(new Person("Andrey", 61));
        tree.add(new Person("Andrey", 32));

        System.out.println("Find 15: " + tree.find(15));
        System.out.println("Find 25: " + tree.find(25));
        System.out.println("Find 75: " + tree.find(75));


        //  tree.traverse(TraverseMode.IN_ORDER);
        tree.displayTree();
        tree.remove(25);
        tree.displayTree();



    }



}
