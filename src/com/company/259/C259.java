import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class C259{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        int sidx = 1;
        int tidx = 1;

        int s_prev_char = S.charAt(0);
        int t_prev_char = T.charAt(0);

        int s_prev_cnt = 1;
        int t_prev_cnt = 1;

        boolean flag = true;

        while(sidx < S.length() ){
            if(S.charAt(sidx) == s_prev_char){
                s_prev_cnt++;
                sidx++;
            }else{
                while(tidx < T.length()){
                    if(T.charAt(tidx) == t_prev_char){
                        t_prev_cnt++;
                        tidx++;
                    }else {
                        //check
                        if(s_prev_char != t_prev_char){
                            flag = false;
                            break;
                        }

                        if( s_prev_cnt > t_prev_cnt ){
                            flag = false;
                            break;
                        }

                        if(s_prev_cnt == 1 && t_prev_cnt > 1){
                            flag = false;
                            break;
                        }

                        t_prev_char = T.charAt(tidx);
                        t_prev_cnt = 1;
                        tidx++;
                        break;
                    }
                }
                s_prev_char = S.charAt(sidx);
                s_prev_cnt = 1;
                sidx++;
            }
        }

        while(tidx < T.length()) {
            if (T.charAt(tidx) != t_prev_char) {
                flag = false;
                break;
            } else {
                tidx++;
                t_prev_cnt++;
            }
        }

        // last check
        if(s_prev_char != t_prev_char) flag = false;
        if(s_prev_cnt > t_prev_cnt) flag = false;
        if(s_prev_cnt == 1 && t_prev_cnt > 1) flag = false;

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }
}