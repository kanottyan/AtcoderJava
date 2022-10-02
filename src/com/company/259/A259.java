import java.util.Scanner;

class A259{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int D = sc.nextInt();

        if( X <= M){
            System.out.println(T);
        }else {
            System.out.println(T - (X-M)*D );
        }

    }
}