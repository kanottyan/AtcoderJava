import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

class C268{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> p = new ArrayList<>();

        int N = sc.nextInt();
        for(int i=0; i<N; ++i){
            p.add(sc.nextInt());
        }

        int[] dist = new int[N];

        for(int i=0; i<N; ++i){
            int res = p.get(i) - i;
            if(res < 0) res += N;
            dist[res]++;
        }

        int ans = 0;

        for(int i=0; i<N; ++i){
            int pre = i-1;
            if(pre <0) pre += N;
            int next = i+1;
            if(next >= N) next -= N;

            ans = Math.max(ans, dist[pre] + dist[i] + dist[next]);
        }

        System.out.println(ans);

    }
}