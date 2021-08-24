package bronze4._17388;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        MyScanner sc = new MyScanner();

        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();

        if(S+K+H>=100)
            out.print("OK");
        else    
            if(S<K && S<H)
                out.print("Soongsil");
            else if(K<S && K<H)
                out.print("Korea");
            else
                out.print("Hanyang");

        out.close();
    }

    // -----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    // -----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}