import java.util.Scanner;

public class BT_TinhTong_MotCot_Mang2Chieu {

    public static void countSum (int[][] arr, int column){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][column];
        }
        System.out.println("Tổng của cột " + column + "trong mảng là:");
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] array = {
                {15, 2, 4, 6, 11},
                {5, 21, 3, 1, 82},
                {1, 12, 4, 61, 19},
                {11, 34, 41, 9, 11},
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cột muốn tính");
        int column = input.nextInt();

        countSum(array, column);
    }
}
