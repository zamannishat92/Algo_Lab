package Class_1.Recursion.Matrix_Multiplication;

import java.util.Scanner;

public class Main {
    static int size=100;
    static int i=0,j=0,k=0;
    public static void matrixMultiplication(int[][] arra1,int[][] array2,int a1,int a2,int[][] array3){
        if (i >= a1){
            return;
        }
        if (j < a2)

        {
            if (k < a1)
            {
                array3[i][j] += arra1[i][k] * array2[k][j];
                k++;

                matrixMultiplication(array2,array2,a1,a2,array3);
            }

            k = 0;
            j++;
            matrixMultiplication(array2,array2,a1,a2,array3);
        }

        j = 0;
        i++;
        matrixMultiplication(array2,array2,a1,a2,array3);
    }
    public static void rec(int[][] array1,int[][] array2,int a1,int a2){
        if(a1!=a2){
            System.out.println("Multiplication not possible!");
            return;
        }
        int[][] array3 = new int[size][size];
        matrixMultiplication(array1,array2,a1,a2,array3);
        for (int i = 0; i < a1; i++)
        {
            for (int j = 0; j < a2; j++)
                System.out.print(array3[i][j]+" ");

            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array1 size-");
        int a1_size=sc.nextInt();
        int[][] array1 = new int[a1_size][a1_size];
        for(int i=0;i<a1_size;i++){
            for(int j=0;i<a1_size;j++){
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the array2 size-");
        int a2_size=sc.nextInt();
        int[][] array2 = new int[a2_size][a2_size];
        for(int i=0;i<a2_size;i++){
            for(int j=0;i<a2_size;j++){
                array2[i][j] = sc.nextInt();
            }
        }
        rec(array1,array2,a1_size,a2_size);
    }
}
