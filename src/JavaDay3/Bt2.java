package JavaDay3;

import java.util.Scanner;

public class Bt2 {


    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số lượng hình tròn: ");
        size = in.nextInt();

        // Khai bao mang int[] arr = new int[3]
        HinhTron[] arr = new HinhTron[size];

        // Nhập dữ liệu cho mảng
        for (int i = 0; i < size; i++) {
            // Nhap chi tiet cho arr[i]
            System.out.println("Hình tròn thứ :" + i);
            System.out.print("Nhập bán kính: ");
            double banKinh = in.nextDouble();
            // Tao doi tuong hinh chu nhat o vi tri index i
            arr[i] = new HinhTron(banKinh);
        }
        in.close();

        // In ra mảng
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }


        // In ra chu vi lớn nhất
        double cvMax = arr[0].tinhChuViHinhTron();
        int ctMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (cvMax < arr[i].tinhChuViHinhTron()) {
                cvMax = arr[i].tinhChuViHinhTron();
                ctMax = i;
            }
        }
        System.out.println("\nHình tròn có chu vi lớn nhất là:" + cvMax);

        // In ra hình tròn có diện tích nhỏ nhất
        double dtMax = arr[0].tinhdienTichHinhTron();
        int vtMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (dtMax > arr[i].tinhdienTichHinhTron()) {
                dtMax = arr[i].tinhdienTichHinhTron();
                vtMax = i;
            }
        }
        System.out.println("Hình tròn có diện tích nhỏ nhất là " + dtMax);

        // Tính chung bình chu vi hình tròn
        double avgChuVi = 0;
        for (HinhTron h : arr) {
                avgChuVi = (avgChuVi + h.tinhChuViHinhTron())/size;
            }
        System.out.println("Trung bình chu vi hình tròn là:" + avgChuVi);

        // Có bao nhiêu hình có chu vi lớn hơn trung bình cộng đó
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            avgChuVi = (avgChuVi + arr[i].tinhChuViHinhTron())/size;
            if(arr[i].tinhChuViHinhTron() < avgChuVi){
                count++;
            }
        }
        System.out.println("Số hình lớn hơn trung bình chu vi là:" + count);


        // Sắp xếp tăng dần(Thuật toán nổi bọt)
//        double temp = arr[0].tinhChuViHinhTron();
//        for (int i = 0 ; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i].tinhChuViHinhTron()> arr[j].tinhChuViHinhTron()) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[j] = temp;
//                }
//            }
//        }
    }
}
