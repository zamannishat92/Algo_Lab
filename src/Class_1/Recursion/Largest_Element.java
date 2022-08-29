package Class_1.Recursion;

import java.util.Scanner;

public class Largest_Element {
    private static int max;
    public static int find_Max(int[] arr,int n){
        if(arr[n-1]>max){
            max = arr[n-1];
            find_Max(arr,n-1);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];
        System.out.println("Enter the array size- ");
        int n = sc.nextInt();
        System.out.println("Enter the array-");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int max_Element=0;
        for(int i = 0 ; i<n ; i++){
            max_Element=find_Max(arr,n);
        }
        System.out.println(max_Element);
    }
}
