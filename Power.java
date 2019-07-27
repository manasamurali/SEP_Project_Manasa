import java.util.*;
public class Power {
    public static double calculatePower(double base, double exponent) {
        if (exponent == 0)
            return 1;
        else if (exponent > 0) {
            return base * calculatePower(base, exponent - 1);

        } else
            return 1 / calculatePower(base, -exponent);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        double result = calculatePower(base, exponent);
        System.out.println(result);
    }
}

