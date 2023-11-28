import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

//Napisać program, który po wczytaniu wartości liczby całkowitej, oblicza stosunek
//średniej arytmetycznej cyfr nieparzystych do średniej arytmetycznej cyfr parzystych
//oraz sprawdza, czy podana liczba jest liczbą pierwszą.
public class Zad1 {

    private static String average(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return STR."\{sum} : \{arr.length}";
    }

    // this method is not efficient, but it's the easiest to implement
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    // this method finds the ratio between average of odd and even numbers
    private static double[] findRatio(Integer[] arr) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        // this loop adds odd numbers to odd array and even numbers to even array
        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        // the method then returns the ratio between average of odd and even numbers
        return new double[]{odd.stream().mapToInt(i -> i).average().getAsDouble(), even.stream().mapToInt(i -> i).average().getAsDouble() };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // this code splits the input string into an array of integers
        String scannedString = scanner.nextLine();
        Integer[] scannedArray = Arrays.stream(scannedString
                .split(""))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        double[] ratio = findRatio(scannedArray);
        // then it prints out the results
        System.out.println("Ratio: " + ratio[0] + " / " + ratio[1]);
        System.out.println("Is prime: " + isPrime(Integer.parseInt(scannedString)));
    }
}
