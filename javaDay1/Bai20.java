package javaDay1;

import java.util.Scanner;

public class Bai20 {
    /* Bài 4*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n =");
        int n = in.nextInt();
        in.close();
        double sn = 1;
        for (double i = 1; i <= n; i++){
                sn = sn + 1/(2*i + 1);
        }
        System.out.println("Tổng ="+sn);
    }
}
