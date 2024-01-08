// a class that extends StudentUZ and adds a field instytut
public class StudentInstytut extends StudentUZ {
    private String instytut;

    public void ustawInstytut(String instytut) {
        this.instytut = instytut;
    }

    public String getInstytut() {
        return instytut;
    }
}
