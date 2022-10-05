package binary_search_tree;

public class ManagerStudent {
    private BinarySearchTree<Student> listStudent;

    public ManagerStudent() {
        listStudent = new BinarySearchTree<>();
    }

    public void addNewStudent(Student student){
        listStudent.insert(student);
    }
    public boolean findStudentById(long id){
        Student item = new Student(id);
        return listStudent.contain(item);
    }
}
