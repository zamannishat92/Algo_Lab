package Graph;

import java.util.Scanner;

public class Graph_AdjaMatrix {
    static int[][] adj = new int[100][100];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes-");
        int node = sc.nextInt();
        System.out.println("Enter the edges-");
        int edge = sc.nextInt();
        int n1,n2;
        for(int i=0;i<edge;i++){
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                adj[n1][n2] = 1;
                adj[n2][n1] = 1;
        }
        for(int i=0;i<node;i++){
            for(int j=0;j<node;j++){
                System.out.println(adj[i][j]+" ");
            }
        }

    }
}
