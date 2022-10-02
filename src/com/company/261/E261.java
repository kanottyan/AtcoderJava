import java.util.Scanner;

class E261{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

//        int[] cumsum = new int[N+1];
//        cumsum[0] = 0;

        int ruiseki = 0;
        int first_operation = -1;
        int origigalN = N;

        while(N>0){
            int T = Integer.parseInt(sc.next());
            int A = Integer.parseInt(sc.next());
            int ans;
            if(origigalN == N){
                ruiseki = A;
                first_operation = A;
                N--;
                if( T == 1){
                    ans = C & A;
                }else if(T == 2){
                    ans = C | A;
                }else{
                    ans = C ^ A;
                }
                System.out.println(ans);

                if( ruiseki == 1){
                    ruiseki = ruiseki & A;
                }else if(T == 2){
                    ruiseki = ruiseki | A;
                }else{
                    ruiseki = ruiseki ^ A;
                }
            }else{
                N--;
                if( T == 1){
                    ruiseki = ruiseki & A;
                }else if(T == 2){
                    ruiseki = ruiseki | A;
                }else{
                    ruiseki = ruiseki ^ A;
                }

                if(first_operation == 1){
                    ans = C &ruiseki;
                }else if(first_operation == 2){
                    ans = C|ruiseki;
                }else{
                    ans = C^ruiseki;
                }

                System.out.println(ans);
            }
        }
    }

}