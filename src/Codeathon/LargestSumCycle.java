package Codeathon;

import java.util.*;
public class LargestSumCycle {

        public static int[] findCycle(int[] e, int start, boolean[] visited){

            int current = start;
            int size = 0;
            int sum = 0;

            ArrayList<Integer> cycle = new ArrayList<>();

            while(e[current] != -1 && !cycle.contains(current)){
                size++;
                sum += current;
                cycle.add(current);
                current = e[current];
            }

            if(current == start) {
                for(int nodes : cycle)
                    visited[nodes] = true;
                return new int[]{sum, size};
            }
            return new int[] {0,0};
        }

        static long largestCycleSum = Integer.MIN_VALUE;
        static void DFS(int node,int[] edges,boolean[] nodeVisited, boolean[] pathVisited){

            nodeVisited[node] = true;
            pathVisited[node] = true;

            if(edges[node] != -1){
                int adjNode = edges[node];
                if(!nodeVisited[adjNode])
                    DFS(adjNode,edges,nodeVisited,pathVisited);
                else if(pathVisited[adjNode]){

                    int currentNode = adjNode;
                    long curentCycleSum = 0;
                    do{
                        curentCycleSum += currentNode;
                        currentNode = edges[currentNode];
                    }while (currentNode != adjNode);

                    largestCycleSum = Math.max(largestCycleSum,curentCycleSum);

                }
            }
            pathVisited[node] = false;

        }

        public static void main(String[] args) {

            int n = 23;
            int[] edges = new int[] {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
            boolean[] visited = new boolean[n];
            int maxSum = 0, maxCyleSize = 0;

            for(int i = 0 ; i < n ; i++){
                if(!visited[i]){
                    int[] arr = findCycle(edges,i,visited);
                    if(arr[1] != 0){
                        if(arr[0] > maxSum){
                            maxSum = arr[0];
                            maxCyleSize = arr[1];
                        }
                    }
                }
            }
            //System.out.println(maxSum);
            System.out.println(maxCyleSize);

            boolean[] nodeVisited = new boolean[n];
            boolean[] pathVisited = new boolean[n];
            for(int i = 0 ; i < n ; i++){
                if(!nodeVisited[i]){
                    DFS(i,edges,nodeVisited,pathVisited);
                }
            }
            System.out.println(largestCycleSum);
        }

    }

