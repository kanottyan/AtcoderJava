import java.util.Scanner;

class B266{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N = sc.nextLong();
        long mod = 998244353;

        long ans = 0;
        long amari = N%mod;
        if(amari > 0){
            ans = amari;
        }else {
            ans = mod + amari;
        }

        if(ans == 998244353) ans = 0;

        System.out.println(ans);
    }
}