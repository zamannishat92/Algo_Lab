package Class_1.Recursion.ArraySum;

import java.util.Scanner;

public class Main {
    static int sum(int arr[], int n) {
        if(n==0){
            return 0;
        }
       return arr[n-1]+sum(arr,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        int arr[] = new int[50];
        System.out.println("Enter the array size- ");
        int n = sc.nextInt();
        System.out.println("Enter the array-");
        for(int i = 0 ; i<n ; i++){
             arr[i] = sc.nextInt();
        }
        int final_sum = 0;
        for(int i = 0 ; i<n ; i++){
            final_sum=sum(arr,n);
        }
        System.out.println(final_sum);

    }
}
