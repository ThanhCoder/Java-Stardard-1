package javaDay1;

import java.util.Scanner;

public class bai7 {
    /*
    * Kiem tra có phải năm nhuận không
    * năm 2000,2020,2024 -> năm nhuận
    * năm 1000,2023,1900 -> ko nhuận
    * -100, -200 ko hợp lệ
    * */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Nhập a
        System.out.print("a =");
        int a = in.nextInt();
        in.close();

        if(a%400 == 0 || (a%4 == 0) && (a%100 != 0)) {
            System.out.println(a+"la nam nhuận");
            System.exit(0);
        }
        if(a < 1582){
            System.out.println(a+"không hợp lệ");
            System.exit(0);
        }
        System.out.println("Năm không nhuận");
    }
}
