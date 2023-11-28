package OlderExcercises;//W zadeklarowanej macierzy dwuwymiarowej 12x12 umieść na przekątnej liczby od 0
//do 11, natomiast poza przekątną w pozostałych elementach macierzy wartości liczb
//losowych (r).

import java.security.SecureRandom;

public class Zad3_7 {

    int[][] intMatrix = new int[12][12];

    Zad3_7() {
        generateMatrix();
    }

    public int[][] generateMatrix() {
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[0].length; j++) {
                if (i == j) {
                    intMatrix[i][j] = i;
                } else if (j == 0) {
                    intMatrix[i][j] = i;
                } else if (i == 0) {
                    intMatrix[i][j] = j;
                } else {
                    intMatrix[i][j] = random.nextInt(0, 100);
                }
            }
        }
        return intMatrix;
    }

    public void printTable() {
        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                System.out.print(intMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Zad3_7 obj = new Zad3_7();
        obj.generateMatrix();
        obj.printTable();
    }
}
