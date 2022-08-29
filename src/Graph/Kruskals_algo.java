package Graph;

import java.util.Scanner;

public class Kruskals_algo {
    static int v,edge;
    static int[] parent = new int[100];
    static int[][] cost = new int[100][100];
    public static int find(int i){
        while(parent[i] != i){
            i = parent[i];
        }
        return i;
    }
    public static void union(int i,int j){
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }
    public static void krushkalMST(){
        int minCost = 0;
        int edgeCount = 0;
        while (edgeCount < v-1){
            int min = 1000000,a=-1,b=-1;
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(find(i) != find(j) && cost[i][j]<min){
                        min = cost[i][j];
                        a = i;
                        b = j;
                    }
                }
            }
            union(a,b);
            System.out.println("Edge count"+edgeCount+++":("+a+" "+b+") cost:"+min);
            minCost+=min;
        }
        System.out.println("Minimum Cost:"+minCost);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes-");
        v = sc.nextInt();
        System.out.println("Enter the edges-");
        edge = sc.nextInt();
        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                cost[i][j] = 1000000;
            }

        }
        for (int i = 0; i < edge; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            cost[n1][n2] = sc.nextInt();
        }
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }
        krushkalMST();
        return ;

    }
}
