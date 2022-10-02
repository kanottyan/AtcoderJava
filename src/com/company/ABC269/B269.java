package com.company.ABC269;

import java.util.Scanner;

public class B269 {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        boolean found_first = false;

        int A = -1; int B=-1; int C = -1; int D = -1;

        char[][] table = new char[10][10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; ++i){
            String s = sc.next();
            for(int j=0; j<10; ++j){
                char c = s.charAt(j);
                table[i][j] = c;
            }
        }

        for(int i=0; i<10; ++i){
            for(int j=0; j<10; ++j){
                if(table[i][j] == '#'){
                    if(found_first == false){
                        A = i;
                        B = i;
                        C = j;
                        D = j;
                        found_first = true;
                    }
                    B = i;
                    D = j;
                }
            }
        }
        A++;
        B++;
        C++;
        D++;

        System.out.println(A + " " + B);
        System.out.println(C + " " + D);
    }
}
