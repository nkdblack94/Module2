import java.util.Scanner;

public class Tinh_ChiSo_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cân nặng của bạn");
        float weight = scanner.nextFloat();
        System.out.println("Nhập chiều cao của bạn");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);

        if (bmi < 18.5){
            System.out.println("Thiếu kg");
        } else if (bmi < 25){
            System.out.println("Bình thường");
        } else if (bmi < 30){
            System.out.println("Thừa kg");
        } else {
            System.out.println("Béo phì");
        }
    }
}
