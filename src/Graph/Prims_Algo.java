package Graph;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Prims_Algo {
    public static int minKey(int key[], Boolean mstSet[])
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int i = 0; i < key.length; i++)
            if (mstSet[i] == false && key[i] < min) {
                min = key[i];
                min_index = i;
            }

        return min_index;
    }
    public static void primMST(int graph[][])
    {
        int length = graph.length;
        int parent[] = new int[length];
        int key[] = new int[length];
        Boolean mstSet[] = new Boolean[length];
        for (int i = 0; i < length; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int i = 0; i < length - 1; i++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;
            for (int j = 0; j < length; j++)
                if (graph[u][j] != 0 && mstSet[j] == false && graph[u][j] < key[j]) {
                    parent[j] = u;
                    key[j] = graph[u][j];
                }
        }
        System.out.println("Edge \tWeight");
        for (int i = 1; i < length; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = sc.nextInt();
        System.out.println("Enter the number of edges");
        int edges = sc.nextInt();
        int[][] graph = new int[vertices][vertices];
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter the source");
            int source = sc.nextInt();
            System.out.println("Enter the destination");
            int destination = sc.nextInt();
            System.out.println("Enter the distance");
            int distance = sc.nextInt();
            graph[source][destination] = distance;
            graph[destination][source] = distance;
        }
        primMST(graph);
    }
}
