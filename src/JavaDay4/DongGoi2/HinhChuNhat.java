package JavaDay4.DongGoi2;

public class HinhChuNhat {
    // Tạo class Hình chữ nhaajt với 2 thuc tính chiều dài và chiều rộng(private)
    // gia tri mac dinh = 1
    // Co 2 phuong thuc khoi tao mac mdinh va day du tham so
    // + Setter, getter cho từng thuộc tính
    // chu vi
    // Diện tích

    // + viết pt thử nghiệm tạo 2 đối tượng và tính toàn:
    // ++ testcase1: chieudai = 0, chieurong = 4=> tính cv,dt
    // ++ testcase2: chieudai = 1.3, chieurong =3=> tính cv, dt

    private double chieuDai;
    private double chieuRong;

    public double setChieuDai(double chieuDai){
        if (chieuDai > 0){
            this.chieuDai = chieuDai;
        }
        else {
            System.out.println("Chiều dài không hợp lệ");
        }
        return chieuDai;
    }

    public double setChieuRong(double chieuRong){
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        }
        else{
            System.out.println("Chiều rộng không hợp lệ");
        }
        return chieuRong;
    }

    public double getChieuDai(){
        return chieuDai;
    }

    public double getChieuRong(){
        return chieuRong;
    }

    public double tinhChuVi(){
        double cv = (chieuDai + chieuRong)/2;
        return cv;
    }

    public double tinhDienTich(){
        double dt = (chieuDai * chieuRong);
        return dt;
    }
}
