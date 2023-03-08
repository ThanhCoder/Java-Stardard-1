package JavaDay4;

import JavaDay4.DongGoi1.HinhTron;
import JavaDay4.donggoi.Student;

public class oop {
    /*
    * tính đóng gói
    * tính trừu tượng
    * tính đa hình
    * */

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 21;
        s1.address = "Bac Ninh";

        HinhTron h = new HinhTron();
        h.setBanKinh(5);
        System.out.println(h.getBanKinh());
    }
}
