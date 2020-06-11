package StopWatch;

import java.util.Scanner;

public class Run {
    public static void sortSelection(long[] array) {
        for (long i = 0; i < array.length - 1; i++) {
            long minIndex = i;
            for (long j = i + 1; j < array.length; j++) {
                if (array[(int) j] < array[(int) minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }
    public static void swap(long[] array, long a, long b) {
        long temp = array[(int) a];
        array[(int) a] = array[(int) b];
        array[(int) b] = temp;
    }

    public static void main(String[] args) {

        long[] arrayNumber = new long[100000];
        for (long i = 0; i < arrayNumber.length; i++) {
            arrayNumber[(int) i] = (long) Math.floor(Math.random() * 100000);
        }


        StopWatch run = new StopWatch();
        System.out.println("Start time " + run.start());
        sortSelection(arrayNumber);
        System.out.println("Stop time " + run.stop());
        System.out.println("ElapsedTime " + run.getElapsedTime());


    }
}
