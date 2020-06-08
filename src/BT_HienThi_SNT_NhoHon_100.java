public class BT_HienThi_SNT_NhoHon_100 {
    public static void main(String[] args) {
        System.out.println("Những SNT nhỏ hơn 100");

        int n = 2;
        boolean snt = true;

        while (n < 100){
            snt = true;
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    snt = false;
                    break;
                }
            }
            if (snt){
                System.out.println(n);
            }
            n++;
        }
    }
}
