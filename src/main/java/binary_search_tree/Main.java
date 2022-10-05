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

        boolean isContain = integerBinarySearchTree.contain(21);
        System.out.println(isContain);


        ManagerStudent managerStudent = new ManagerStudent();
        managerStudent.addNewStudent(new Student(1,"Nguyen Van A"));
        managerStudent.addNewStudent(new Student(10,"Nguyen Thi B"));

        System.out.println(managerStudent.findStudentById(10));
    }
}
