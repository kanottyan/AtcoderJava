package com.company.ABC271;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class D271 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        // dp[i][j][K] we consider the i-th card, j=0 use head it, j=1 use tail. can make the number k or not.
        boolean[][][] dp = new boolean[N][2][10010];
        int a = sc.nextInt(); int b = sc.nextInt();
        dp[0][0][a] = true;
        dp[0][1][b] = true;
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.get(0).add(a);
        l.get(0).add(b);

        for(int i=1; i<N; ++i){
            l.add(new ArrayList<>());
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            l.get(i).add(a);
            l.get(i).add(b);
            for(int j=0; j<=10000; ++j){
                if(a + j <= 10000){
                    dp[i][0][j+a] |= dp[i-1][0][j];
                    dp[i][0][j+a] |= dp[i-1][1][j];
                }
                if(b + j <= 10000){
                    dp[i][1][j+b] |= dp[i-1][1][j];
                    dp[i][1][j+b] |= dp[i-1][0][j];
                }
            }
        }

        int line = -1;
        int ht = 0;
        if(dp[N-1][0][S]){
            line = N-1;
        }

        if(dp[N-1][1][S]){
            line = N-1;
        }


        if(line == -1){
            System.out.println("No");
        }else {
            System.out.println("Yes");
            Stack<String> s = new Stack<>();

            int cur = S;
            while(line >= 0){
                if( dp[line][0][cur] ){
                    ht = 0;
                }else{
                    ht = 1;
                }
                cur -= l.get(line).get(ht);
                if(ht == 0){
                    s.push("H");
                }else{
                    s.push("T");
                }

                line--;
            }
            while(!s.empty()){
                System.out.print(s.pop());
            }
        }

    }
}
