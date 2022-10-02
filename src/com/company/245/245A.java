import java.util.Scanner;

class A245 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if(c > a){
            System.out.println("Takahashi");
        }else if(c == a){
            if(d >= b){
                System.out.println("Takahashi");
            }else{
                System.out.println("Aoki");
            }
        }else{
            System.out.println("Aoki");
        }
    }
}