package Class_3;

import java.util.Scanner;

public class Quick_Sort {
    public static int partition(int[] arr,int lb,int ub) {
        int temp;
        int start = lb;
        int end = ub;
        int pivot = arr[lb];
        while(start<end){
            while(arr[start] <= pivot){
                start++;
            }
            while ((arr[end]) > pivot){
                end--;
            }
            if(start<end){
                temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        temp = arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;
        return end;
    }
    public static int quick_sort(int[] arr,int lb,int ub){
        if(lb<ub){
            int loc = partition(arr,lb,ub);
            quick_sort(arr,lb,loc-1);
            quick_sort(arr,loc+1,ub);
        }
        return 0;

    }
    public static void print(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size--");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array--");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quick_sort(arr,0,n-1);
        print(arr,n);

    }

}
