package Practice_Recursion;

import java.util.Scanner;

public class Problem_1 {
    public static void greedy(int[] Ni,int[] Qi,int S){
        int flag=0;
        for(int i=1;i<=109;i++){
            if(Ni[i]>Qi[i]){
                System.out.println(Ni[i]);
            }
        }
        if(flag>0){

        }
    }
    public static void merge(int[] arr,int[] Qi,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];
        int[] temp3 = new int[n1];
        int[] temp4 = new int[n2];
        for(int i=0 ;i<n1 ;i++){
            temp1[i] = arr[low+i];
        }
        for(int j=0 ;j<n2 ;j++){
            temp2[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k = low;

        while (i < n1 && j < n2) {
            if (temp1[i] >=temp2[j]) {
                arr[k] = temp1[i];
                Qi[k]=temp3[i];
                i++;
            }
            else {
                arr[k] = temp2[j];
                Qi[k]=temp4[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = temp1[i];
            Qi[k]=temp3[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = temp2[j];
            Qi[k]=temp4[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Soilders number--");
        int S= sc.nextInt();
        System.out.println("Enter the skills value of Qi Soilders--");
        int[] Qi = new int[S];
        int[] Ni = new int[S];
        for(int i=1;i<=109;i++){
            Qi[i] = sc.nextInt();
        }
        System.out.println("Enter the skills value of Ni Soilders--");
        for(int i=1;i<=109;i++){
            Ni[i]=sc.nextInt();
        }
        int mid = ((1+109)/2);
        while (S>=1 || S<=105) {
            merge(Ni,Qi, 1, mid, 109);
        }
       greedy(Ni,Qi,S);

    }
}
