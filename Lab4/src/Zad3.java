// Dla tablicy 40 elementowej komórkom o indeksach:
//
// 0-10 przypisz wartość od 1-5 losowo,
// 11-20 przypisz wartość od 6-10 losowo,
// 21-30 przypisz wartość od 11-55 losowo,
// 31-39 przypisz wartość od 60-75 losowo,

import java.security.SecureRandom;
import java.util.Arrays;

public class Zad3 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] numArr = new int[40];

        for(int i = 0; i < numArr.length; i++){
            if (i <= 10) {
                numArr[i] = random.nextInt(1,6);
            } else if (i <= 20) {
                numArr[i] = random.nextInt(6, 11);
            } else if (i <= 30) {
                numArr[i] = random.nextInt(11,56);
            } else {
                numArr[i] = random.nextInt(60,76);
            }
        }

        System.out.print(Arrays.toString(numArr));
    }
}
