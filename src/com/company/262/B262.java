import java.util.*;

class B262{
    static int ans = 0;
    static int N;
    static int M;
    static boolean[][] g;


    static void rec(int d, int cur, int root){
        if(d == 2){
            if(g[cur][root] == true) ans++;
        }else {
            for(int i=0;i<N;++i){
                if(i <= cur) continue;
                if(g[cur][i] != true) continue;
                rec(d+1, i, root);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        g = new boolean[N][N];


        for(int i=0; i<M; ++i){
            int u = sc.nextInt();
            int v = sc.nextInt();
            u--;
            v--;
            g[u][v] = true;
            g[v][u] = true;
        }

        for(int i=0; i<N; ++i){
            for(int j=i+1; j<N; ++j){
                if(g[i][j] != true) continue;
                rec(1, j, i);
            }
        }

        System.out.println(ans);
    }
}