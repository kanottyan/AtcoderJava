import java.util.*;

class E {

//    public final static int MOD = 952504739;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Integer N = sc.nextInt();
//        Integer M = sc.nextInt();
//        Integer K = sc.nextInt();
//        Integer S = sc.nextInt();
//        Integer T = sc.nextInt();
//        Integer X = sc.nextInt();
//
//        S--;
//        T--;
//
//        List<List<Integer>> graph = new ArrayList<>();
//        for(int i=0; i<N; ++i){
//            graph.add(new ArrayList<>());
//        }
//
//        DisjointSet dsj = new DisjointSet(N);
//        for(int i=0; i<M; ++i){
//            Integer U = sc.nextInt();
//            Integer V = sc.nextInt();
//            U--;
//            V--;
//            graph.get(U).add(V);
//            graph.get(V).add(U);
//            dsj.union(U, V);
//        }
//
//        if(!dsj.isSame(S, T)){
//            System.out.println(0);
//            return;
//        }
//
//        int ans = 0;
//
//        List<List<Integer>> tmp = new ArrayList<>();
//        for(int i=0; i<N; ++i){
//            tmp.add(new ArrayList<>());
//        }
//
//        Iterator<List<Integer>> itr = graph.iterator();
//
//        for(int i=0; i<N; ++i){
//            for(int j=0; j<graph.get(i).size(); ++j){
//                tmp.get(i).add(graph.get(i).get(j));
//            }
//        }
//
//        List<List<Integer>> tmp2 = new ArrayList<>( graph );
//
//        List<List<Integer>> tmp3 = graph;
//
//        System.out.println("test");
//
//    }
}