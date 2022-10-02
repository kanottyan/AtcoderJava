import java.util.Scanner;

class B245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] arr = new boolean[2002];

        for(int i=0; i<N; ++i){
            arr[sc.nextInt()] = true;
        }

        for(int i=0; i<2001; ++i){
            if(arr[i]) continue;

            System.out.println(i);
            break;
        }
    }
}