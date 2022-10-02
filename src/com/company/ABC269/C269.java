package com.company.ABC269;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class C269 {
    public static void main(String[] args) {
        long X;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        X = sc.nextLong();
        for(long i=0; i<60; ++i){
            if( ((X >> i)&1L) == 1L) {
                cnt++;
                l.add((int)i);
            }
        }

        int tot = 1;
        for(int i=0; i<cnt; ++i) tot *=2;
        long[] pow = new long[62];
        pow[0] = 1;
        for(int i=0; i<61; ++i){
            pow[i+1] = pow[i] * 2;
        }

        for(int i=0; i<tot; ++i){
            long ans = 0;
            for(int bitshift = 0; bitshift < cnt; ++bitshift){
                if( ((i >> bitshift)&1L) == 1L){
                    ans += pow[l.get(bitshift)];
                }
            }
            System.out.println(ans);
        }
    }
}
