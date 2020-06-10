import java.util.Scanner;

public class BT_GopMang {

    public static void inArr (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void EnterElementArr (int[] arr){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element " + i);
            arr[i] = input.nextInt();
        }
    }

    public static int[] lumpedArray (int[] ...arr){
        int sumLength = 0;
        for (int i = 0; i < arr.length; i++){
            sumLength += arr[i].length;
        }
        int[] newArray = new int[sumLength];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                newArray[index] = arr[i][j];
                index++;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        System.out.println("Enter element arr1");
        EnterElementArr(arr1);
        inArr(arr1);
        System.out.println("Enter element arr2");
        EnterElementArr(arr2);
        inArr(arr2);
        int[] newArray = lumpedArray(arr1,arr2);
        System.out.println();
        System.out.println("In new array");
        inArr(newArray);
    }
}
