package Dfs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edge = sc.nextInt();
        int node = sc.nextInt();
        int[][] adj = new int[100][100];
        int[] color = new int[100];
        int[] time=new int[100];
        int n1,n2;
        for(int i=0;i<edge;i++){
            n1=sc.nextInt();
            n2=sc.nextInt();
            adj[n1][n2] = 1;
            adj[n2][n1] = 1;
        }
        Dfs_Imp dfs = new Dfs_Imp(adj,color,node,edge);
        dfs.dfs();
        dfs.print();

    }
}
