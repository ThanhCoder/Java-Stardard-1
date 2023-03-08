package JavaDay3;

public class example2 {

    // Viết phương thức tính tổng số thực a và b

    // nhập dữ liệu từ bàn phím-> tính toán
    // truyền trực tiếp đối số -> tính toán

    public static void tinhTong(double a, double b){
        double t = a + b;
        System.out.println("so la:"+t);
    }

    public static void main(String[] args) {
        tinhTong(1.5, 3.2);
    }
}

