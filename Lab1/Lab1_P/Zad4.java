import java.util.Arrays;
import java.util.Scanner;


public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby oddzielone spacja: ");
        String scannedString = scanner.nextLine().replaceAll("\\s+", " ");

//        List<String> scannedList = new ArrayList<>();

        Integer[] scannedArray = Arrays.stream(
                        scannedString
                            .trim()
                            .split(" "))
                            .map(Integer::parseInt)
                            .toArray(Integer[]::new);

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
