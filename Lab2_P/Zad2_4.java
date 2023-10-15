//Opracuj kod realizujący wczytywanie kolejnych liczb do momentu gdy podana
//zostanie wartość 5. Wyświetlić iloczyn podanych liczb.

import java.util.Scanner;

public class Zad2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 1;
        int scannedNumber = 0;

        // this loop will run until user inputs 5, then it will break
        while (scannedNumber != 5) {
            System.out.println("Podaj liczbe: ");
            scannedNumber = scanner.nextInt();
            // the product is multiplied by the scanned number
            product *= scannedNumber;
        }

        // prints out the product
        System.out.println("Iloczyn: " + product);
    }
}
