public class Zad1_6 {
    public static Double calculateLeasingCost(Double carWorth, Double initialPayment, Integer lengthInMonths) {
        if (initialPayment > 300_000 || lengthInMonths > 96) throw new IllegalArgumentException("Initial payment must be less than 300,000 and length in months must be less than 96");
        if (initialPayment < 0 || lengthInMonths < 0) throw new IllegalArgumentException("Initial payment and length in months must be positive");
        double interest = getInterest(carWorth, initialPayment, lengthInMonths);

        return (carWorth - initialPayment + interest) / lengthInMonths;
    }

    private static double getInterest(Double carWorth, Double initialPayment, Integer lengthInMonths) {
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

        return (carWorth - initialPayment) * monthlyPercantage;
    }

    public static void main(String[] args) {
        Double result = calculateLeasingCost(100_000.0, 10_000.0, 24);
        System.out.println(result);
    }
}
