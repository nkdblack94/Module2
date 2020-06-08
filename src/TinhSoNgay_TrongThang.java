import java.util.Scanner;

public class TinhSoNgay_TrongThang {
    public static void main(String[] args) {
        System.out.println("Bạn muốn tính số ngày của tháng mấy");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 2:
                System.out.println("Tháng có 28 hoặc 29 ngày"); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày"); break;
            default:
                System.out.println("Số tháng nhập ko hợp lệ");
        }
    }
}
