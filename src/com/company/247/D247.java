import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

class D247{
    public static void main(String[] args) {
        Deque<List<Integer>> q = new LinkedBlockingDeque<>();

        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        while(Q > 0){
            Q--;

            int qu = sc.nextInt();
            if(qu == 1){
                int x = sc.nextInt();
                int c = sc.nextInt();
                q.add(Arrays.asList(x, c));
            }else{
                int c = sc.nextInt();
                long ans = 0;

                while(c > 0){
                    List<Integer> l = q.poll();
                    int num = Math.min(c, l.get(1));
                    c -= num;
                    ans += ((long) num*(long)l.get(0));
                    if(c == 0 && l.get(1)- num >0 ){
                        l.set(1, l.get(1) - num);
                        q.addFirst(l);
                    }
                }
                System.out.println(ans);
            }
        }
    }
}