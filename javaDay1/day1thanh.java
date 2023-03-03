package javaDay1;

public class day1thanh {
    public static void main(String[] args) {
        // print xuong dong
        System.out.println("Hello");
        // thu va dua nhan xet
        System.out.print("Welcome\t");
        System.out.print("Java1");
        // in du lieu
        String name = "Thanh";
        int year = 2015;
        // frint format
        System.out.printf("\nWelcome to khoa hoc %s, vao nam %d", name, year);
        //Tạo 2 biến lưu năm sinh và tên -> in ra tên và tuổi trên 1 dòng
        String fullname = "Đàm Thận Thanh";
        int namsinh = 2000;
        int tuoi = 2023 - namsinh;
        // \n xuống dòng
        // \t dấu cách
        System.out.printf("\nHo va ten: %s, \tnam nay Tuoi %d", fullname, tuoi);
    }
}
