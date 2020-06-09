import java.util.Scanner;

public class BT_XoaPhanTu_KhoiMang {
    public static void inArr (int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static void deleteElement (int[] arr, int number){
        int index_del = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){
                index_del = i;
            }
        }
        for (int j = index_del; j < arr.length - 1; j++){
            arr[j] = arr[j + 1];
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa");
        int number = input.nextInt();
        deleteElement(array, number);
        inArr(array);
    }
}
