import java.util.Scanner;

class A257{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int i = (X+N-1)/N;

        char ans = (char)(i + 64 );

        System.out.println(ans);
    }
}