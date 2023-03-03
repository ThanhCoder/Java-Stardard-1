package javaDay2;

import java.util.Random;
import java.util.Scanner;

public class ArratExample2 {
    /*
    * Tạo 1 ,mảng gồm n phần tử. Nhập giá trị cho mảng và in ra ngẫu nhiên giá trị mảng
    * */
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("n =");
        n = in.nextInt();
        in.close();
        if(n < 1){
            System.out.println("Mảng không hợp lệ!");
            System.exit(0);
        }
        //Lặp n lần
        // Mỗi lần lặp gán ngẫy nhiên cho mảng vừa nhập
        //Tạo mảng
        Random ramdom = new Random();
        int [] arr = new int[n];
            for(int i = 0;i<n;i++){
            arr[i] = ramdom.nextInt(1000);
        }
            for(int i= 0;i < n; i++){
                System.out.printf("array[%d] = %d \n", i,arr[i]);
            }

            // Tính trung bình các giá trị trong mảng
            int avg = 0;
            int sum = 0;
            for(int i = 0;i < arr.length;i ++){
            sum = (sum + arr[i]);
            avg = sum/arr.length;
        }
        System.out.printf("Tổng array là : %d", avg);

            // In ra số lớn nhất trong mảng
            int maxValue = arr[0];
            for(int i = 0;i < arr.length;i ++){
                {
                    if(arr[i] > maxValue){
                        maxValue = arr[i];
                    }
                }
            }
        System.out.printf("\n Số lớn nhất trong mảng %d",maxValue);

            // Tìm số nhỏ nhất trong mảng
        int minValue = arr[0];
        for(int i = 0;i < arr.length;i ++){
            {
                if(arr[i] < minValue){
                    maxValue = arr[i];
                }
            }
        }
        System.out.printf("\n Số nhỏ nhất trong mảng %d",minValue);
    }
}
