import java.util.Scanner;

class D261{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long dp[][] = new long[N+1][N+1];
        long score[] = new long[N];
        long bonus[] = new long[N+1];
        for(int i=0; i<N; ++i){
            score[i] = sc.nextInt();
        }
        for(int i=0; i<M; ++i){
            int C = sc.nextInt();
            int Y = sc.nextInt();
            bonus[C] = Y;
        }
        dp[0][0] = 0;
        for(int i=0; i<N; ++i){
            for(int j=0; j<N; ++j){
                if(j > i) continue;
                // head
                dp[i+1][j+1] = Math.max( dp[i+1][j+1], dp[i][j]+score[i]+bonus[j+1] );
                //tail
                dp[i+1][0] = Math.max( dp[i+1][0], dp[i][j]);
            }
        }
        long ans = 0;
        for(int i=0; i<=N; ++i){
            ans = Math.max(ans, dp[N][i] );
        }
        System.out.println(ans);
    }
}