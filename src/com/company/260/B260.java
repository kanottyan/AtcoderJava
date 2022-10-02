import java.util.*;

class B260{

    class ListComparator implements Comparator<List<Integer>> {
        public int compare(List<Integer> l1, List<Integer> l2)
        {
            if(l1.get(0) < l2.get(0)){
                return 1;
            }else if(l1.get(0) > l2.get(0)){
                return -1;
            }else{
                if(l1.get(1) < l2.get(1)){
                    return 1;
                }else {
                    return -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int NN= N;

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Boolean> passed = new ArrayList<>( Collections.nCopies (N, false) );
        for(int i=0; i<N; ++i){
            int a = sc.nextInt();
            A.add(a);
        }

        for(int i=0; i<N; ++i){
            int b = sc.nextInt();
            B.add(b);
        }

        B260 b= new B260();
        Queue<Integer> ans = new PriorityQueue<>();
        //math
        Queue<List<Integer>> pq = new PriorityQueue<>( b.new ListComparator() );
        for(int i=0; i<N; ++i){
            pq.add(Arrays.asList( A.get(i), NN-i) );
        }

        while(N > 0 && X > 0){
            N--;
            X--;
            List<Integer> student = pq.poll();
            int s_id = NN - student.get(1);
            passed.set( s_id, true );
            ans.add(s_id+1);
        }


        //English
        Queue<List<Integer>> pq2 = new PriorityQueue<>( b.new ListComparator() );
        for(int i=0; i<NN; ++i){
            if(passed.get(i)) continue;
            pq2.add(Arrays.asList( B.get(i), NN-i) );
        }

        while(N > 0 && Y > 0){
            N--;
            Y--;
            List<Integer> student = pq2.poll();
            int s_id = NN - student.get(1);
            passed.set( s_id, true );
            ans.add(s_id+1);
        }


        //tot
        Queue<List<Integer>> pq3 = new PriorityQueue<>( b.new ListComparator() );
        for(int i=0; i<NN; ++i){
            if(passed.get(i)) continue;
            pq3.add(Arrays.asList( A.get(i) + B.get(i), NN-i) );
        }

        while(N > 0 && Z > 0){
            N--;
            Z--;
            List<Integer> student = pq3.poll();
            int s_id = NN - student.get(1);
            passed.set( s_id, true );
            ans.add(s_id+1);
        }


        while(!ans.isEmpty()){
            System.out.println(ans.poll());
        }
    }
}