package Zad4;//1. Stwórz klasę o nazwie Samochod reprezentującą dane pojazdu zawierającą następujące pola:
//marka,
//model,
//pojemność silnika,
//typ nadwozia,
//typ silnika,
//rok produkcji,
//data 1 rejestracji,
//cena.
//
//Klasa powinna zawierać osobne metody służące do ustawiania i zwracania wartości
//poszczególnych pól obiektów.

//Napisz metodę, która sprawdzi, czy samochód posiada jeszcze gwarancję (wiek
//pojazdu do 2 lat licząc od daty rejestracji) i zwróci informację w formie komunikatu
//tekstowego.

import lombok.ToString;

import java.time.LocalDate;
@ToString
public class Samochod {
    String brand;
    String model;
    double engineSize;
    static Samochod.bodyType bodyType;
    static Samochod.engineType engineType;
    int yearOfProduction;
    LocalDate firstRegisteredDate;
    double price;

    public Samochod() {
        this.brand = "";
        this.model = "";
        this.engineSize = 0;
        this.bodyType = bodyType.SEDAN;
        this.engineType = engineType.GAS;
        this.yearOfProduction = 0;
        this.firstRegisteredDate = LocalDate.now();
        this.price = 0;
    }

    public Samochod(String brand, String model, double engineSize, Samochod.bodyType bodyType, Samochod.engineType engineType, int yearOfProduction, LocalDate firstRegisteredDate, double price) {
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.yearOfProduction = yearOfProduction;
        this.firstRegisteredDate = firstRegisteredDate;
        this.price = price;
    }

    
    public enum bodyType {
        SEDAN, KOMBI, HATCHBACK, CABRIO, SUV, PICKUP, VAN
    }

    public enum engineType {
        GAS, DIESEL, ELECTRIC, HYBRID
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public Samochod.bodyType getTypNadwozia() {
        return bodyType;
    }

    public void setTypNadwozia(Samochod.bodyType typNadwozia) {
        this.bodyType = typNadwozia;
    }

    public Samochod.engineType getTypSilnika() {
        return engineType;
    }

    public void setTypSilnika(Samochod.engineType typSilnika) {
        this.engineType = typSilnika;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public LocalDate getFirstRegisteredDate() {
        return firstRegisteredDate;
    }

    public void setFirstRegisteredDate(LocalDate firstRegisteredDate) {
        this.firstRegisteredDate = firstRegisteredDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean checkIfStillHasWarranty() {
        LocalDate today = LocalDate.now();
        LocalDate warrantyEnd = this.firstRegisteredDate.plusYears(2);
        return today.isBefore(warrantyEnd);
    }
}
