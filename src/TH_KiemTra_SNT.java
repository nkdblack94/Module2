import java.util.Scanner;

public class TH_KiemTra_SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        double number = scanner.nextDouble();

        if (number < 2) {
            System.out.println(number + " không phải SNT");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " là SNT");
            } else {
                System.out.println(number + " không phải SNT");
            }
        }
    }
}
