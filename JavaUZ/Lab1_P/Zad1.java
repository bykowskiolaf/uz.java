public class Zad1 {
    public static void main(String[] args) {
        int SIZE = 10;

        for (int i = 0; i < SIZE; i++) {

            for (int j = SIZE - i; j > 0; j--) {
                System.out.print(' ');
            }

            for (int k = 0; k < i; k++) {
                System.out.print("**");
            }

            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < SIZE - 1; j++)
                System.out.print(' ');
            System.out.println('#');
        }
    }
}