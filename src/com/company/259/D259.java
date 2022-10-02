import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class D259{
    static class DisjointSet{
        private int[] rank, root;
        private int n;

        public DisjointSet(int n) {
            this.n = n;
            this.rank = new int[n];
            this.root = new int[n];
            initroot();
        }

        private void initroot(){
            for(int i =0; i<n; ++i){
                root[i] = i;
            }
        }

        public int find(int x){
            if(root[x] != x){
                return root[x] = find(root[x]);
            }
            return root[x];
        }

        public void union(int x, int y){
            int xRoot = find(x);
            int yRoot = find(y);

            if(xRoot == yRoot){
                return;
            }

            if(rank[xRoot] < rank[yRoot]){
                root[xRoot] = yRoot;
            }else if(rank[xRoot] > rank[yRoot]){
                root[yRoot] = xRoot;
            }else{
                root[yRoot] = xRoot;
                rank[xRoot]++;
            }
        }

        public boolean isSame(int x, int y){
            return find(x) == find(y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        DisjointSet dj = new DisjointSet(N);
        long sx = sc.nextLong();
        long sy = sc.nextLong();
        long tx = sc.nextLong();
        long ty = sc.nextLong();

        List<List<Long>> circles = new ArrayList<>();

        for(int i =0; i<N; ++i){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long r = sc.nextLong();
            circles.add(Arrays.asList(x, y, r));
        }

        ArrayList<Integer> s_belong_to = new ArrayList<>();
        ArrayList<Integer> t_belong_to = new ArrayList<>();
        //check where the s belongs to
        for(int i =0; i<N; ++i){
            Long x = circles.get(i).get(0);
            Long y = circles.get(i).get(1);
            Long r = circles.get(i).get(2);

            if( (x-sx)*(x-sx)+(y-sy)*(y-sy) == r*r ){
                s_belong_to.add(i);
            }

            if( (x-tx)*(x-tx)+(y-ty)*(y-ty) == r*r ){
                t_belong_to.add(i);
            }
        }

        for(int i=0; i<N; ++i){
            for(int j=i+1; j<N; ++j ){
                long x1 = circles.get(i).get(0);
                long y1 = circles.get(i).get(1);
                long r1 = circles.get(i).get(2);

                long x2 = circles.get(j).get(0);
                long y2 = circles.get(j).get(1);
                long r2 = circles.get(j).get(2);

                long deltax =  Math.abs(x1 - x2);
                long deltay = Math.abs(y1 - y2);
                long c = deltax*deltax + deltay*deltay;

                if(c > (r1+r2)*(r1+r2) ) continue;
                if(c < (r1-r2)*(r1-r2) ) continue;
                dj.union(i, j);

            }
        }

        boolean flag = false;

        // check where t belongs to
        for(int i=0; i<s_belong_to.size(); ++i){
            for(int j=0; j<t_belong_to.size(); ++j){
                if(dj.isSame(s_belong_to.get(i), t_belong_to.get(j))){
                    flag = true;
                }
            }
        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}