package TinhTruuTuong.Example1;

public class HinhVuong extends HinhHoc {

    public HinhVuong(double canh){
        this.canh = canh;
    }

    double canh = 1.0;

    @Override
    public double tinhChuvi() {
        double cv = canh *4;
        return cv;
    }

    @Override
    public double tinhDienTich() {
        double dt = canh*canh;
        return dt;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                ", chu vi=" + tinhChuvi() +
                ", dien tich=" + tinhDienTich() +
                '}';
    }
}
