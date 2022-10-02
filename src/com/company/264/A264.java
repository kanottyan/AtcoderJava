import java.util.Scanner;

class A264{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        L--;
        int R = sc.nextInt();

        String ans = "atcoder".substring(L, R);

        System.out.println(ans);
    }
}