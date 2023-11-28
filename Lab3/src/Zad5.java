//Po wczytaniu nieujemnej liczby całkowitej wyświetlone zostaną wszystkie wartości
//potęgi liczby 3 mniejsze niż wartość wczytana.

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scannedNumber = scanner.nextInt();
        int power = 0;

        // this loop will run until 3^power is greater than scannedNumber
        while (Math.pow(3, power) < scannedNumber) {
            System.out.println(Math.pow(3, power));
            power++;
        }
    }
}
