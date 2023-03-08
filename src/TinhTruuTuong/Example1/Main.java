package TinhTruuTuong.Example1;

import TinhKeThua.HinhVuong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        size = in.nextInt();

        // Khai bao mang int[] arr = new int[3]
        HinhTron[] arr = new HinhTron[size];

        // Nhap du lieu cho mang
            for (int i = 0; i < size; i++) {
            // Nhap chi tiet cho arr[i]
            System.out.println("Hinh tròn thứ " + i);
            System.out.print("Bán Kính: ");
            double banKinh = in.nextDouble();
            arr[i] = new HinhTron(banKinh);
        }
        /////

//        HinhVuong[] arr1 = new HinhVuong[size];
//
//        // Nhap du lieu cho mang
//        for (int i = 0; i < size; i++) {
//            // Nhap chi tiet cho arr[i]
//            System.out.println("Hinh vuông thứ " + i);
//            System.out.print("Cạnh: ");
//            double canh = in.nextDouble();
//            arr1[i] = new HinhVuong(canh);
//        }
        /////
            in.close();
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }

        HinhHoc hinhHocMax = null;
        double dtMax = 0;

        for (HinhTron h : arr){
            if(h.tinhDienTich() > dtMax){
                dtMax = h.tinhDienTich();
                hinhHocMax = h;
            }
        }
        System.out.println("Hinh co dien tich lon nhat là");
        System.out.println(hinhHocMax);

        HinhHoc hinhHocMin = null;
        double dtMin = 0;

        for (HinhTron h : arr){
            if(h.tinhDienTich() < dtMin){
                dtMin = h.tinhDienTich();
                hinhHocMin = h;
            }
        }
        System.out.println("Hinh co dien tich nho nhat là");
        System.out.println(hinhHocMin);
    }
}
