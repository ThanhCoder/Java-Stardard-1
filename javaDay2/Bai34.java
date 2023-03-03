package javaDay2;

import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
            double t = 0;
            int n;
            Scanner in = new Scanner(System.in);
            // Nhập n
            System.out.print("n =");
            n = in.nextInt();
            in.close();
            for(int i = 1; i <= n ; i++){
                t = Math.sqrt(i + t);
            }
            System.out.println("Sn = "+t);
        }
}
