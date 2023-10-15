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

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    private static double findRatio(Integer[] arr) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        return average(odd.stream().mapToInt(Integer::intValue).toArray()) /
                average(even.stream().mapToInt(Integer::intValue).toArray()
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] scannedArray = Arrays.stream(scanner
                        .nextLine()
                        .split(""))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        System.out.println("Ratio: " + findRatio(scannedArray));
        System.out.println("Is prime: " + isPrime(scannedArray.length));
    }
}
