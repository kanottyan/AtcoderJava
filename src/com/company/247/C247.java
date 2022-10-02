import java.util.Scanner;

class C247{

    public static void rec(int N){
        if(N == 1){
            System.out.println(1);
        }else{
            rec(N-1);
            System.out.println(N);
            rec(N-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        rec(N);
    }
}