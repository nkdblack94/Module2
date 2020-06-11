package StopWatch;

public class Run {
    public static void Sort (long[] arr){
        long tempSort;
        for (long i = 0; i < arr.length - 1; i++){
            for (long j = i + 1; j < arr.length; j++){
                if (arr[(int) j] < arr[(int) (i)]){
                    tempSort = arr[(int) j];
                    arr[(int) i] = arr[(int) j];
                    arr[(int)j] = tempSort;
                }
            }
        }
    }

    public static void main(String[] args) {

        long[] arrayNumber = new long[100000];
        for (long i = 0; i < arrayNumber.length; i++) {
            arrayNumber[(int) i] = (long) Math.floor(Math.random() * 1000);
        }

        StopWatch run = new StopWatch();
        System.out.println("Start time " + run.start());
        Sort(arrayNumber);
        System.out.println("Stop time " + run.stop());
        System.out.println("ElapsedTime " + run.getElapsedTime());
    }
}
