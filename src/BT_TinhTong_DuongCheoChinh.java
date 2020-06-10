public class BT_TinhTong_DuongCheoChinh {

    public static void totalDiagonal (int[][] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i == j){
                    total += arr[i][j];
                }
            }
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int[][] array = {
                {15, 2, 4, 6},
                {5, 21, 3, 1},
                {1, 12, 4, 61},
                {11, 34, 41, 9}
        };
        totalDiagonal(array);
    }
}
