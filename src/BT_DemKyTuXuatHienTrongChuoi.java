import java.util.Scanner;
public class BT_DemKyTuXuatHienTrongChuoi {

    public static void countTotal (String document, char from){
        int index = 0;
        for (int i = 0; i < document.length(); i++){
            if (document.charAt(i) == from){
                index++;
            }
        }
        System.out.println("Số ký tự xuất hiện trong chuỗi là:");
        System.out.println(index);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String document = "Lẽ sống tình đời sống khắp nơi. \n Sống đời có ích tệ sống chơi. \n Ai làm trăm sự cho ta sống. \n Cớ sao tham sống chỉ hại đời.";
        System.out.println(document);
        System.out.println();
        System.out.println("Nhập ký tự cần đếm");
        char enterInput = input.next().charAt(0);
        countTotal(document, enterInput);
    }
}
