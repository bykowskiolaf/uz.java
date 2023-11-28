import java.util.ArrayList;

public class CustomArray<T> {

    ArrayList<ArrayList<T>> table = new ArrayList<ArrayList<T>>();

    CustomArray() {
        table.add(new ArrayList<T>());
    }

    CustomArray(int size) {
        for (int i = 0; i < size; i++) {
            table.add(new ArrayList<T>());
        }
    }

    public void addRow() {
        table.add(new ArrayList<T>());
    }

    public void pushElement(T element, int row) {
        table.get(row).add(element);
    }

    public void popElement(int row) {
        table.get(row).remove(table.get(row).size() - 1);
    }

    public ArrayList<ArrayList<T>> getTable() {
        return table;
    }

    public void prettyPrintTable() {
        for (int i = 0; i < table.size(); i++) {
            System.out.println(table.get(i));
        }
    }

//    public static void main(String[] args) {
//        CustomArray<Integer> customArray = new CustomArray<Integer>();
//        customArray.addRow();
//
//        customArray.pushElement(5, 0);
//        customArray.pushElement(6, 0);
//        customArray.popElement(0);
//        customArray.pushElement(7, 0);
//        customArray.prettyPrintTable();
//    }
}
