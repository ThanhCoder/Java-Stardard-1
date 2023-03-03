package javaDay1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        //Nhập 3 số thực float x,y,z
        // In ra tbc và tbn của x,y,z
        // kết quả làm tròn đến số thập phân

        float x,y,z;

        Scanner in = new Scanner(System.in);
        System.out.print("x =");
        x = in.nextFloat();
        System.out.print("y =");
        y = in.nextFloat();
        System.out.print("z =");
        z = in.nextFloat();
        in.close();
        // TBC
        float t = (x+y+z)/3;
        // TBN là số (căn bậc số *), số nhân vd căn bậc 3 của 1*2*3 nếu có 3 số, nếu 4 số là căn bậc 4 của 1*2*3*4
        double tbn =  Math.pow(x*y*z,1.0/3);
        //   Tong la
        System.out.printf("TBC là %3f + %3f + %3f = %f",x,y,z,t);
        System.out.printf("TBN là  %3f",tbn);
    }
}