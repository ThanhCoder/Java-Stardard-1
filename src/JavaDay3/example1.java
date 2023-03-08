package JavaDay3;

import java.util.Random;
import java.util.Scanner;

public class example1 {

    // Trả về không có tham số
    public static void inChuoiVietHoa(String s){
        System.out.println(s.toUpperCase());
    }

    // trả về có tham số
    public static void layText(String language){
        System.out.println("Welcome to Java" + language );
    }

    //Hàm có giá trị trả về mà k có tham số - OOP
    public static int getRandomNumber(){
        return new Random().nextInt(1000);
    }

    public static void layText1(){
        System.out.println("Thanh Đẹp trai");
    }

    //Viết hàm tính tổng 3 số x,y,z
    public static double tonHaiSo(double a,double b){
         double tong = a + b;
         return tong;
    };

    // Bài 116
    public static int tinhTong(int n){
        int tong = 0;
        for(int i =1;i<= n;i++){
            tong += i;
        }
        return tong;
    }

    // Bài 117
    public static int tinhTongBinhPhuong(int n, int x){
        int tong = 0;
        for(int i =1;i<= x;i++){
            tong += Math.pow(x,i);
        }
        return tong;
    }

    public static double luyThua(double a, int b){
    // tri tuyệt đối của b
        if(b == 0)
            return 1;


        int _b = Math.abs(b);
        double t = 1;
        for (int i =0;i<= _b;i++){
            t *= a;
        }
        if(b>0){
            return t;
        }
        return 1/t;
    }
    public static void main(String[] args) {
        // Viết hàm input chuỗi bất kỳ, in ra chuỗi viết hoa
        // tên hàm: inChuoiVietHoa()
        // Danh sách tham số(input) : String s
        // Kết quả trả về void

        // Static tĩnh-> phương thức thuộc lớp
        // Nếu không có static -> phương thức thuộc đối tượng

        inChuoiVietHoa("Hello");
        inChuoiVietHoa("Thanh");
        layText("Thanh");
        layText1();

        // Những hàm và phương thức không có giá trị trả về
        int number1 = getRandomNumber();
        int number2 = getRandomNumber();
        int c = number1 + number2;
        System.out.println("Tổng :"+c);

        double x = 1.5 , y = 2.5 , z = 1.25;

        // Tong AB
        double tongbaso = tonHaiSo(x,y) + z;
        System.out.println("Tổng của 3 số là :" + tongbaso);

        Scanner in = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = in.nextInt();
        System.out.println("Nhập x:");
        int bp = in.nextInt();
        System.out.printf("Tổng giá trị là: %d",tinhTong(n));

        System.out.printf("\nTổng giá trị là: %d",tinhTongBinhPhuong(n,bp));

        System.out.printf("\nTổng giá trị là: %f",luyThua(2,2));

    }
}