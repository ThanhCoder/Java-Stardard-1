package javaDay2;

import java.util.Scanner;

public class Bai1Example {
    public static void main(String[] args) {
        String username = "";
        String password = "";
        Scanner in = new Scanner(System.in);
        int count = 3;
        while (count != 0){
            count = count -1;
            System.out.print("Username: ");
            username = in.nextLine();
            System.out.print("Password: ");
            password = in.nextLine();
            if (username.equalsIgnoreCase("thanhdt") && password.equalsIgnoreCase("123")) {
                //thoat khoi vong lap
                System.out.println("Đăng nhập thành công");
                break;
            }
                System.out.printf("Bạn còn %d lần nhập \n", count);
        }
        in.close();
    }
}
