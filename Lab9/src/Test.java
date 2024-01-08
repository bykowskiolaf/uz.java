//W nowej klasie testowej Test utwórz obiekt klasy StudentInstytut oraz zdefiniuj kod,
//który korzystając z podanych metod pozwoli użytkownikowi na zdefiniowanie
//wartości każdego z pól.

public class Test {
    public static void main(String[] args) {
        // creating an object of StudentInstytut class
        StudentInstytut student = new StudentInstytut();

        // setting the values of the fields using setters
        student.ustawImie("Jan");
        student.ustawNazwisko("Kowalski");
        student.ustawIndeks("123456");
        student.ustawWydzial("Wydział Informatyki, Elektrotechniki i Automatyki");
        student.ustawInstytut("Instytut Sterowania i Systemów Informatycznych");

        // printing the values of the fields using getters
        System.out.println(STR."Student: \n\{student.getInstytut()}, \{student.getWydzial()}, \{student.getIndeks()}, \{student.getNazwisko()}, \{student.getImie()}");
    }
}
