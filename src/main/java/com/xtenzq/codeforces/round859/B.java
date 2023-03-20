package com.xtenzq.codeforces.round859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = fs.nextInt();
        for (int i = 0; i < t; i++) {
            int n = fs.nextInt();
            int[] a = fs.readArray(n);
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] % 2 == 0) {
                    c += a[j];
                }
                else {
                    c -= a[j];
                }
            }
            System.out.println(c > 0 ? "YES" : "NO");
        }
        out.close();
    }

    static class FastScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer("");

        String next() {
            while (!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            String st = null;
            try {
                st = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return st;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
