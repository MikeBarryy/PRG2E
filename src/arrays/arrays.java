package arrays;

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
    }
}
