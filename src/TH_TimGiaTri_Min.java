public class TH_TimGiaTri_Min {
    public static int findMin (int[] arr){
        int min = arr[0];
        for (byte i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int[] array = {1, 5, 7, 0, -21, 9, 14};
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + findMin(array));

    }
}
