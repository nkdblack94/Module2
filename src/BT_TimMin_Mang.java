import java.util.Scanner;
public class BT_TimMin_Mang {
    public static void findMin (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Element array min");
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter element " + i);
            arr[i] = input.nextInt();
        }

        findMin(arr);
    }
}
