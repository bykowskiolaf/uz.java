//Wczytaj kilka (x) liczb i wyznacz wartości min, max, średnią, oraz ilość podanych
//liczb.

import java.util.Arrays;
import java.util.Scanner;

public class Zad1_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby oddzielone spacja: ");
        String scannedString = scanner.nextLine().replaceAll("\\s+", " ");

        // this code is a bit more complicated than it should be, but it's a good exercise
        // it takes the input string, trims it, splits it by spaces, maps it to Integer, and then converts it to an array
        Integer[] scannedArray = Arrays.stream(
                        scannedString
                            .trim()
                            .split(" "))
                            .map(Integer::parseInt)
                            .toArray(Integer[]::new);

        // then we print out all the values as requested in the task
        System.out.print("Minimum: ");
        System.out.println(Arrays.stream(scannedArray).min(Integer::compare).get());
        System.out.print("Maksimum: ");
        System.out.println(Arrays.stream(scannedArray).max(Integer::compare).get());
        System.out.print("Srednia: ");
        System.out.println(Arrays.stream(scannedArray).mapToInt(Integer::intValue).average().getAsDouble());
        System.out.print("Suma: ");
        System.out.println(Arrays.stream(scannedArray).mapToInt(Integer::intValue).sum());
        System.out.print("Dlugosc: ");
        System.out.println(scannedArray.length);
    }

}
