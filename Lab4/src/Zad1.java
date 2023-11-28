//Napisz program, w którym zostanie utworzona 30-elementowa tablica liczb typu int.
//Za pomocą pętli zapisz w kolejnych komórkach liczby losowo wygenerowane z
//przedziału od 99-150. Wykonać kopię do nowej tablicy.

import java.security.SecureRandom;
import java.util.Arrays;

public class Zad1 {
    //declare a 30 element array of Integers
    Integer[] numArr = new Integer[30];

    Zad1(){
        generateArr();
    }

    // this method generates random numbers from 99 to 150
    private void generateArr() {
        for (int i = 0; i < numArr.length; i++) {
            SecureRandom random = new SecureRandom();
            // generate a random number from 99 to 150
            int randNumber = random.nextInt(
                    99, 149
            );
            numArr[i] = randNumber;
        }
    }

    public static void main(String[] args) {
        // create an instance of Zad4_1
        Zad1 zad1 = new Zad1();
        System.out.println(Arrays.toString(zad1.numArr));

        // clone numArr to numArrCopy using .clone() method
        Integer[] numArrCopy = zad1.numArr.clone();

        System.out.println(Arrays.toString(numArrCopy));
    }
}
