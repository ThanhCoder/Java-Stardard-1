package javaDay1;

import java.util.Scanner;

public class bai12 {
    /* Tìm số lớn nhất có 3 chữ số thực a,b,c*/
    public static void main(String[] args) {
    float x,y,z;
    Scanner in = new Scanner(System.in);
        System.out.print("x =");
    x = in.nextFloat();
        System.out.print("y =");
    y = in.nextFloat();
        System.out.print("z =");
    z = in.nextFloat();
        in.close();
        if(x > y && x > z ){
            System.out.println("Số lớn nhất là"+x);
        }
        else if(y > x && y>z) {
            System.out.println("Số lớn nhất là"+y);
        }
        else if(z > x && y < z) {
            System.out.println("Số lớn nhất là"+z);
        }
    }
}
