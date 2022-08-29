package Dfs.Minimum_panning_Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertices-");
        int vertices = sc.nextInt();
        Graph graph = new Graph(vertices);
        for(int i=0;i<vertices+1;i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();
            graph.addEgde(source,destination,weight);
        }
        graph.kruskalMST();
    }
}
