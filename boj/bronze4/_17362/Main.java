package bronze4._17362;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        MyScanner sc = new MyScanner();

        long n = sc.nextLong()%8;    // 8진수 풀이 => 엄지는 시작점 즉 1 엄지까지 되돌아 오는데 8번 필요 

        if(n==1)
            out.print("1");
        else if(n==2 || n==0)
            out.print("2");
        else if(n==3 || n==7)
            out.print("3");
        else if(n==4 || n==6)
            out.print("4");
        else
            out.print("5");

        
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