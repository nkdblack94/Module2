public class BT_InCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("In hình chữ nhật");
        for (byte i = 0; i < 3; i++) {
            System.out.println("* * * * * *");
        }

        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");

        for (byte i = 1; i <= 5; i++) {
            for (byte j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");

        for (byte i = 5; i >= 1; i--){
            for (byte j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("In hình tam giác cân.");

        for (byte i = 0; i <= 5; i++){
            for (byte j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
