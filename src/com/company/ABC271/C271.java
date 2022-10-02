package com.company.ABC271;

import java.util.*;

public class C271 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        Set<Integer> hs = new TreeSet<>();
        List<Integer> l;

        N = sc.nextInt();
        int dupeCnt = 0;

        for(int i=0; i<N; ++i){
            int a = Integer.parseInt(sc.next());
            if(hs.contains(a)){
                dupeCnt++;
            }else {
                hs.add(a);
            }
        }

        l = new ArrayList<>(hs);

        int penelty = 0;
        int availableBooks = dupeCnt/2;
        int rest = dupeCnt %2;
        int bookTiles = 0;
        int bookIdx = -1;

        while(hs.contains(bookTiles+1)){
            bookTiles++;
            bookIdx++;
        }
        while( availableBooks > 0 ){
            if(hs.contains(bookTiles+1)){
                bookTiles++;
                bookIdx++;
            }else {
                availableBooks--;
                bookTiles++;
            }
        }

        int n = 2;
        if(rest == 1){n = 1;}

        while(true){
            if(hs.contains(bookTiles+1)){
                if( bookIdx+1 <= hs.size()-1-penelty ){
                    bookTiles++;
                    bookIdx++;
                }else {
                    break;
                }
            }else{
                if(rest == 1){
                    penelty = 1;
                    rest = 0;

                    if(bookIdx <= hs.size()-1-penelty){
                        bookTiles++;
                    }else {
                        break;
                    }
                }else {
                    penelty+=2;
                    if(bookIdx <= hs.size()-1-penelty){
                        bookTiles++;
                    }else {
                        break;
                    }
                }

            }
        }
        System.out.println(bookTiles);
    }
}
