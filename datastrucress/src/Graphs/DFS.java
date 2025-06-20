package Graphs;

import java.util.ArrayList;
import java.util.Scanner;
class Edge1{
    ArrayList<ArrayList<Integer>> al;
    int v;
    Edge1(int v)
    {
        this.v=v;
        al=new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            al.add(new ArrayList<>());
        }
    }
    public void addEdge(int a,int b)
    {
        al.get(a).add(b);//directed graph
        //al.get(b).add(a);//if undirectedgraph u can add this line also
    }
    public void dfs(int v,boolean[] vis)
    {
        if(vis[v])return;
        vis[v]=true;
        System.out.println(v);
        for(int i:al.get(v))
            dfs(i,vis);

    }
}
public class DFS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int v=scanner.nextInt();
        Edge1 edge=new Edge1(v);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++)
            edge.addEdge(scanner.nextInt(), scanner.nextInt());
        int st=scanner.nextInt();
        edge.dfs(st,new boolean[v+1]);

    }
}
