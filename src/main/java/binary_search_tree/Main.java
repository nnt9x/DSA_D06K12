package binary_search_tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> integerBinarySearchTree = new BinarySearchTree<>();
        integerBinarySearchTree.insert(1);
        integerBinarySearchTree.insert(5);
        integerBinarySearchTree.insert(7);
        integerBinarySearchTree.insert(9);
        integerBinarySearchTree.insert(10);
        integerBinarySearchTree.insert(20);
        integerBinarySearchTree.insert(11);
        integerBinarySearchTree.insert(8);
        System.out.println(integerBinarySearchTree);


        BinarySearchTree<Student> studentBinarySearchTree = new BinarySearchTree<>();
        studentBinarySearchTree.insert(new Student(10,"SV 1"));
        studentBinarySearchTree.insert(new Student(8,"SV 2"));
        studentBinarySearchTree.insert(new Student(9,"SV 3"));
        studentBinarySearchTree.insert(new Student(11,"SV 4"));
        System.out.println(studentBinarySearchTree);

    }
}
