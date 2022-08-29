package Dp;
import java.util.Scanner;

public class Knapsack_Dp {
        public static int max(int a,int b){
            if(a>b){
                return a;
            }else{
                return b;
            }
        }
        public static void knapsak(int n,int c,int[] array1,int[] array2){
            int[][] array=new int[n+1][c+1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= c; j++) {
                    if(i==0||j==0){
                        array[i][j]=0;
                    }else if(j<array1[i-1]){
                        array[i][j]=array[i-1][j];
                    }else{
                        array[i][j]=max(array2[i-1]+array[i-1][c-array1[i-1]],array[i-1][c]);
                    }
                }
            }
            System.out.println("Maximum profit: "+array[n][c]);

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("How many item you want insert");
            int n=sc.nextInt();
            int[] array1=new int[n];
            int[] array2=new int[n];
            System.out.println("Enter the weight and value");
            for (int i = 0; i < n; i++) {
                array1[i]=sc.nextInt();
                array2[i]=sc.nextInt();
            }
            System.out.println("Enter the capacity");
            int c=sc.nextInt();
            knapsak(n,c,array1,array2);
        }
    }


