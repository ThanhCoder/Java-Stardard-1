package javaDay2;

public class Bai123 {
       public static void main(String[] args) {
        //Tạo 1 mảng số nguyên
        // In ra phần tử đầu và cuối của mảng

        double [] arr = {100.3,200.4,300.2,400.5,98.5};
        double minValue = arr[0];
           System.out.print("Vi tri cua phan tu nhỏ nhat: ");
           for(int i = 0;i < arr.length;i ++){
                {
                    if(arr[i] < minValue){
                        System.out.print(i);
                    }
                }
            }
       }
}
