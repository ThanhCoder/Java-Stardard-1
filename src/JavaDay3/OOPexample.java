package JavaDay3;

import java.util.Scanner;

public class OOPexample
{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.id = 1;
        d1.name = "Hưng";
        d1.age = 23;
        d1.color ="White";
        System.out.println("Tên chó: "+d1.name);
        System.out.println("Tuổi: "+d1.age);
        System.out.println("Màu: "+d1.color);
        d1.run();
        d1.sleep();
        d1.sleep();

        // Gọi đối tượng nhập từ bàn phím
//        Cat cat = new Cat();
//        cat.Name();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.chieuRong = 100;
        hcn.chieuDai = 3;
        System.out.println("Diện tích HCN: "+hcn.dienTich());
        System.out.println("Chu vi HCN :"+hcn.tinhChuVi());

        HinhChuNhat hcn2 = new HinhChuNhat(5,6);
        System.out.printf("Chu vi HCN: %2f Diện tích HCN: %2f ",hcn2.tinhChuVi(),hcn2.dienTich());

        // Nhập từ bàn phím, in ra HCN
        hcn.hinhChuNhat2();

        // Nhập vào 1 mảng HCN in ra hình có diện tích lớn nhất

        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số lượng HCN:");
        size = in.nextInt();
        in.close();
        HinhChuNhat[] arr = new HinhChuNhat[size];
        for (int i=0;i<size;i++){
            System.out.println("Hinh chu nhat thu:" +i);
            System.out.println("Chieu dai:");
            double chieuDai = in.nextDouble();
            System.out.println();
            double chieuRong = in.nextDouble();
            arr[i] = new HinhChuNhat(chieuDai,chieuRong);
        }
        for (int i =0;i<size;i++){
            System.out.println(arr[i].toString());
        }
        double dtMax = arr[0].dienTich();
        int vtMax = 0;
        for (int i = 1;i< arr.length;i++){
            if (dtMax < arr[i].dienTich()){
                dtMax = arr[i].dienTich();
                vtMax = i;
            }
        }
        System.out.println("cv là");
        System.out.println(arr[vtMax].toString());
        System.out.println(dtMax);
    }
}
