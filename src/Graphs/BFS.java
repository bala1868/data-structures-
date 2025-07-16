package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Edge
{
    ArrayList<ArrayList<Integer>> al;
    int v;
    Edge(int v)
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
    public void  bfs(int v)
    {
        int n=al.size();
        boolean[] vis=new boolean[n+1];
        vis[v]=true;
        Queue<Integer> queue=new LinkedList<>();
        queue.add(v);
        while(!queue.isEmpty())
        {
            int x=queue.poll();
            System.out.println(x);
          for(int i:al.get(x))
          {
              if(!vis[i])
              {
                  queue.add(i);
                  vis[i]=true;
              }
          }
        }
    }
}
public class BFS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int v=scanner.nextInt();
        Edge edge=new Edge(v);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++)
            edge.addEdge(scanner.nextInt(), scanner.nextInt());
        int st=scanner.nextInt();
        edge.bfs(st);

    }
}
