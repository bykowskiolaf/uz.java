import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dzialanie matematyczne bez nawiasow: ");
        String scannedString = scanner.nextLine().replaceAll("\\s+", " ");

        String[] scannedArray = scannedString.toLowerCase().split(" ");
        System.out.println(Arrays.toString(scannedArray));

        for (int i = 0; i < scannedArray.length - 1; i++) {
            String s = scannedArray[i];
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                if (i == 0) throw new IllegalArgumentException("First argument must be a number");
                switch (s) {
                    case "+" -> {
                        scannedArray[i + 1] = String.valueOf(Integer.parseInt(scannedArray[i - 1]) + Integer.parseInt(scannedArray[i + 1]));
                    }
                    case "-" -> {
                        scannedArray[i + 1] = String.valueOf(Integer.parseInt(scannedArray[i - 1]) - Integer.parseInt(scannedArray[i + 1]));
                    }
                    case "*" -> {
                        scannedArray[i + 1] = String.valueOf(Integer.parseInt(scannedArray[i - 1]) * Integer.parseInt(scannedArray[i + 1]));
                    }
                    case "/" -> {
                        try {
                            scannedArray[i + 1] = String.valueOf(Integer.parseInt(scannedArray[i - 1]) / Integer.parseInt(scannedArray[i + 1]));
                        } catch (Exception exception) {
                            throw new IllegalArgumentException("Cannot divide by 0");
                        }
                    }
                    default -> throw new IllegalArgumentException("Unknown operation");
                }
            }
        }
        System.out.println(scannedArray[scannedArray.length - 1]);
    }
}