package javaDay1;

import java.util.Scanner;

public class Bai18 {
    /*Bài 3*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n =");
        int n = in.nextInt();
        in.close();
        double sn = 0;
        for (double i = 1; i <= n; i ++){
            sn += 1/i;
        }
        System.out.println("Tổng ="+sn);
    }
}
