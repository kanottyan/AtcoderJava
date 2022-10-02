import java.util.*;

class C257 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = sc.next();
            List<Integer> w = new ArrayList<>();
            for(int i=0; i<n; i++) {
                w.add(sc.nextInt());
            }
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i=0; i<n; i++) {
                if(s.charAt(i) == '0') {
                    map.put(w.get(i)+1, map.getOrDefault(w.get(i)+1, 0) + 1);
                } else {
                    map.put(w.get(i)+1, map.getOrDefault(w.get(i)+1, 0) - 1);
                    map.put(0, map.getOrDefault(0, 0) + 1);
                }
            }
            Iterator<Integer> it = map.keySet().iterator();
            int sum = 0;
            int max = 0;
            while(it.hasNext()) {
                max = Math.max(max, sum += map.get(it.next()));
            }
            System.out.println(max);
        }
    }
}