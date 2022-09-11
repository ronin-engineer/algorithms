package bfs;

import java.util.*;

public class ExistingPath {
    // https://leetcode.com/problems/find-if-path-exists-in-graph/

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Set<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        if (graph.get(source).contains(destination))
            return true;

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while (!q.isEmpty()) {
            int vertex = q.poll();
            if (vertex == destination)
                return true;

            if (!visited[vertex]) {
                visited[vertex] = true;
                for (int v: graph.get(vertex)) {
                    if (!visited[v])
                        q.add(v);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1}, {0,2}, {3,5}, {5,4}, {4,3}};
        int n = 6;
        int source = 0;
        int destination = 5;

        System.out.println(validPath(n, edges, source, destination));
    }
}
