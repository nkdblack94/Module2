import java.util.Scanner;

public class TH_TimGiaTri_TrongMang {
    public static void main(String[] args) {
        String[] arr = {"Hai", "Tung", "Quynh", "Nghia", "Thanh", "Hiep", "Hung", "Long", "Vinh"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sv muốn tìm");
        String name = input.nextLine();

        boolean isExist = false;
        for (byte i = 0; i < arr.length; i++){
            if (arr[i].equals(name)){
                System.out.println(name + " ở vị trí " + i);
                isExist = true;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy");
        }
    }
}
