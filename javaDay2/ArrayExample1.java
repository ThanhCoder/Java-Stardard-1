package javaDay2;

public class ArrayExample1 {
    public static void main(String[] args) {
        //Tạo 1 mảng số nguyên
        // In ra phần tử đầu và cuối của mảng

        int [] arr = {100,200,300,400};
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        int avg = 0;
        int sum = 0;
        for(int i = 0;i < arr.length;i ++){
            sum = (sum + arr[i]);
            avg = sum/arr.length;
        }
        System.out.printf("Tổng array là : %d", avg);
//        System.out.println("Tổng array là"+avg);
    }
}
