package bronze4._15726;

import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
      
        // Start writing your solution here. -------------------------------------
   
        /*
        int n      = sc.nextInt();        // read input as integer
        long k     = sc.nextLong();       // read input as long
        double d   = sc.nextDouble();     // read input as double
        String str = sc.next();           // read input as String
        String s   = sc.nextLine();       // read whole line as String
        int result = 3*n;
        out.println(result);                    // print via PrintWriter
        */

        // Stop writing your solution here. -------------------------------------

        double[] arr = new double[3];
        for(int i=0; i<3;i++){
            arr[i] = sc.nextInt();
        }

        double max = arr[0]*arr[1]/arr[2];

        max = max<arr[0]/arr[1]*arr[2]?
            arr[0]/arr[1]*arr[2]:max;
        out.println((int)max);
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