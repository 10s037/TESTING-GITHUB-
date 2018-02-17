import java.util.*;

public class lab2_a {
    public static void main(String[] args) {
        int[] arr= {51,7,33,67,33,61,4,100,27,80,1,91,10,94,62,95};

        int max = 100;
        int min = 1;
        //initRand(arr, max, min);
        System.out.println();
        //print(arr);
       int[]temp = copy(arr);
       double [] var = getVariance(temp);
      print(arr);
        System.out.println();
      top_20(temp);
        System.out.println();
      print(var);
        System.out.println();
        System.out.println(Math.pow(getMean(var),2));


    }

    public static void print(int[] arr) {
        for(int x =0; x <arr.length; x++)
            System.out.printf("%5d",arr[x]);
    }
    public static void print(double[] arr) {
        for(int x =0; x <arr.length; x++)
            System.out.printf("%20f",arr[x]);
    }
    public static void initRand(int[] arr, int max, int min) {
        Random rnd = new Random();
        for(int x = 0; x< arr.length;x++)
            arr[x] = rnd.nextInt(max-min+1)+min;
    }
    public static boolean isAllEven(int[] arr){
        for(int x = 0; x< arr.length; x++)
            if(!(arr[x]%2==0))
                return false;
        return true;
    }
    public static boolean isUnique(int[]arr){
        for(int x = 0; x<arr.length;x++)
            for(int y = 1; y<arr.length; y++)
                if(arr[x]==arr[y])
                    return false;
        return true;
    }//Work on this method
    public static int minGap(int[]arr){
        int min = 0;
        for(int x = 1; x<arr.length;x++)
            if(min>(arr[x]-arr[x-1]))
                min =(arr[x]-arr[x-1]);
        return min;
    }
    public static int menu(){int option;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Your options are:");
            System.out.println("-----------------");
            System.out.println("\t1)All even values?");
            System.out.println("\t2)All unique values?");
            System.out.println("\t3)Print min gap between values");
            System.out.println("\t4)Statistics");
            System.out.println("\t5)Print 80% percentile");
            System.out.println("\t0)EXIT");
            System.out.print("\nPlease enter your option: ");
            option = input.nextInt();
            System.out.println();
        } while(option < 0 || option > 5);
        return option;
    }
    public static void bubbleSort(int[]arr) {
        int length = arr.length;
        int temp;
        for (int x = 0; x < arr.length; x++)
            for (int y = 1; y < (arr.length- x); y++)
                if (arr[y - 1] > arr[y]) {
                    temp = arr[y - 1];
                    arr[y - 1] = arr[y];
                    arr[y] = temp;

                }
    }
    public static int[] copy(int[]arr){
       int [] temp = new int[arr.length];
            for(int x = 0; x<arr.length; x++)
                temp[x] = arr[x];
        return temp;
    }
    public static void top_20(int[]arr){
        bubbleSort(arr);
        int x = arr.length/5;
        //int y = x*(x-1);
        for(int y = arr.length - x; y < arr.length; y++ )
            System.out.printf("%5d",arr[y]);
    }
    public static int getMean(int[]arr){
        int sum = 0;
        for( int x = 0; x < arr.length; x++)
            sum += arr[x];
        return sum/arr.length;
    }
    public static double getMean(double[]arr){
        int sum = 0;
        for( int x = 0; x < arr.length; x++)
            sum += arr[x];
        return (double)sum/arr.length;
    }
    public  static double[] getVariance(int[]arr){
        int mean = getMean(arr);
        int size = arr.length;
        double []var = new double[arr.length];
        for(int x = 0; x < arr.length; x++)
            var[x] = ((arr[x]-mean)*(arr[x]-mean))/(size-1);
        return var ;
    }
}