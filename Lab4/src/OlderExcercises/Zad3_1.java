package OlderExcercises;//Napisz program, w którym zostanie utworzona 30-elementowa tablica liczb typu int.
//Za pomocą pętli zapisz w kolejnych komórkach liczby losowo wygenerowane z
//przedziału od 99-150. Wykonać kopię do nowej tablicy.

import java.security.SecureRandom;
import java.util.Arrays;

public class Zad3_1 {

    public static void main(String[] args) {
        Integer[] numArr = new Integer[30];

        for (int i = 0; i < numArr.length; i++) {
            SecureRandom random = new SecureRandom();
            int randNumber = random.nextInt(
                    99, 149
            );
            numArr[i] = randNumber;
        }
        System.out.println(Arrays.toString(numArr));

        Integer[] numArrCopy = numArr.clone();

        System.out.println(Arrays.toString(numArrCopy));
    }
}
