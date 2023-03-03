package javaDay1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        //Nhập 2 số nguyên từ bàn phím và in ra chúng
        int a;
        int b;
        // b2 nhập dữ liệu
        Scanner in = new Scanner(System.in);
        // Nhập a
        System.out.print("a =");
        a = in.nextInt();
        // Nhập b
        System.out.print("b =");
        b = in.nextInt();
        // đóng phần nhập dữ liệu
        in.close();

        // Tính tổng a và b
        int t = a+b;
        System.out.printf("%d + %d = %d",a,b,t);
    }
}
