package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class doblePole {
    public static void main(String[] args) {

        ArrayList<Integer> bigArray = new ArrayList<>();

        bigArray.add(10);
        bigArray.add(1, 20);

        for (int i = 0; i < 20; i++) {
            bigArray.add(i + 1);
        }
        System.out.println(bigArray);

        bigArray.get(5);
        for (int i = 0; i < bigArray.size(); i++) {
            System.out.println(bigArray.get(i));
        }
    }
}