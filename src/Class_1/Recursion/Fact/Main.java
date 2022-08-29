package Class_1.Recursion.Fact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number--");
        int n = sc.nextInt();
        Factorial f = new Factorial(n);
        System.out.println("Factorial Value="+f.fact(n));

    }
}
