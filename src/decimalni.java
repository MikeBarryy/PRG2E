import java.util.Scanner;

public class decimalni {
    public static void main(String[] args) {


        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        Scanner scanner = new Scanner(System.in);
        int[] pole =new int[4];

        for (int i = 0; i < pole.length; i++) {
            System.out.println("zadej 1 nebo 0");
            pole[i] = scanner.nextInt();



            if (pole[0] == 1) {
                a = pole[0] + 7;
            }else {
                a=0;
            }
                if (pole[1] == 1) {
                    b = pole[1] + 3;
                }else {
                    b=0;
                }
            if (pole[2] == 1) {
                        c = pole[2] + 1;
                    }else {
                c=0;
            }
            if (pole[3] == 1) {
                            d = pole[3];
                        }  else {
                d=0;
            }


        }
        System.out.println("tohle je dísítková " + (a+b+c+d));
    }
}