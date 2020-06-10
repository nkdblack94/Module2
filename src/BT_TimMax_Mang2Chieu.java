public class BT_TimMax_Mang2Chieu {

    public static void findMax (int[] ...arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Element Max Arr");
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[][] array = {
                {15, 2, 4, 6, 11},
                {5, 21, 3, 1, 82},
                {1, 12, 4, 61, 19},
                {11, 34, 41, 9, 11},
        };

        findMax(array);
    }
}
