//Napisz program, który narysuje choinkę o wysokości podanej przez użytkownika

import java.util.Scanner;

public class Zad1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SIZE = scanner.nextInt();

        for (int i = 0; i < SIZE; i++) {

            //prints out spaced before stars
            for (int j = SIZE - i; j > 0; j--) {
                System.out.print(' ');
            }

            //prints out stars
            for (int k = 0; k < i; k++) {
                System.out.print("**");
            }

            System.out.println();
        }

        //prints out trunk
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < SIZE - 1; j++)
                System.out.print(' ');
            System.out.println('#');
        }
    }
}