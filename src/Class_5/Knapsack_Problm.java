package Class_5;

import java.util.Scanner;

public class Knapsack_Problm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of soldiers--");
        int w = sc.nextInt();
        System.out.println("Enter the total objects--");
        int n =sc.nextInt();
        System.out.println("Enter the weight of each objects(kg)--");
        double[] arr1= new double[n];
        double[] arr2 = new double[n];
        for(int i=0 ;i<n;i++){
            arr1[i] = sc.nextDouble();
        }
       System.out.println("Enter the dollar of each objects($)--");

        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextDouble();
        }
        //System.out.println("Calculate the UNIT value of each objects--");
        double[] arr3 = new double[n];
        for(int i=0;i<n;i++){
            double value = arr2[i]/arr1[i];
            arr3[i]= value;

        }
        double temp1,temp2,temp3;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr3[i]<arr3[j]){
                    temp1=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp1;
                    temp2=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp2;
                    temp3=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp3;


                }
            }
        }
        /*for(int i=0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }*/
       int i=0;
        double sum=0;
        while(i < n){
            if(arr1[i] <= w){
                System.out.println("Weight which is taken for maximum value--"+arr1[i]);
                w= (int) (w-arr1[i]);
                sum+=arr2[i];
                i++;
            }else{
                System.out.println("Weight which is taken for maximum value--"+arr1[i]);
                w= (int) ((arr2[i]*w)/arr1[i]);
                sum+=w;
                i++;
            }
        }
        System.out.println();
        System.out.println("Maximum Possible value--"+sum);
    }
}
