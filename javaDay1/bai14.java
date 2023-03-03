package javaDay1;

import java.util.Scanner;

public class bai14 {
    /* In ra các số chẵn trong đoạn [a,b]*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a =");
        long a = in.nextLong();
        System.out.print("b =");
        long b = in.nextLong();
        in.close();
        if(a >= b){
            System.out.println("Không thỏa mãn");
            System.exit(0);
        }

        for(long i = a; i <= b; i++){
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

        int count = 0;
        // Có bao nhiêu số lẻ trong khoảng (a,b)
            for(long k = a; k < b; k++)
            {
                if(k%2 != 0)
                {
                    count = count + 1;
                }
            }
        System.out.printf("Số lẻ trong khoảng %d, %d", a,b,count);
    }
}
