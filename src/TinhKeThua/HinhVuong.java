package TinhKeThua;

import JavaDay4.DongGoi2.HinhChuNhat;

public class HinhVuong extends HinhChuNhat {

    //Lấy cạnh chiều dài là 1 cạnh của hình vuông
    public double chuViHinhVuong(double canhvuong){
        double canh = super.setChieuDai(canhvuong);
        double chuvi = canh*4;
        return chuvi;
    }

    public double dienTichHinhVuong(double canhvuong){
        double canh = super.setChieuDai(canhvuong);
        double dienTich = canh*canh;
        return dienTich;
    }
}
