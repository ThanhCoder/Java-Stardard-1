package javaDay1;

import java.util.Scanner;

public class bai8 {
    /* Viết ct nhập số nguyên hỏi số đó là chẵn hay lẻ*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Nhập a
        System.out.print("a =");
        int a = in.nextInt();
        in.close();

        if(a%2 == 0) {
            System.out.println(a+"la nam so chan");
        }
        if(a%2 != 0){
            System.out.println(a+"la so le");

        }
    }
}
