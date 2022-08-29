package Class_1.Recursion.Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number--");
        int a = sc.nextInt();
        System.out.println("Enter the power--");
        int n  =sc.nextInt();

        Power p = new Power(a,n);
        System.out.println("Power Value--"+p.power(a,n));
    }
}