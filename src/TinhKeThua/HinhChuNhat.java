package TinhKeThua;

public class HinhChuNhat {

    public HinhChuNhat(double chieuDai, double chieuRong){
        if(chieuDai <=0 || chieuRong <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }


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
