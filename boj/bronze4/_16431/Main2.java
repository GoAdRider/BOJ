package bronze4._16431;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        MyScanner sc = new MyScanner();

        int Br = sc.nextInt();
        int Bc = sc.nextInt();
        int Dr = sc.nextInt();
        int Dc = sc.nextInt();
        int Jr = sc.nextInt();
        int Jc = sc.nextInt();

        int BtoJ = Math.abs(Jc-Bc);
        int DtoJ = 0;

        BtoJ = BtoJ>=Math.abs(Jr-Br)? BtoJ:Math.abs(Jr-Br);
        DtoJ = Math.abs(Dc-Jc)+Math.abs(Dr-Jr);

        out.print(BtoJ>DtoJ?"daisy":BtoJ==DtoJ?"tie":"bessie");
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