package stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập x (hệ 10) từ bàn phím
        // Chuyển đổi x về hệ cơ số 2.

        // Giả chuyển thành dạng 8 bit
        Stack stack = new Stack(8);
        // Nhập x
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x = ");
        int x = in.nextInt();
        in.close();
        // Ý tưởng chia đến khi nào thương bằng 0
        int t = -1, r = -1;
        while (true){
            t = x / 8;
            r = x % 8;
            stack.push(r);
            if(t == 0) break;
            x = t;
        }
        // In ra stack
        System.out.print("Chuyển sang nhị phân: ");
        stack.printStack();
    }
}
