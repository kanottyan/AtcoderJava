import java.util.*;

class C245{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K;
        N = sc.nextInt();
        K = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        for(int i=0; i<N; ++i){
            A.add(sc.nextInt());
        }

        for(int i=0; i<N; ++i){
            B.add(sc.nextInt());
        }

        Queue<List<Integer>> q = new ArrayDeque<>();
        q.add(Arrays.asList(0, 0));
        q.add(Arrays.asList(1, 0));

        boolean[][] visited = new boolean[2][N];
        while(!q.isEmpty()){
            int i = q.peek().get(0);
            int j = q.peek().get(1);
            q.poll();
            if(visited[i][j]) continue;
            visited[i][j] = true;

            if(j == N-1) continue;;
            int cur;
            if(i == 0){
                cur = A.get(j);
            }else {
                cur = B.get(j);
            }

            int n1 = A.get(j+1);
            int n2 = B.get(j+1);
            if(Math.abs(n1 - cur) <= K){
                q.add(Arrays.asList(0, j+1));
            }

            if(Math.abs(n2 - cur) <= K){
                q.add(Arrays.asList(1, j+1));
            }
        }

        if(visited[0][N-1] == true || visited[1][N-1] == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}