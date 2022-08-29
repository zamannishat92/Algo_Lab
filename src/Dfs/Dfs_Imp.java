package Dfs;

public class Dfs_Imp {
    int node;
    int edge;
    int[][] adj ;
    int[] color;
    int white;
    int gray;
    int black;

    Dfs_Imp(int[][] adj,int[] color,int node,int edge){
        this.edge=edge;
        this.node=node;
        this.adj=new int[100][100];
        this.color=new int[100];
    }
    void dfs_visit(int x){
        color[x] = gray;
        for(int i=0;i<node;i++){
            if(adj[x][i]==1){
                if(color[i]==white){
                    dfs_visit(i);
                }
            }
        }
        color[x]=black;

    }

    void dfs(){
        for(int i=0;i<node;i++){
            color[i] = white;
        }
        for(int i=0;i<node;i++){
            if(color[i]==white){
                dfs_visit(i);
            }
        }
    }
    void print(){
        for(int i=0;i<node;i++){
            System.out.println(color[i]+" ");
        }
    }



}
