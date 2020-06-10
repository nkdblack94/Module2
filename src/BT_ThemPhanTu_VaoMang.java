import java.util.Scanner;

public class BT_ThemPhanTu_VaoMang {
    public static void inArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void insert(int[] arr, int element, int location) {
        int length = arr.length - 1;
        if (location < 1 || location >= length) {
            System.out.println("Không chèn được vào mảng");
        } else {
            for (int i = location; i < arr.length - 1; i++) {
                arr[i] = element;
                arr[i + 1] = arr[i + 1];
            }
        }
        inArr(arr);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 10;
        array[2] = 5;
        array[3] = 4;
        array[4] = 21;
//        array[5] = 11;
//        array[6] = 6;
//        array[7] = 4;
//        array[8] = 23;
//        array[9] = 21;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử cần chèn vào mảng");
        int x = input.nextInt();
        System.out.println("nhập vị trí càn chèn vào mảng");
        int location = input.nextInt();
        insert(array, x, location);

    }
}
