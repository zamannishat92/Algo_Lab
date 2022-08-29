package Online;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] vertex=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                vertex[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(vertex[i][j]+" ");
            }
            System.out.println();
        }

    }
}
