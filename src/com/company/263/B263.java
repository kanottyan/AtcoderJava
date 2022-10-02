import java.util.Scanner;

class B263{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N-1];
        int tail = N-2;

        for(int i=0; i<N-1; ++i){
            int p = sc.nextInt();
            p--;
            P[i] = p;
        }

        int cur = tail;
        int cnt = 1;

        while(cur != 0){
            cur = P[cur];
            if(cur != 0){
                cur--;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}