import java.util.Scanner;

class A261{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L1 = sc.nextInt();
        int R1 = sc.nextInt();
        int L2 = sc.nextInt();
        int R2 = sc.nextInt();

        int ans = 0;
        if(L1 < L2){
            ans = Math.min(R1, R2) - L2;
            if(ans < 0) ans = 0;
        }else if(L1 > L2){
            ans = Math.min(R1, R2) - L1;
            if(ans < 0) ans = 0;
        }else{
            ans = Math.min(R1, R2) - L1;
            if(ans < 0) ans = 0;
        }

        System.out.println(ans);
    }
}