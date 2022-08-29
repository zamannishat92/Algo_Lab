package Class_3;

import java.util.Scanner;

public class Merge_Sort {

    public static void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
       int[] temp1 = new int[n1];
       int[] temp2 = new int[n2];
       for(int i=0 ;i<n1 ;i++){
           temp1[i] = arr[low+i];
       }
       for(int j=0 ;j<n2 ;j++){
           temp2[j]=arr[mid+1+j];
       }
       int i=0,j=0;
        int k = low;

        while (i < n1 && j < n2) {
            if (temp1[i] <=temp2[j]) {
                arr[k] = temp1[i];
                i++;
            }
            else {
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = temp1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }
    public static void merge_sort_func(int[] arr,int low,int high){
        if(low<high){
            int mid=((low+high)/2);
            merge_sort_func(arr,low,mid);
            merge_sort_func(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

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
        int[] arr=new int[n];
        System.out.println("Enter the array--");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        merge_sort_func(arr,0,n-1);
        print(arr,n);

    }
}