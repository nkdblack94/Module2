import java.util.Scanner;

public class GiaiPhuongTrinh_BacNhat {
    public static void main(String[] args) {
        System.out.println("Bộ giải phương trình bậc nhất");
        System.out.println("Cho một phương trình là: 'a * x + b = 0', vui lòng nhập các hằng số");

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số a");
        double a = scanner.nextDouble();

        System.out.println("nhập số b");
        double b = scanner.nextDouble();

        if (a != 0){
            double answer = -b / a;
            System.out.println("phương trình có một nghiệm duy nhất là: " + answer);
        } else if (b == 0){
            System.out.println("phương trình vô số nghiệm");
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
