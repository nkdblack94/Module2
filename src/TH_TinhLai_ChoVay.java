import java.util.Scanner;

public class TH_TinhLai_ChoVay {
    public static void main(String[] args) {
        double money;
        int month;
        double interest_rate;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter money");
        money = input.nextDouble();

        System.out.println("Enter month");
        month = input.nextInt();

        System.out.println("Enter interest rate");
        interest_rate = input.nextDouble();

        double total_interest = 0;

        for(int i = 0; i < month; i++){
            total_interest = money * (interest_rate/100)/12 * month;
        }

        System.out.println("Số tiền lãi là: " + total_interest);
    }
}
