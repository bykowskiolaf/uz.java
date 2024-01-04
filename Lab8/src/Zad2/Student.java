package Zad2;//Stwórz klasę opisującą studenta (imię, nazwisko, numer indeksu), a następnie stwórz
//jej listę obiektów. Podaj ile elementów zawiera lista, oraz co znajduje się w 3
//elemencie tej listy.

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Student {
    private final String imie;
    private final String nazwisko;
    private final String numerIndeksu;

    public Student(String imie, String nazwisko, String numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }

    @Override
    public String toString() {
        return "Zad2.Student{" +
                "imię='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer indeksu='" + numerIndeksu + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> studenci = new ArrayList<>();
        studenci.add(new Student("Jan", "Kowalski", "123456"));
        studenci.add(new Student("Anna", "Nowak", "234567"));
        studenci.add(new Student("Paweł", "Wiśniewski", "345678"));

        System.out.println("Liczba studentów w liście: " + studenci.size());

        System.out.println("Trzeci student na liście: " + studenci.get(2).toString());
    }
}
