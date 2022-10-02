import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class C261{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> m = new HashMap<>();

        while(N > 0){
            N--;
            String S = sc.next();
            int cnt = m.getOrDefault(S, 0);
            if(cnt == 0){
                System.out.println(S);
            }else {
                System.out.println(S + "(" + cnt + ")");
            }

            m.put(S, m.getOrDefault(S, 0)+1);
        }


    }
}