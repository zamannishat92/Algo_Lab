package Dp;

import java.util.Scanner;

public class miniNumCoins_Dp {
    public static int min(int a,int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount--");
        int amount = sc.nextInt();
        System.out.println("Enter the total number of coins--");
        int n = sc.nextInt();
        System.out.println("Enter the value of each coin--");
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int[][] solution=new int[c.length+1][amount+1];
        for(int i=0;i<=c.length;i++){
            for(int j=0;j<=amount;j++){
                if(c[i]>j){
                    solution[i][j] = solution[i-1][j];
                }
                else{
                    solution[i][j] = min(solution[i-1][j],1+solution[i][j-c[i]]);
                }
            }
        }
        System.out.println("The minimum Number of coins-"+solution[c.length][amount]);
    }
}
