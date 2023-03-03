package javaDay2;

public class Bai122 {
       public static void main(String[] args) {
        //Tạo 1 mảng số nguyên
        // In ra phần tử đầu và cuối của mảng

        double [] arr = {100.3,200.4,300.2,400.5};
        double maxValue = arr[0];
            for(int i = 0;i < arr.length;i ++){
                {
                    if(arr[i] > maxValue){
                        maxValue = arr[i];
                    }
                }
            }
        System.out.printf("\n Số lớn nhất trong mảng %f",maxValue);
    }
}


 
