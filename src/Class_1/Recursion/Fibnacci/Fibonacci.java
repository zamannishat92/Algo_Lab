package Class_1.Recursion.Fibnacci;

public class Fibonacci {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

}
