package OlderExcercises;//Utwórz macierz typu znakowego – char
// w kolejnych komórkach zapisz litery alfabetu.
// Podaj długość tablicy.

import java.util.Arrays;

public class Zad3_6 {
    public static void main(String[] args) {
        char[] charArr = new char[27];
        // declare ascii as 65 - corresponding to 'A' in ascii code
        int ascii = 65;

        for (int n = 0; n < charArr.length; n++) {
            // assign ascii cast to char to n-th element in charArr
            charArr[n] = (char) ascii;

            // increment the ascii code but reset when it reaches 90 - corresponding to 'Z'
            ascii++;
            if (ascii > 90) ascii = 65;
        }

        System.out.println(Arrays.toString(charArr));
    }
}
