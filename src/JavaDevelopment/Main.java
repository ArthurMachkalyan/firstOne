package JavaDevelopment;

import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random(0);
        int[] arr = new int[10];
        randArray(arr, 20,30);
        printArray(arr);
        System.out.println();
        double[] drr = new double[10];
        randArray(drr, 10, 20);
        printArray(drr);
    }

    public static void randArray(int[] arr, int minRand, int maxRand) {
        Random rand = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(minRand,maxRand);
        }
    }

    public static void randArray(double[] arr, int minRand, int maxRand) {
        Random rand = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(minRand,maxRand);
        }
    }

    public static void  printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void  printArray(double[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

