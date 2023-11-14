package arrays;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        double real = 12.48;
        double[] doubles = {15.2, 123.5, 32.9, 5.5, 15.8, -12.4};;
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);

        }
        System.out.println("_______");
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] < 0){
                System.out.println(doubles[i]);
            }
        }

        //suma pole
        double arraySum = 0;
        for (int i = 0; i <doubles.length; i++) {
            arraySum += doubles[i];
        }
        System.out.println("_______");
        System.out.println("sum of array: " + arraySum);
        System.out.println("average value: " + (arraySum / doubles.length));
        System.out.println("_______");

        System.out.println(Arrays.toString(doubles));

        double[] points = {-1, 0, 1, 2 };
        for (int i = 0; i < points.length; i++) {
            System.out.println("body:");
            System.out.println("x = " + points[i]);
            double y = 2*points[i] + 5;
            System.out.println("y = " + y);
        }
        System.out.println("_______");



    }
}
