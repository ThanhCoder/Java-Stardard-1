package JavaDay3;

public class HinhTron {

    double duongKinh;
    double banKinh;


    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    public double tinhChuViHinhTron(){
        return (2 * banKinh)* 3.14;
    }

    public double tinhdienTichHinhTron(){
        return banKinh * banKinh * 3.14;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "bán kính=" + banKinh +
                ", chu vi=" + this.tinhChuViHinhTron() +
                ", diện tích=" + this.tinhdienTichHinhTron() +
                '}';
    }
}
