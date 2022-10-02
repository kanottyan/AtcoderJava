import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        for(int i=1; i<=2*N+1; ++i){
            s.add(i);
        }

        while(s.size() > 0){
            int n = s.iterator().next();
            System.out.println(n);
            s.remove(n);

            int rec = sc.nextInt();
            if(rec == 0){
                System.exit(0);
            }
            s.remove(rec);
        }
    }
}