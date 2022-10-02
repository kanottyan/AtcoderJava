import java.util.Scanner;

class D264{
    static void swap(StringBuilder sb, int idx1, int idx2){
        char c1 = sb.charAt(idx1);
        char c2 = sb.charAt(idx2);
        sb.setCharAt(idx1, c2);
        sb.setCharAt(idx2, c1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder sb = new StringBuilder(S);

        int swapCnt = 0;

        if(sb.charAt(0) != 'a'){
            int a_idx = sb.indexOf("a");
            for(int i = a_idx; i>0; --i){
                swap(sb, i, i-1);
                swapCnt++;
            }
        }

        if(sb.charAt(1) != 't'){
            int t_idx = sb.indexOf("t");
            for(int i = t_idx; i>1; --i){
                swap(sb, i, i-1);
                swapCnt++;
            }
        }

        if(sb.charAt(2) != 'c'){
            int c_idx = sb.indexOf("c");
            for(int i = c_idx; i>2; --i){
                swap(sb, i, i-1);
                swapCnt++;
            }
        }
        if(sb.charAt(3) != 'o'){
            int o_idx = sb.indexOf("o");
            for(int i = o_idx; i>3; --i){
                swap(sb, i, i-1);
                swapCnt++;
            }

        }
        if(sb.charAt(4) != 'd'){
            int d_idx = sb.indexOf("d");
            for(int i = d_idx; i>4; --i){
                swap(sb, i, i-1);
                swapCnt++;
            }

        }
        if(sb.charAt(5) != 'e'){
            int e_idx = sb.indexOf("e");
            for(int i = e_idx; i>5; --i){
                swap(sb, i, i-1);
                swapCnt++;
            }
        }

        System.out.println(swapCnt);
    }
}