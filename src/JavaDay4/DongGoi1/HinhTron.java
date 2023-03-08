package JavaDay4.DongGoi1;

public class HinhTron {

    double banKinh = 10;

    public HinhTron(){

    }

    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    public double getBanKinh(){
        return banKinh;
    }

    public double setBanKinh(double banKinh){
        if(banKinh > 0){
            this.banKinh = banKinh;
        }
        else{
            System.out.println("Bán Kính không hợp lệ");
        }
        return banKinh;
    }
}
