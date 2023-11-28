package OlderExcercises;//Stworzyć tablicę 7 x 7 liczb całkowitych, wypełnić ją losowymi wartościami, następnie
//wyznaczyć dla każdej kolumny minimum i maksimum, najmniejszy oraz największy
//element w tablicy, średnią arytmetyczną elementów tablicy, ilość elementów
//mniejszych oraz większych od średniej. Do nowej tablicy skopiować w odwrotnej
//kolejności zawartość tablicy tj. od ostatniego do pierwszego.

import java.security.SecureRandom;
import java.util.Arrays;

public class Zad3_2 {

    private static Integer[][] invertMatrix(Integer[][] matrix) {
        Integer[][] invertedMatrix = new Integer[matrix.length][matrix[0].length];
        for (int i = 0; i < invertedMatrix.length; i++) {
            for (int j = 0; j < invertedMatrix[i].length; j++) {
                invertedMatrix[i][j] = matrix[matrix.length - 1 - i][matrix[i].length - 1 - j];
            }
        }
        return invertedMatrix;
    }

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        Integer[][] numArr = new Integer[7][7];
        int maxArrElem = 0;
        int minArrElem = 0;
        Integer[] maxes = new Integer[7];
        Integer[] mins = new Integer[7];
        int sumOfAllElems = 0;
        int smallerThanAvg = 0;
        int biggerThanAvg = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                int randNumber = random.nextInt(0, 100);
                numArr[i][j] = randNumber;
                sumOfAllElems += randNumber;
                if (randNumber > maxArrElem) {
                    maxArrElem = randNumber;
                }
                if (randNumber < minArrElem) {
                    minArrElem = randNumber;
                }

                maxes[i] = (int) Double.NEGATIVE_INFINITY;
                mins[i] = (int) Double.POSITIVE_INFINITY;
            }
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i][j] > sumOfAllElems / 49) {
                    biggerThanAvg++;
                }
                if (numArr[i][j] < sumOfAllElems / 49) {
                    smallerThanAvg++;
                }
                if (numArr[i][j] > maxes[i]) {
                    maxes[i] = numArr[i][j];
                }
                if (numArr[i][j] < mins[i]) {
                    mins[i] = numArr[i][j];
                }
            }
        }

        System.out.println("Tablica: " + Arrays.deepToString(numArr));
        System.out.println("Wartosc najwieksza: " + maxArrElem);
        System.out.println("Srednia arytmetyczna: " + sumOfAllElems / 49);
        System.out.println("Wartosci najwieksze w wierszach 1-7: " + Arrays.toString(maxes));
        System.out.println("Wartosci najmniejsze w wierszach 1-7: " + Arrays.toString(mins));
        System.out.println("Liczba elem wiekszych niz srednia: " + biggerThanAvg);
        System.out.println("Liczba elem mniejszych niz srednia: " + smallerThanAvg);
        System.out.println("Tablica odwrocona: " + Arrays.deepToString(invertMatrix(numArr)));
    }
}
