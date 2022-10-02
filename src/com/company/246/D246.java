import java.util.Scanner;

class D246{

    public static long calc(long a, long b){
        //return (a+b)*(a+b)*(a+b)-2*a*b*(a+b);
        return (a+b)*(a*a+b*b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long a = 0;
        long b = 0;
        long res = 0;
        long ans = Long.MAX_VALUE;
        while(res < N){
            a++;
            res = calc(a, b);
        }

        while(b <= a){
            res = calc(a, b);
            if(res >= N){
                ans = Math.min(ans, res);
                a--;
            }else{
                b++;
            }
        }

        if(ans == Long.MAX_VALUE) ans = 0;

        System.out.println(ans);

    }
}