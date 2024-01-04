import lombok.Builder;

public class Zad1 {
    public static class Calculator {
        Double[] numbers;

        public Calculator(Double a) {
            numbers = new Double[]{a};
        }

        public Calculator(Double a, Double b, Double c, Double d) {
            numbers = new Double[]{a, b, c, d};
        }

        public Calculator(Double a, Double b, Double c, Double d, Double e, Double f, Double g) {
            numbers = new Double[]{a, b, c, d, e, f, g};
        }

        @Builder
        public Calculator(Double a, Double b, Double c, Double d, Double e, Double f, Double g, Double h) {
            numbers = new Double[]{a, b, c, d, e, f, g, h};
        }

        public Calculator(Calculator otherCalculator) {
            this.numbers = otherCalculator.numbers.clone();
        }

        public double calculateSum() {
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = Calculator.builder()
                .a(1.0)
                .b(2.0)
                .c(3.0)
                .d(4.0)
                .e(5.0)
                .f(6.0)
                .g(7.0)
                .build();

        Calculator asd = new Calculator(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
        System.out.println(calculator.calculateSum());
    }
}
