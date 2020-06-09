import java.util.Scanner;

public class TH_DaoNguoc_PT_Mang {

    public static void inArr (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter size");
            size = input.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.println("Enter element " + (i + 1));
            arr[i] = input.nextByte();
            i++;
        }

        System.out.println("Element in arr");
        inArr(arr);

        for (int j = 0; j < arr.length / 2; j++){
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }

        System.out.println();
        System.out.println("Reverse arr");
        inArr(arr);
    }
}
