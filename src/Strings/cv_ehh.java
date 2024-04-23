package Strings;

public class cv_ehh {
    public static void main(String[] args) {

        String num = "5a";

        String regx = "[0-9]{2,}[[0-1][5-6]][0-3][0-9]/[0-9]{4,}";
        if (num.matches("[0-9]")){
            System.out.println("jsou stejné");
        }

    }
}
