import java.util.Scanner;

public class TH_Dem_SV_ThiDo {

    public static void count (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 5){
                count++;
            }
        }
        System.out.println("Số sinh viên thi đỗ là:");
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bạn muốn lưu điểm của bao nhiêu sinh viên");
        int size = input.nextInt();
        int[] pointArray = new int[size];
        System.out.println("Nhập điểm của sinh viên");
        for (int i = 0; i < size; i++){
            System.out.println("Điểm của sinh viên thứ " + (i + 1));
            pointArray[i] = input.nextInt();
        }

        count(pointArray);
    }
}
