package Online;

import java.util.Scanner;

public class Online3_Q1 {
    public static int max(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void f(int n,int c,int[] array1,int[] array2){
        int[][] array=new int[n+1][c+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= c; j++) {
                if(i==0||j==0){
                    array[i][j]=0;
                }else if(n==0 && c==0){
                    break;
                }
                else if(j<array1[i-1]){
                    array[i][j]=array[i-1][j];
                }else {
                    array[i][j]=max(array2[i-1]+array[i-1][c-array1[i-1]],array[i-1][c]);
                }
            }
        }
        int j=0;
        System.out.println("Caso"+" "+j+++":"+array[n][c]);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books");
        int n=sc.nextInt();
        int[] array1=new int[1000];
        int[] array2=new int[1000];
        System.out.println("Enter the weight-");
        for (int i = 1; i < n; i++) {
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the value of interest-");
        for (int i = 1; i < n; i++) {
            array2[i]=sc.nextInt();
        }
        System.out.println("Enter the capacity-");
        int c=sc.nextInt();
        int a=0;
        while(a==0) {
            if(c>=1 && c<=100) {
                f(n,c, array1, array2);
            }
        }
    }
}
