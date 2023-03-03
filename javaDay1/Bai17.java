package javaDay1;

import java.util.Scanner;

public class Bai17 {
    /*Câu 2*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n =");
        int n = in.nextInt();
        in.close();
        long sn = 0;
        for (double i = 1; i <= n; i ++){
            double nt = Math.pow(i,2);
            int t = (int) nt;
            sn += t;
        }
        System.out.println("Tổng ="+sn);
    }
}
