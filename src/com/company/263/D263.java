import java.util.Scanner;

class D263{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long L = sc.nextInt();
        long R = sc.nextInt();

        long[] A = new long[N];

        for(int i=0; i<N; ++i){
            A[i] = sc.nextInt();
        }

        long[] left_dp = new long[N+1];
        long[] right_dp = new long[N+1];

        for(int i=0;i<N; ++i){
            left_dp[i+1] = Math.min(left_dp[i] + A[i], L*(i+1));
        }

        for(int i=N-1;i>=0; --i){
            right_dp[i] = Math.min(right_dp[i+1] + A[i], R*(N-i));
        }

        long ans = Long.MAX_VALUE;

        for(int i=0; i<N+1; ++i){
            ans = Math.min(ans, left_dp[i]+right_dp[i]);
        }


        System.out.println(ans);

    }
}