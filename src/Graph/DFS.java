package Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<5;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> ans=dfsofgraph(5,adj);
        int n=adj.size();
        for(int i=0;i<n;i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ls){
        vis[node]=true;
        ls.add(node);
        for(Integer it:adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }
    static ArrayList<Integer> dfsofgraph(int v,ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[v];
        vis[0]=true;
        ArrayList<Integer>ls=new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
}
