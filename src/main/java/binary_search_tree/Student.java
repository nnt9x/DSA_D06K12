package binary_search_tree;

public class Student implements Comparable<Student> {
    private long id;
    private String name;
    private String address;
    private String gender;


    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name, String address, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Student o) {
        if(this.id < o.getId()){
            return -1;
        }
        else if(this.id > o.getId()){
            return 1;
        }
        return 0;
    }
}
