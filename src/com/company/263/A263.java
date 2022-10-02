import java.util.Scanner;

class A263{

    public static void main(String[] args) {
        int[] arr = new int[13];
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        A--;
        int B = sc.nextInt();
        B--;
        int C = sc.nextInt();
        C--;
        int D = sc.nextInt();
        D--;
        int E = sc.nextInt();
        E--;

        arr[A]++;
        arr[B]++;
        arr[C]++;
        arr[D]++;
        arr[E]++;

        int zero =0;
        int two =0;
        int three = 0;

        for(int i=0; i<13; ++i){
            if(arr[i] == 0){
                zero++;
            }else if(arr[i] == 2){
                two++;
            }else if(arr[i] == 3){
                three++;
            }
        }

        if(zero == 11 && two == 1 && three == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}