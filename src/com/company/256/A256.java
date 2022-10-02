import java.util.Scanner;

class A256{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 1 << N;
        System.out.println(res);
    }
}