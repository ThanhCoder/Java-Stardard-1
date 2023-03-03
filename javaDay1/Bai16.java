package javaDay1;

import java.util.Scanner;

public class Bai16 {
    /*Câu 1*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n =");
        int n = in.nextInt();
        in.close();
        long sn = 0;
        for (int i = 1; i <= n; i ++){
            sn = sn + i ;
        }
        System.out.println("Tổng ="+sn);
    }
}
