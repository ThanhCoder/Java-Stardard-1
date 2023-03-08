package trycatchEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai1
{
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("a,b=");
            a = in.nextInt();
            b = in.nextInt();
            in.close();
            System.out.printf("a/b = %d", a / b);
        }
        catch (InputMismatchException e){
            System.out.println("Nhập sai giá trị");
        }
        catch (ArithmeticException e){
            System.out.println("Lỗi chia cho 0");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
