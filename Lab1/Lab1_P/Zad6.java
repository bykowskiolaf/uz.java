public class Zad6 {
    public static Double calculateLeasingCost(Double carWorth, Double initialPayment, Integer lengthInMonths) {
        if (initialPayment > 300_000 || lengthInMonths > 96) return null;
        double monthlyPercantage = 0.0;

        if (lengthInMonths < 24) {
            monthlyPercantage = 0.02;
        } else if (lengthInMonths < 48) {
            monthlyPercantage = 0.03;
        } else if (lengthInMonths < 60) {
            monthlyPercantage = 0.04;
        } else if (lengthInMonths < 72) {
            monthlyPercantage = 0.05;
        } else if (lengthInMonths < 96) {
            monthlyPercantage = 0.06;
        }

        double interest = (carWorth - initialPayment) * monthlyPercantage;

        return (carWorth - initialPayment + interest) / lengthInMonths;
    }

    public static void main(String[] args) {
        Double result = calculateLeasingCost(100_000.0, 10_000.0, 24);
        System.out.println(result);
    }
}
