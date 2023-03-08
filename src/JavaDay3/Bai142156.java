package JavaDay3;

public class Bai142156 {
    public static double minArr(double[] arr){
        double min = arr[0];
        for(int i=0;i < arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findPositiveFirstNumber(int[] arr)
    {
        int soChan = 0;
        int viTri = 0;
        for (int i = 0;i <= arr.length;i++)
        {
            if(arr[i]%2 == 0)
            {
                soChan = arr[i];
                break;
            }
            else{
                soChan = -1;
            }
        }
        return soChan;
    }

    public static int findNegativeFirstNumber(int[] arr)
    {
        int soChan = 0;
        for (int i = 0;i <= arr.length;i++)
        {
            if(arr[i]%2 < 0)
            {
                soChan = arr[i];
                break;
            }
        }
        return -1;
    }

    public static boolean ktSoNguyenTo(int n){
        boolean dem = true;

        if(n <0){
            return false;
        }
        for (int i = 2;i<= Math.sqrt(n);i++){
            if(i%n != 0){
                return false;
            }
        }
        return true;
    }

    public static int soNguyenToDauTien(int[] arr){
        for(int i=0 ; i< arr.length;i++){
            if(ktSoNguyenTo(arr[i]) == true){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] arr1 = {20.0,5.5,7.4,6.2,9.1};
        double[] arr2 = {20.0,5.5,7.4,6.2,9.1};
        int[] arr3 = {21,11,29,8,9};
        int[] arr4 = {21,15,29,-8,9};
        System.out.println("Số nhỏ nhất trong array là :" +minArr(arr1));
        System.out.println("Số chan đầu tiên là :" +findPositiveFirstNumber(arr3));
        System.out.println("Số ng tố đầu tiên là :" +soNguyenToDauTien(arr3));
//        findNegativeFirstNumber(arr4);
        int soNgTo = 20;
    }
}
