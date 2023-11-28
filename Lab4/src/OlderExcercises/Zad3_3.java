package OlderExcercises;// Napisz program, w którym zostanie utworzona 40 elementowa tablica typu boolean.
//Komórki o indeksie parzystym otrzymają wartość false, a o indeksie nieparzystym
//true.

import java.util.Arrays;

public class Zad3_3 {

    public static void main(String[] args) {
        boolean[] boolArr = new boolean[40];
        for (int i = 0; i < boolArr.length; i++) {
            if (i % 2 == 0) {
                boolArr[i] = false;
            } else {
                boolArr[i] = true;
            }
        }
        System.out.println(Arrays.toString(boolArr));
    }

}
