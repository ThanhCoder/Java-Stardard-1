package javaDay1;

import java.util.Scanner;

public class bai9 {
    /*
    * Giải phương trình bậc nhất ax + b = 0
    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Nhập a
        System.out.print("a =");
        int a = in.nextInt();
        System.out.print("b =");
        int b = in.nextInt();
        in.close();
        if(a == 0 && b!= 0) {
            System.out.println("Phương trình vô nghiệm");
            System.exit(0);
        }
        if(a != 0){
            float x = -b/a;
            System.out.println("Phương trình có nghiệm duy nhất"+x);
            System.exit(0);
        }
        if(a == b && b == 0){
            System.out.println("Phương trình có vô số nghiệm duy nhất với mọi x thộc R");
            System.exit(0);
        }
    }
}
