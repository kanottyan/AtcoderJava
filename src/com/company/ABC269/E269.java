package com.company.ABC269;

import java.util.Scanner;

public class E269 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = 1;
        int R = N;
        int U = 1;
        int D = N;

        //LR,
        while( L != R ){
            int M = (L+R)/2;

            System.out.println("? " + L + " " + M + " " + "1" + " " + N);
            System.out.flush();
            int res = sc.nextInt();
            if( (M-L) == res){
                R = M;
            }else{
                L = M+1;
            }
        }

        //LR,
        while( U != D ){
            int M = (U+D)/2;

            System.out.println("? " + "1" + " " + N + " " + U + " " + M);
            System.out.flush();
            int res = sc.nextInt();

            if( (M-U) == res){
                D = M;
            }else{
                U = M+1;
            }
        }

        System.out.println("!" + " " + L + " " + U);
        System.out.flush();
    }
}
