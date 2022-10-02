import java.util.Scanner;

class B248{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        int ans = 0;

        while(B > A ){
            A *= K;
            ans++;
        }
        System.out.println(ans);
    }
}