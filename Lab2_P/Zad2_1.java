import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Napisać program, który po wczytaniu wartości liczby całkowitej, oblicza stosunek
//średniej arytmetycznej cyfr nieparzystych do średniej arytmetycznej cyfr parzystych
//oraz sprawdza, czy podana liczba jest liczbą pierwszą.
public class Zad2_1 {

    private static double average(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
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
    private static double findRatio(Integer[] arr) {
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
        return average(odd.stream().mapToInt(Integer::intValue).toArray()) /
                average(even.stream().mapToInt(Integer::intValue).toArray()
                );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // this code splits the input string into an array of integers
        Integer[] scannedArray = Arrays.stream(scanner
                .nextLine()
                .split(""))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        // then it prints out the results
        System.out.println("Ratio: " + findRatio(scannedArray));
        System.out.println("Is prime: " + isPrime(scannedArray.length));
    }
}
