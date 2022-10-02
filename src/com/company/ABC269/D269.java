package com.company.ABC269;

import java.util.Scanner;

public class D269 {
    static boolean visited[][] = new boolean[2010][2010];
    static boolean color[][] = new boolean[2010][2010];

    static int ans = 0;
    static int dx[] = {-1,-1, 0, 0, 1, 1};
    static int dy[] = {-1, 0,-1, 1, 0, 1};

    public static void traverse(int x, int y){
        if(visited[x][y]) return;
        visited[x][y] = true;

        for(int i=0; i<6; ++i) {
            int nextx = x + dx[i];
            int nexty = y + dy[i];
            if(nextx < 0) continue;
            if(nexty < 0) continue;
            if(nextx > 2001) continue;
            if(nexty > 2001) continue;
            if(color[nextx][nexty] == false) continue;
            if(visited[nextx][nexty]) continue;
            traverse(nextx, nexty);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; ++i){
            int x = sc.nextInt()+1000;
            int y = sc.nextInt()+1000;
            color[x][y] = true;
        }

        for(int i=0; i<2001; ++i){
            for(int j=0; j<2001; ++j){
                if(visited[i][j] == false && color[i][j] == true ){
                    ans++;
                    traverse(i, j);
                }
            }
        }

        System.out.println(ans);

    }
}
