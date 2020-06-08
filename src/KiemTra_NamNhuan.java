import java.util.Scanner;

public class KiemTra_NamNhuan {
    public static void main(String[] args) {
        System.out.println("nhập năm bạn muốn kiểm tra");
        Scanner scanner = new Scanner(System.in);

        short year = scanner.nextShort();
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Năm " + year + " là năm nhuận");
                } else {
                    System.out.println("Năm " + year + " Không phải là năm nhuận");
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuận");
            }
        } else {
            System.out.println("Năm " + year + " Không phải là năm nhuận");
        }
    }
}
