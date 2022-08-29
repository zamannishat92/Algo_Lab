package Class_5;

import java.util.Scanner;

public class Greedy_Selection {
    public static void greedy_Selection(int[] arr1,int[] arr2,int s){
        int i = 0;
        System.out.println();
        System.out.println("Following activities are selected : ");
        System.out.println(arr1[i]+" "+arr2[i]);
        for(int j=1;j<s;j++){
            if(arr1[j]>=arr2[i]){
                System.out.println(arr1[j]+" "+arr2[j]);
                i=j;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tasks--");
        int n = sc.nextInt();
        System.out.println("Enter the Start time of each task--");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the finish time of each task--");
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int temp1,temp2;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr2[i]>arr2[j]){
                    temp1=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp1;
                    temp2=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp2;

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        int s=arr1.length;
        greedy_Selection(arr1,arr2,s);
    }
}
