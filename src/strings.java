import java.util.Scanner;

public class strings {
    public static void main(String[] args) {

        char input = 'A';
        input = '\n'; //odradkovani
        System.out.println("Hello" + input + "world");
        input = '\t';//tabulator
        System.out.println("Hello" + input + "world");

        //porovnávání
        char a = 'a';
        char b = 'b';
        if (a == b){
            System.out.println("they're same");
        }
        Scanner sc = new Scanner(System.in);
        String helo = "Hello!";
       String ehlo = sc.next();

       if (helo.equals(ehlo)){
           System.out.println("They're same");
       }

       String showcase = "Obsah \t stringu";
        System.out.println(showcase);

        String more = showcase + "hello";
        System.out.println(more);

        //case sensitive

        boolean isSame = "hello" .equals("hellO");


    }
}
