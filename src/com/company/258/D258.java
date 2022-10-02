import java.util.Scanner;

class D258{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        //idx of game taking by (first time, going forward)
        int score[][] = new int[N][2];

        for(int i=0; i<N; ++i){
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());

            score[i][0] = A+B;
            score[i][1] = B;
        }

        long tot_cumsum = 0;
        long minimum = Long.MAX_VALUE;
        long ans = Long.MAX_VALUE;

        for(int i=0; i<N; ++i){
            long tmp = 0;
            tot_cumsum += score[i][0];
            minimum = Math.min(minimum, score[i][1]);
            int remain = X-(i+1);

            tmp = tot_cumsum + minimum*remain;
            ans = Math.min(ans, tmp);
        }

        System.out.println(ans);

    }
}