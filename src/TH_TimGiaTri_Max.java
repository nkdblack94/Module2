import java.util.Scanner;

public class TH_TimGiaTri_Max {

    public static void findMax(int[] arr) {
        int max = arr[0];
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                t = i;
            }
        }
        System.out.println(max + " ở vị trí " + (t + 1));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter size");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        arr = new int[size];
        for (byte i = 0; i < arr.length; i++){
            System.out.println("Enter element " + (i + 1));
            arr[i] = input.nextInt();
        }

        System.out.println("Tìm Max");
        findMax(arr);
    }
}
