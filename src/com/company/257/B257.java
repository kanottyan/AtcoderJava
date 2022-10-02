import java.util.Scanner;

class B257{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();

        boolean[] komas = new boolean[N];
        for(int i=0; i<K; ++i){
            int a = sc.nextInt();
            a--;
            komas[a] = true;
        }

        for(int i=0; i<Q; ++i){
            int l = sc.nextInt();
            int cnt = 0;
            for(int j=0; j<N; ++j){
                if(komas[j] == false) continue;
                cnt++;
                if(cnt == l){
                    // check can move next or not
                    if(j+1 <N && komas[j+1] == false){
                        komas[j+1] = true;
                        komas[j] = false;
                        break;
                    }else{
                        break;
                    }
                }
            }
        }
        for(int i=0; i<N; ++i){
            if(komas[i] == true){
                System.out.println(i+1);
            }
        }

    }
}