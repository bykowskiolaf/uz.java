import java.util.ArrayList;

public class AutoKomis {
   ArrayList<Samochod> samochody = new ArrayList<Samochod>();

    public void dodajSamochod(Samochod samochod) {
        samochody.add(samochod);
    }

    public void usunSamochod(Samochod samochod) {
        samochody.remove(samochod);
    }

    public void wyswietlSamochody() {
        for (Samochod samochod : samochody) {
            System.out.println(samochod);
        }
    }

    public AutoKomis() {
        samochody = new ArrayList<Samochod>();
        for (int i = 0; i < 10; i++) {
            samochody.add(new Samochod());
        }
    }
}
