package arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int[] pole = {45, 123 ,456, 12, 22, 52};
        System.out.println(pole[4]);

        int[] dalsipole = new int[100];
        //dalsipole[2] = 9;

        for (int i = 0; i < dalsipole.length; i++) {
            dalsipole[i] = (int)(Math.random()*1000+1);
            System.out.print(dalsipole[i] + ", ");
        }

        System.out.println("výpis pole");
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + ", ");
        }

        int[] switches = {5, 6, 9};
        int tamp = switches[0];
        switches[0] = switches[2];
        switches[2] = tamp;
        System.out.println(Arrays.toString(switches));

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > pole[i+1]){
                System.out.println("není seřazeno");
                break;
            }
        }
    }
}
