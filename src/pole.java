import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class pole {
    public static void main(String[] args) {
        int[] arr = {456, 321, -85, 16, 684, 221, -6};
        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min: " + min);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] EmptyArr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < EmptyArr.length; i++) {
            System.out.println("zadej číslo");
            EmptyArr[1] = sc.nextInt();
        }
        System.out.println(Arrays.toString(EmptyArr));


        Scanner scanner = new Scanner(System.in);



        }
    }

