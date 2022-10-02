import java.util.Scanner;
import java.util.*;
import java.util.logging.XMLFormatter;

class D266{
    static long[][] dp = new long[5][100002];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //dp[A][B] : the maximum point i can get when i',m in pos A at Time B

        Map<Integer, List<Integer>> monsters = new HashMap<>();
        for(int i=0; i<N; ++i){
            int T; int X; int A;
            T = sc.nextInt();
            X = sc.nextInt();
            A = sc.nextInt();

            monsters.put(T, Arrays.asList(X, A));
        }


        for(int t=1; t<100001; ++t){
            // time is in there or not
            if(monsters.containsKey(t)){
                long mpos =monsters.get(t).get(0);
                long mpoint = monsters.get(t).get(1);

                for(int p=0; p<5; ++p){
                    if(t >= p-1){
                        if(p-1 >=0){
                            if(p-1 == mpos){
                                dp[p-1][t] = Math.max(dp[p-1][t], dp[p][t-1] + mpoint);
                            }else{
                                dp[p-1][t] = Math.max(dp[p-1][t], dp[p][t-1]);
                            }
                        }
                    }

                    if(t >= p){
                        if(p == mpos){
                            dp[p][t] = Math.max(dp[p][t], dp[p][t-1] + mpoint);
                        }else {
                            dp[p][t] = Math.max(dp[p][t], dp[p][t-1]);
                        }
                    }

                    if(t >= p+1){
                        if(p+1<5){
                            if(p+1 == mpos){
                                dp[p+1][t] = Math.max(dp[p+1][t], dp[p][t-1] + mpoint);
                            }else {
                                dp[p+1][t] = Math.max(dp[p+1][t], dp[p][t-1]);
                            }
                        }
                    }
                }
            }else {
                for(int p=0; p<5; ++p){
                    if(p-1 >=0 && t >= p-1) dp[p-1][t] = Math.max(dp[p-1][t], dp[p][t-1]);
                    if(t >= p)dp[p][t] = Math.max(dp[p][t], dp[p][t-1]);
                    if(p+1 <5 && t >= p+1) dp[p+1][t] = Math.max(dp[p+1][t], dp[p][t-1]);
                }
            }

        }

        long ans = 0;
        for(int i=0; i<5; ++i){
            ans = Math.max(ans, dp[i][100000]);
        }

        System.out.println(ans);

    }
}