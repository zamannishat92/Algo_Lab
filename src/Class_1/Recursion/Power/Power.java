package Class_1.Recursion.Power;

//import java.lang.StrictMath.pow;

public class Power {
    int n, a;

    Power(int a, int n) {
        this.n = n;
    }

    double power(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return (a * power(a, n - 1));
        } else {
            return ((1 / a) * (power(a, n +1)));
        }
    }
}