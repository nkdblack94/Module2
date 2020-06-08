import java.util.Scanner;

public class TH_TimUocTrung_Max {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = input.nextInt();
        System.out.println("Nhập số b");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("Không có ước chung lớn nhất");
        }

        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
