
// an abstract class for a student with a name, surname and index number
public abstract class Student {
    private String imie;
    private String nazwisko;
    private String indeks;

    public void ustawImie(String imie) {
        this.imie = imie;
    }

    public void ustawNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void ustawIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }
}
