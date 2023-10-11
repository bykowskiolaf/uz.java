public class Zad5 {

    private double result;

    public static void main(String[] args) {
    }

    public void dodaj(double number) {
        this.result += number;
    }

    public void odejmij(double number) {
        this.result -= number;
    }

    public void pomnoz(double number) {
        this.result *= number;
    }

    public void podziel(double number) throws Exception {
        if (number == 0) {
            throw new Exception("You can't divide by 0");
        }
        this.result /= number;
    }

    public void wyczysc() {
        this.result = 0;
    }

    public void wyswietl() {
        System.out.println(this.result);
    }

}
