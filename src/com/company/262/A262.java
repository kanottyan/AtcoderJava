import java.util.Scanner;

class A262{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int residual = (Y % 4)-2;
        int ans;
        if(residual > 0){
            ans = Y + residual+2;
        }else if(residual < 0){
            ans = Y - residual;
        }else {
            ans = Y;
        }

        System.out.println(ans);


    }
}