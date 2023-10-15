import java.util.Arrays;

public class Zad1_2 {

    public static double[] CalculateQuadraticFunc(double a, double b, double c) throws Exception {
        double delta = (b * b) - (4 * (a * c));
        if (delta < 0) throw new Exception("Delta < 0");
        if (delta == 0) return new double[] {-b / 2 * a};

        double ans1 = (-Math.sqrt(delta) - b) / (2 * a);
        double ans2 = (Math.sqrt(delta) - b) / (2 * a);

        return new double[]{ans1, ans2};

    }

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(CalculateQuadraticFunc(5, 0, -3)));
    }
}
