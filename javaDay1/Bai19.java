package javaDay1;

import java.util.Scanner;

public class Bai19 {
    /* Bài 4*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n =");
        int n = in.nextInt();
        in.close();
        double sn = 0;
        for (double i = 1; i <= n; i++){
            if(i%2 == 0) {
                sn = sn + 1/(2*i);
            }
        }
        System.out.println("Tổng ="+sn);
    }
}
