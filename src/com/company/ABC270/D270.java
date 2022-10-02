package com.company.ABC270;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class D270 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<K; ++i){
            int a = Integer.parseInt(sc.next());
            pq.add(a);
        }

        int takahashi = 0;
        int aoki = 0;
        boolean turn = true;

        while(!pq.isEmpty()){

            if(turn){
                if(pq.peek() < N ){
                    N -= pq.peek();
                    takahashi += pq.peek();
                }else {
                    while( !pq.isEmpty() && pq.peek() > N ){
                        pq.poll();
                    }
                    if(!pq.isEmpty()){
                        int n = pq.peek();
                        takahashi += n;
                        N -= n;
                    }else {
                        break;
                    }
                }
            }else{
                if(pq.peek() < N ){
                    N -= pq.peek();
                    aoki += pq.peek();
                }else {
                    while( !pq.isEmpty() && pq.peek() > N ){
                        pq.poll();
                    }
                    if(!pq.isEmpty()){
                        int n = pq.peek();
                        aoki += pq.peek();
                        N -=n;
                    }else {
                        break;
                    }
                }
            }

            if(turn){
                turn = false;
            }else {
                turn = true;
            }

        }
        System.out.println(takahashi);
    }

}
