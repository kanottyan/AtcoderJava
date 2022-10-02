import java.util.Scanner;

class C260{
    public static long ans = 0;
    public static int N;
    public static int X;
    public static int Y;

    static void rec(int red_level, long red_num, int blue_level, long blue_num){
        if(red_level <= 1 && blue_level <= 1){
            ans = blue_num;
        }

        // Change red
        if(red_level >= blue_level){
            if(red_level > 1){
                rec(red_level-1, red_num, blue_level, blue_num+red_num*X);
            }
        }else if(red_level < blue_level) {
            if(blue_level > 1){
                rec(red_level, blue_num+red_num, blue_level-1, blue_num*Y);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        rec(N, 1, N, 0);

        System.out.println(ans);
    }
}