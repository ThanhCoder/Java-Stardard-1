package javaDay1;

import java.util.Scanner;

public class bai5 {
    /* Tính giá trị của biểu thức
    * A = (2x > 5) and (3y < 10) or (5z +6 >t)
    * với x,y,z,t là số nguyên.
    * */
    public static void main(String[] args) {
        int x,y,z,t;
        Scanner in = new Scanner(System.in);
        System.out.print("x =");
        x = in.nextInt();
        System.out.print("y =");
        y = in.nextInt();
        System.out.print("z =");
        z = in.nextInt();
        System.out.print("t =");
        t = in.nextInt();
        in.close();

        boolean A =(2*x > 5) && (3*y < 10) ||  (5 * z +6 >t);

        System.out.println(A);
    }
}
