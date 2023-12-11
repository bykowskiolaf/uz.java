import lombok.Builder;

public class Zad1 {

    public static class Calculator {
        Double result;

        public Calculator(Double a) {
            result = a;
        }

        public Calculator(Double a, Double b, Double c, Double d) {
            result = a + b + c + d;
        }

        public Calculator(Double a, Double b, Double c, Double d, Double e, Double f, Double g) {
            result = a + b + c + d + e + f + g;
        }

        @Builder
        public Calculator(Double a, Double b, Double c, Double d, Double e, Double f, Double g, Double h) {
            result = a + b + c + d + e + f + g + h;
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

        System.out.println(calculator.result);
    }

}
