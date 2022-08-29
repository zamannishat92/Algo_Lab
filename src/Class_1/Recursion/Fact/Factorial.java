package Class_1.Recursion.Fact;

public class Factorial {
    int n;

    Factorial(int n) {
        this.n = n;
    }

    static int fact(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }

    }
}