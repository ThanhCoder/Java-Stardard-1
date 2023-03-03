package javaDay1;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        // Nhập 2 số nguyên(long) x và y. In ra trung bình cộng 2 số đó
        long a;
        long b;
        // b2 nhập dữ liệu
        Scanner in = new Scanner(System.in);
        // Nhập a
        System.out.print("a =");
        a = in.nextLong();
        // Nhập b
        System.out.print("b =");
        b = in.nextLong();
        // đóng phần nhập dữ liệu
        in.close();

        // Tính tổng a và b
        double t = (a+b)/2.0;
     }

}
