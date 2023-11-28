package OlderExcercises;//Stwórz macierz 15x15 pełniącą funkcję tabliczki mnożenia. Następnie macierz 1x15
//która będzie zawierała wartość średnią z poszczególnych kolumn

public class Zad3_4 {

    public static void main(String[] args) {
        int[][] multiplicationTable = new int[15][15];
        int[] avgArr = new int[15];
        int sumOfAllElemsInCol = 0;
        int avgOfAllElemsInCol;

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                // iterate through rows and columns of multiplicationTable
                // and fill it with multiplication results
                multiplicationTable[i][j] = (i + 1) * (j + 1);
                sumOfAllElemsInCol += multiplicationTable[i][j];
            }
            avgOfAllElemsInCol = sumOfAllElemsInCol / 15;
            avgArr[i] = avgOfAllElemsInCol;
            sumOfAllElemsInCol = 0;
        }

        System.out.println("Tablica mnożenia:");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Średnia każdej kolumny:");
        for (int i = 0; i < avgArr.length; i++) {
            System.out.print(avgArr[i] + "\t");
        }

    }
}
