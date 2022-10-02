import java.util.*;
import java.util.Scanner;

class C264{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H1 = sc.nextInt();
        int W1 = sc.nextInt();
        int[][] A = new int[H1][W1];
        for(int i=0; i<H1; ++i){
            for(int j=0; j<W1; ++j){
                A[i][j] = sc.nextInt();
            }
        }

        int H2 = sc.nextInt();
        int W2 = sc.nextInt();
        int[][] B = new int[H2][W2];

        for(int i=0; i<H2; ++i){
            for(int j=0; j<W2; ++j){
                B[i][j] = sc.nextInt();
            }
        }

        boolean flag = false;

        for(int hbit=0; hbit<(1<<H1); ++hbit){
            for(int wbit=0; wbit<(1<<W1); ++wbit){
                List<List<Integer>> actual = new ArrayList<>();
                boolean is_first = true;
                List<Integer> w = null;

                for(int i=0; i< H1; ++i){
                    if((hbit & (1<<i)) >= 1){
                        if(is_first == true){
                            is_first = false;
                            w = new ArrayList<>();
                        }
                        for(int j=0; j<W1; ++j){
                            if( (wbit & (1<<j)) >= 1 ){
                                w.add(A[i][j]);
                            }
                        }
                    }
                    is_first = true;
                    if(w != null) actual.add(w);
                    w=null;
                }
                if(actual.size() == 0) continue;
                if(actual.size() == H2 && actual.get(0).size() == W2){
                    boolean flag2 = true;
                    for(int i=0; i<H2; ++i){
                        for(int j=0; j<W2; ++j){
                            if(actual.get(i).get(j) != B[i][j]){
                                flag2 = false;
                            }
                        }
                    }
                    if(flag2) flag = true;
                }
            }
        }

        if(flag){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}