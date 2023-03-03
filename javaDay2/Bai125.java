package javaDay2;

import java.util.Scanner;

public class Bai125 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        // Nhập n
        System.out.print("n =");
        int n = in.nextInt();
        in.close();
        // Kiểm tra xem phải số nguyên tố không
        if(n < 0){
            System.out.print("Không hợp lệ");
            System.exit(0);
        }
        if(n <= 1){
            System.out.println("Không phải số tự nhiên");
            System.exit(0);
        }
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n);i++){
            if(n%i == 0){
                // Chỉ cần tìm 1 giá trị chia không phải 1 và n
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Là số nguyên tố");
        }
        else {
            System.out.println("Ko là số nguyên tố");
        }
    }
}
