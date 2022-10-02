package com.company.ABC270;

import java.util.*;
import java.util.Stack;

public class C270 {

    static Stack<Integer> s = new Stack<>();
    static List<List<Integer>> graph;
    static int N;
    static boolean find = false;
    static int target;

    static void dfs(int cur, int parent){
        if(find) return;
        s.add(cur);
        if(cur == target){
            for(int n: s){
                System.out.println(n+1);
            }
            find = true;
            System.exit(0);
        }

        for(int i=0; i<graph.get(cur).size(); ++i){
            int n = graph.get(cur).get(i);
            if(n == parent) continue;
            dfs(n, cur);
        }

        s.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next()); int Y = Integer.parseInt(sc.next());
        X--; Y--;
        target = Y;
        graph = new ArrayList<>(N);
        for(int i=0; i<N; ++i){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<N-1; ++i){
            int U = Integer.parseInt(sc.next());
            int V = Integer.parseInt(sc.next());
            U--;
            V--;

            graph.get(U).add(V);
            graph.get(V).add(U);
        }
        dfs(X, -1);
    }
}
