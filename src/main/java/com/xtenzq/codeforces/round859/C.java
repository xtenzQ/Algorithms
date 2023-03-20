package com.xtenzq.codeforces.round859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt();
        for (int i = 0; i < n; i++) {
            int l = fs.nextInt();
            String s = fs.next();
            boolean[] evenPos = new boolean[26];
            boolean[] oddPos = new boolean[26];
            for (int j = 0; j < l; j++) {
                if (j % 2 == 0) {
                    evenPos[s.charAt(j) - 'a'] = true;
                }
                else {
                    oddPos[s.charAt(j) - 'a'] = true;
                }
            }
            boolean isBinary = true;
            for (int j = 0; j < 26; j++) {
                // if same character occurs on even & odd position it can't be replaced
                if (evenPos[j] && oddPos[j]) {
                    isBinary = false;
                    break;
                }
            }
            out.println(isBinary ? "YES" : "NO");
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
