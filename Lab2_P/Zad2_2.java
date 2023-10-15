
//Zrealizuj kod, który dla zadanej liczby całkowitej wyświetla jej wszystkie dzielniki.

import java.util.Scanner;

public class Zad2_2 {

    private static void printDividers(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printDividers(scanner.nextInt());
    }

}
