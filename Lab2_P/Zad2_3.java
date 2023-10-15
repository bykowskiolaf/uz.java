//Losujemy liczbę z zakresu od 1 do 200. Zadaniem użytkownika jest podanie właściwej
//wylosowanej liczby. Jeżeli wczytana liczba jest mniejsza od wylosowanej użytkownik
//zostanie o tym poinformowany, tak samo jak w przypadku podania wartości wyższej.
//W przypadku odgadnięcia wartości wylosowanej liczby użytkownik otrzyma
//odpowiedni komunikat.

import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 200 + 1);
        int userNumber = 0;

        while (userNumber != randomNumber) {
            System.out.println("Podaj liczbe: ");
            userNumber = scanner.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Za malo");
            } else if (userNumber > randomNumber) {
                System.out.println("Za duzo");
            } else {
                System.out.println("Zgadles!");
            }
        }

    }
}
