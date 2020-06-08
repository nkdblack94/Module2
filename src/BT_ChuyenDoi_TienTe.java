import java.util.Scanner;

public class BT_ChuyenDoi_TienTe {
    public static void main(String[] args) {
        int rate;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn đổi bao nhiêu USD");
        int usd = scanner.nextInt();

        int vnd = usd * 23000;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}
