package JavaDay3;

import java.util.Scanner;

public class Cat {
    public void Name(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = in.nextLine();
        System.out.println("Nhập tuổi :");
        int age = in.nextInt();
        in.close();
        System.out.println("Tên mèo:"+name);
        System.out.println("Tuổi mèo:"+age);
    }
}
