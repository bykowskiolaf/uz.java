public class Test {
    public static void main(String[] args) {
        StudentInstytut student = new StudentInstytut();
        student.ustawImie("Jan");
        student.ustawNazwisko("Kowalski");
        student.ustawIndeks("123456");
        student.ustawWydzial("Wydział Informatyki, Elektrotechniki i Automatyki");
        student.ustawInstytut("Instytut Sterowania i Systemów Informatycznych");

        System.out.println("Student: \n" + student.getInstytut() + ", " + student.getWydzial() + ", " + student.getIndeks() + ", " + student.getNazwisko() + ", " + student.getImie());
    }
}
