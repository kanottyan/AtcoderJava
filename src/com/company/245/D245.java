import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class D245{
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        for(int i=0; i<=N; ++i){
            A.add(sc.nextInt());
        }

        for(int i=0; i<=N+M; ++i){
            C.add(sc.nextInt());
        }

        int begining_idx = 0;
        while(A.get(begining_idx).equals(0)){
            begining_idx++;
        }

        // check B
        for(int i=0; i<=M; ++i){
            int b;
            b = C.get(begining_idx+i)/A.get(begining_idx);
            B.add(b);
            for(int j=0; j<A.size(); ++j){
                if(i+j > N+M) continue;
                C.set(i+j, C.get(i+j) - A.get(j)*b);
            }
        }
        B.forEach(System.out::println);
    }
}