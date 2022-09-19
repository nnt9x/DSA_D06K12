package stack1;

public class Main {
    public static void main(String[] args) {
        MyConverter converter = new MyConverter();
        String out = converter.decToHex(123);
        System.out.println(out);
    }
}
