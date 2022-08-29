package Dp;

import java.util.Scanner;

public class Fibonacci_dp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number-");
        int n = sc.nextInt();
        System.out.println("Enter the array-");
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println("The fibonacci number of n-"+arr[n]);
    }
}
