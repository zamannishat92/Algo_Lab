package Online;

import java.util.Scanner;

public class Online_4 {
    public static void dijkstras(int[][] graph){
        int length = graph.length;
            boolean[] visited=new boolean[length];
            int[] distance=new int[length];
            distance[0]=0;
            for(int i=1;i<length;i++) {
                distance[i] = Integer.MAX_VALUE;
            }
            for(int i=0;i<length-1;i++){
                int minVertex = MinVertex(distance,visited);
                visited[minVertex]=true;
                for( int j=0;j<length;j++){
                    if(graph[minVertex][j]!=0&&distance[minVertex]!=Integer.MAX_VALUE){
                        int newDistance = graph[minVertex][j]+distance[minVertex];
                        if(newDistance<distance[j]){
                            distance[j]=newDistance;
                        }
                    }
                }
            }
            for(int i=0;i<length;i++){
                System.out.println(i+" "+distance[i]);
            }


        }
        public static int MinVertex(int[] distance,boolean[] visited){
            int minVertex=-1;
            for(int i=0;i<distance.length;i++){
                if(!visited[i]&&(minVertex==-1||distance[i]<distance[minVertex])){
                    minVertex=i;
                }
            }
            return minVertex;
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=sc.nextInt();
        System.out.println("Enter the number of edges");
        int edges=sc.nextInt();
        int[][] graph=new int[vertices][vertices];
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter the source");
            int source=sc.nextInt();
            System.out.println("Enter the destination");
            int destination=sc.nextInt();
            System.out.println("Enter the distance");
            int distance=sc.nextInt();
            graph[source][destination]=distance;
            graph[destination][source]=distance;
        }
        dijkstras(graph);
    }
}
