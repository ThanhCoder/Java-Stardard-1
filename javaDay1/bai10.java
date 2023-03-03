package javaDay1;

import java.util.Scanner;

public class bai10 {
    /*
    * Nhập số nguyên x kiểm tra x có phải số chính phuong hay k*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Nhập a
        System.out.print("a =");
        int a = in.nextInt();
        in.close();
        double cp = Math.sqrt(a); // 3.0
        // Ép kiểu
        int cp1 = (int) cp;
        System.out.println(cp1);
        System.out.println(cp);
        if(cp1 == cp ) {
            System.out.println(a+ "là số chính phương");
        }
        else {
            System.out.println(a+ "không phải là số chính phương");
        }
    }
}
