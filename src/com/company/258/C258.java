import java.util.Scanner;

class C258{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());

        String s = sc.next();
        int bidx = 0;
        int len = s.length();
        while(Q > 0){
            Q--;
            int type = sc.nextInt();
            if(type == 1){
                //swap x times;
                int x = Integer.parseInt(sc.next());
                x %= len;
                bidx = (bidx - x)%N;
                if(bidx < 0) bidx += N;
            }else{
                //get index x;
                int x = Integer.parseInt(sc.next());
                x--;
                int target = (x + bidx)%N;
                System.out.println(s.charAt(target));
            }
        }

    }
}