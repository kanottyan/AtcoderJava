import java.util.*;

class C246{
    public static void main(String[] args) {
        int N, K, X;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextInt();

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; ++i){
            pq.add(sc.nextInt());
        }

        while( K > 0 && !pq.isEmpty()){
            // get biggest
            int num = pq.poll();
            int cnt = Math.min(num/X, K);
            if(cnt == 0){
                cnt = 1;
                K -= cnt;
            }else{
                int left = num - cnt*X;
                K -= cnt;
                if(left > 0) pq.add(left);
            }
        }

        if(pq.isEmpty()){
            System.out.println(0);
        }else{
            long ans = 0;
            while(!pq.isEmpty()){
                ans += pq.poll();
            }
            System.out.println(ans);
        }

    }
}