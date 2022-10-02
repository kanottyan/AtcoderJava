package com.company.ABC271;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.out;

public class C271two {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            HashSet<Integer> a = new HashSet<>(N);
            for (int i = 0;i < N;++ i) a.add(sc.nextInt());
            for (int read = 1;N >= 0;++ read) {
                N -= a.contains(read) ? 1 : 2; // その巻を読むために使う本の冊数
                if (N < 0) out.println(read - 1); // 本が無くなったら、無くなる直前の冊数を出力
            }
        }
    }
}

