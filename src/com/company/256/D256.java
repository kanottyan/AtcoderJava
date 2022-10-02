import javax.swing.text.html.parser.Entity;
import java.util.*;

class D256{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> m = new TreeMap<>();

        for(int i=0; i<N; ++i){
            int key = sc.nextInt();
            int val = sc.nextInt();
            if(m.containsKey(key)){
                if(val > m.get(key)){
                    m.put(key, val);
                }
            }else{
                m.put(key, val);
            }
        }

        int l = -1;
        int r = -1;

        for(Integer k : m.keySet()){
            if( l == -1 && r == -1 ){
                l = k;
                r = m.get(k);
            }else{
                // if bigger then new one;
                if(r < k){
                    System.out.println(l + " " + r);
                    l = k;
                    r = m.get(k);
                }else{
                    if(m.get(k) <= r) continue;
                    r = m.get(k);
                }
            }
        }

        System.out.println(l + " " + r);


    }
}