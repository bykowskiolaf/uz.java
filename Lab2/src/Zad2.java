//Wyznacz równanie kwadratowe z podanych przez użytkownika wartości
//parametrów a, b i c.

import java.util.Arrays;

public class Zad2 {

    //this is the primary method of this class, it calculates the quadratic function and returns the answers as an array
    public static double[] CalculateQuadraticFunc(double a, double b, double c) throws Exception {
        double delta = Math.pow(b,2) - (4 * (a * c));
        if (delta < 0) throw new Exception("Delta < 0");
        if (delta == 0) return new double[] {-b / 2 * a};

        if(delta > 0){
            double ans1 = (-Math.sqrt(delta) - b) / (2 * a);
            double ans2 = (Math.sqrt(delta) - b) / (2 * a);

            return new double[]{ans1, ans2};
        }
        return new double[]{};
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(CalculateQuadraticFunc(1, 3, -15)));
    }
}
