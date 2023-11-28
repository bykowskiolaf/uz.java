//Napisz program realizujący funkcje kalkulatora, z uwzględnieniem, ograniczenia
//dzielenia przez 0.

import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dzialanie matematyczne bez nawiasow: ");
        String scannedString = scanner.nextLine().replaceAll("\\s+", " ");

        String[] scannedArray = scannedString.toLowerCase().split(" ");
        System.out.println(Arrays.toString(scannedArray));

        //this loop will go through the array and calculate the result
        for (int i = 0; i < scannedArray.length - 1; i++) {
            String s = scannedArray[i];
            try {
                // if the string is a number, it will be parsed and the loop will continue
                Integer.parseInt(s);
            } catch (Exception e) {
                if (i == 0) throw new IllegalArgumentException("First argument must be a number");
                // if the string is not a number, it will be checked if it's a valid operation
                switch (s) {
                    case "+" -> {
                        // if it is, the operation will be performed and the result will be saved in the next index
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
                            // if the operation is division, it will be checked if the divisor is 0
                            // if it is, an exception will be thrown
                            throw new IllegalArgumentException("Cannot divide by 0");
                        }
                    }
                    // if the operation is not valid, an exception will be thrown
                    default -> throw new IllegalArgumentException("Unknown operation");
                }
            }
        }
        // the result will be printed out
        System.out.println(scannedArray[scannedArray.length - 1]);
    }
}