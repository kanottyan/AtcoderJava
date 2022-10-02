import java.util.*;

class D248{

    public static List<Integer> a;
    public static int N;


    public static Integer query(int a, int b, int target, int cur, List<Integer> tree, int n){
        if(cur > N){
            int scope = cur - (n-1);
            if( a <= scope && scope <= b ){
                if(target == tree.get(cur)){
                    return 1;
                }else{
                    return 0;
                }
            }
        }else{
            int l = query(a, b, target, 2*cur+1,tree, n);
            int r = query(a, b, target, 2*cur+2,tree, n);
            return l+r;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new ArrayList<>(N);
        for(int i=0; i<N; ++i){
            a.add(sc.nextInt());
        }

        int Q = sc.nextInt();
        //construct a data structure for tree
        int n = 1;
        while(n < N){
            n *= 2;
        }

        List<Integer> tree = new ArrayList<>(Collections.nCopies(2*n-1, 0));
        for(int i=0; i<N; ++i){
            int tree_i = i+n-1;
            tree.set(tree_i, a.get(i));
        }


        while(Q > 0){
            Q--;
            int L = sc.nextInt()-1;
            int R = sc.nextInt()-1;
            int X = sc.nextInt();

            System.out.println(query(L, R, X, 0, tree, n));
        }
    }
}