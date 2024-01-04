package Zad1;//Należy zmodyfikować wcześniej napisany program z listy 5 w taki sposób aby
//wszystkie pola klasy Samochód były dostępne maksymalnie z poziomu pakietu.
//Dodatkowo dodać zmienną Lp. która będzie dostępna tylko w klasie AutoKomis.

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Samochod2 {
    // Fields with package-private access
    String brand;
    String model;
    double engineSize;
    bodyType bodyType;
    engineType engineType;
    int yearOfProduction;
    LocalDate firstRegisteredDate;
    double price;

    // Constructors, getters, setters, and rest of the class...

    public enum bodyType {
        SEDAN, KOMBI, HATCHBACK, CABRIO, SUV, PICKUP, VAN
    }

    public enum engineType {
        GAS, DIESEL, ELECTRIC, HYBRID
    }
}
