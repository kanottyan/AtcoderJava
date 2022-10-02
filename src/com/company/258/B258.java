import java.util.Scanner;

class B258{
    public static void main(String[] args) {

        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int table[][] = new int[N][N];
        for(int i=0; i<N; ++i){
            String s = sc.next();
            for(int j=0; j<N; ++j){
                table[i][j] = s.charAt(j) - '0';
            }
        }

        long ans = 0;

        for(int i=0; i<N; ++i){
            for(int j=0; j<N; ++j){
                //the starting move 8 directions
                for(int dir=0; dir<8; ++dir){
                    // N times
                    int cur_i = i;
                    int cur_j = j;
                    long tmp = 0;
                    StringBuilder stmp = new StringBuilder();
                    stmp.append(table[cur_i][cur_j]);

                    for(int t=0; t<N-1; ++t){
                        cur_i += dx[dir];
                        cur_j += dy[dir];
                        if(cur_i < 0) cur_i += N;
                        if(cur_i >= N) cur_i %= N;
                        if(cur_j < 0) cur_j += N;
                        if(cur_j >= N) cur_j %= N;
                        stmp.append(table[cur_i][cur_j]);
                    }

                    tmp = Long.parseLong(stmp.toString());
                    if(tmp > ans){
                        ans = tmp;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}