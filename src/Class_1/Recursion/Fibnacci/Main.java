package Class_1.Recursion.Fibnacci;

import Class_1.Recursion.Fact.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number--");
        int n = sc.nextInt();
        Fibonacci f = new Fibonacci(n);
        System.out.println("Fibonacci Value="+ f.fib(n));

    }
}
