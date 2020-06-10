import java.util.Scanner;

public class BT_ThemPhanTu_VaoMang {
    public static void inArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void insert(int[] arr, int element, int location) {
        int length = arr.length - 1;
        if (location < 0 || location >= length) {
            System.out.println("Không chèn được vào mảng");
        } else {
            for (int i = length; i > location; i--) {
                arr[i] = arr[i - 1];
            }
            arr[location] = element;
        }
        inArr(arr);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử cần chèn vào mảng");
        int x = input.nextInt();
        System.out.println("nhập vị trí càn chèn vào mảng");
        int location = input.nextInt();
        insert(array, x, location);
    }
}
