package com.company.ABC271;

import java.util.*;
import java.util.ArrayList;

public class B271 {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

       for(int i=0; i<N; ++i){
           a.add(new ArrayList<>());
       }

        for(int i=0; i<N; ++i){
            int L = Integer.parseInt(sc.next                                   ());
            for(int j=0; j<L; ++j){
                a.get(i).add(Integer.parseInt(sc.next()));
            }
        }

        for(int i=0; i<Q; ++i){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            s--;
            t--;

            System.out.println(a.get(s).get(t));
        }

    }
}
