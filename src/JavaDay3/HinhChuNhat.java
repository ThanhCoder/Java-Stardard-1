package JavaDay3;

import java.util.Scanner;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    public HinhChuNhat(){

    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi(){
        return (chieuDai + chieuRong)/2;
    }

    public double dienTich(){
        return chieuDai*chieuRong;
    }

    public void hinhChuNhat2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập chiều dài :");
        int chieuDai = in.nextInt();
        System.out.println("Nhập chiều rộng :");
        int chieuRong = in.nextInt();
        in.close();
        System.out.println("Chiều dài:"+chieuDai);
        System.out.println("Chiều rộng:"+chieuRong);
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
