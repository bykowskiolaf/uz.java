//W salonie samochodowym zaoferowano sprzedaż leasingową pojazdów. Napisz
//kod, który policzy miesięczne zobowiązanie z uwzględnieniem odsetek i
//wpłaconego kapitału własnego.
//Dane wejściowe to maksymalna kwota: 300 tyś PLN, liczba rat do 96.
//Oprocentowanie wynosi:
//do 24 miesięcy 2%
//do 48 miesięcy 3%
//do 60 miesięcy 4%
//do 72 miesięcy 5%
//do 96 miesięcy 6%

public class Zad6 {

    //this method calculates the leasing cost
    public static Double calculateLeasingCost(Double carWorth, Double initialPayment, Integer lengthInMonths) {
        //initialPayment must be less than 300,000 and length in months must be less than 96
        if (initialPayment > 300_000 || lengthInMonths > 96) throw new IllegalArgumentException("Initial payment must be less than 300,000 and length in months must be less than 96");
        //initialPayment and lengthInMonths must be positive
        if (initialPayment < 0 || lengthInMonths < 0) throw new IllegalArgumentException("Initial payment and length in months must be positive");
        double interest = getInterest(carWorth, initialPayment, lengthInMonths);

        //return the monthly cost
        return (carWorth - initialPayment + interest) / lengthInMonths;
    }

    //this method calculates the interest
    private static double getInterest(Double carWorth, Double initialPayment, Integer lengthInMonths) {
        double monthlyPercantage = 0.0;

        //set the monthlyPercantage based on the lengthInMonths
        if (lengthInMonths < 24) {
            monthlyPercantage = 1.02;
        } else if (lengthInMonths < 48) {
            monthlyPercantage = 1.03;
        } else if (lengthInMonths < 60) {
            monthlyPercantage = 1.04;
        } else if (lengthInMonths < 72) {
            monthlyPercantage = 1.05;
        } else if (lengthInMonths < 96) {
            monthlyPercantage = 1.06;
        }

        //return the interest
        return ((carWorth - initialPayment) * monthlyPercantage) / lengthInMonths;
    }

    public static void main(String[] args) {
        //test the method
        Double result = calculateLeasingCost(100_000.0, 10_000.0, 24);

        //print the result
        System.out.println(result);
    }
}
