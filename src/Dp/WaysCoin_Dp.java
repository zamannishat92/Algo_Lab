package Dp;
import java.util.Scanner;

public class WaysCoin_Dp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total amount--");
        int amount=sc.nextInt();
        System.out.println("Enter the total number of coins--");
        int n=sc.nextInt();
        System.out.println("Enter the value of each coin--");
        int[] c=new int[n];
        for (int i=0;i<n;i++) {
            c[i]=sc.nextInt();
        }
        int[][] solution=new int[c.length+1][amount+1];
        for (int i=0;i<=c.length; i++) {
            for (int j=0;j<=amount;j++) {
                if(i==0&&j==0){
                    solution[0][0]=1;
                }else if(i==0){
                    solution[0][j]=0;
                }else{
                    if(c[i-1]>j){
                        solution[i][j]=solution[i-1][j];
                    }else{
                        solution[i][j]=solution[i-1][j]+solution[i][j-c[i-1]];
                    }
                }
            }
        }
        System.out.println("The total way--"+solution[c.length][amount]);
    }
}
