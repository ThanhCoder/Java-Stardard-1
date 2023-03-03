package javaDay1;

import java.util.Scanner;

public class bai11 {
    /*
    * switch, case
    * */

    public static void main(String[] args) {
        // Switch case: Lam viec voi cac gia tri cu the
        // nhap vao thang -> hien thi ra so ngay trong thang
        // input: thang - so nguyen (1->12)
        // output: so ngay trong thang
        // 30 ngay: 2 4 6 9 11
        // 31 ngay: 1 3 5 7 8 10 12
        // T2: 28 hoac 29 ngay( Tuy nhuan hay khong)
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào tháng: ");
        int x = in.nextInt();
        System.out.print("Nhập vào năm: ");
        int y = in.nextInt();
        in.close();
        if(x < 1 || x > 12){
            System.out.println("Không hợp lệ");
            System.exit(0);
        }
        switch (x){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("CO 30 ngay");
                break;
            case 2:
                if(y> 1582 && y%400 == 0 || y%4 == 0 && y%100 == 0) {
                    System.out.println("Co 28 hoac 29 ngay");
                }
                else {
                    System.out.println("Co 28 ngay");
                }
                break;
            default:
                System.out.println("CO 31 ngay");
        }
    }
}
