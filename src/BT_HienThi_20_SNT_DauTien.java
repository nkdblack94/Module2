import java.util.Scanner;

public class BT_HienThi_20_SNT_DauTien {
    public static void main(String[] args) {
        byte number, count = 0, n = 2;
        boolean snt = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Bạn muốn in ra bao nhiêu SNT");
        number = input.nextByte();

        while (count < number){
            snt = true;
            for (byte i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    snt = false;
                    break;
                }
            }
            if (snt){
                System.out.println(n);
                count++;
            }
            n++;
        }

    }
}
