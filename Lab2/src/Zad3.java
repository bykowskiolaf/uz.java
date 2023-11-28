//Opracuj kod służący do konwersji prędkości samochodu z mil na km/h.

public class Zad3 {

    public static double ConvertMphToKmh(int mph) {
        return mph * 1.609344;
    }

    public static void main(String[] args) {
        System.out.println(ConvertMphToKmh(30));
    }
}
