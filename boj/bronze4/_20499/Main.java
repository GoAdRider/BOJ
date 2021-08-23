package bronze4._20499;


import java.io.*;
import java.util.*;

 
public class Main{
    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        MyScanner sc = new MyScanner();
        
        int k = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();

        if(k+a<d)
            out.println("hasu");
        else if(d==0)
            out.println("hasu");
        else
            out.println("gosu");
        
        out.close();
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
      
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine(),"/");
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
 
        String nextLine(){
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