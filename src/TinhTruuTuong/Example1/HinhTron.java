package TinhTruuTuong.Example1;

public class HinhTron extends HinhHoc{

    double banKinh = 1.0;

    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuvi() {
        double cv = 2* Math.PI *banKinh;
        return cv;
    }

    @Override
    public double tinhDienTich() {
       double dt = Math.PI * (banKinh*banKinh);
       return dt;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ", chu vi=" + tinhChuvi() +
                ", dien tich=" + tinhDienTich() +
                '}';
    }
}
