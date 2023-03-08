package JavaDay4.DongGoi2;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.setChieuDai(1.3);
        hcn1.setChieuRong(1);
        System.out.println("Chu vi hình chữ nhật :"+hcn1.tinhChuVi());
        System.out.println("Diện tích hình chữ nhật :"+hcn1.tinhDienTich());

        HinhChuNhat hcn2 = new HinhChuNhat();
        hcn2.setChieuDai(0);
        hcn2.setChieuRong(4);
        System.out.println("Chu vi hình chữ nhật :"+hcn2.tinhChuVi());
        System.out.println("Diện tích hình chữ nhật :"+hcn2.tinhDienTich());
    }
}
