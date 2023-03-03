package javaDay1;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        /* Nhập số nguyên x từ bàn phím, in ra x là âm hay dương
        * Input số nguyên x
        * output kết luận am hay dương
        *
        * */
        Scanner in = new Scanner(System.in);
        // Nhập a
        System.out.print("a =");
        int a = in.nextInt();
        in.close();
        if(a>0) {
            System.out.println(a+"la so duong");
        }
        if(a<0){
            System.out.println(a+"la so am");

        }
        if(a == 0){
            System.out.println(a+"la so 0");
        }
    }
}
