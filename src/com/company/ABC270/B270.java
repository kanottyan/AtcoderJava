package com.company.ABC270;

import java.util.Scanner;

public class B270 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int ans = 0;
        if( X < 0){
            X *= -1;
            Y *= -1;
            Z *= -1;
        }

        // goal in the right
        if(X > 0){
            if(Y <0 || X < Y){
                ans = X;
                System.out.println(ans);
                return;
            }else{
                if(Y < Z){
                    ans = -1;
                    System.out.println(ans);
                    return;
                }else{
                    if(Z < 0){
                        ans -= 2*Z;
                        ans += X;
                        System.out.println(ans);
                        return;
                    }else {
                        ans = X;
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
        return;
    }
}
