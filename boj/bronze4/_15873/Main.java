package bronze4._15873;

import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        MyScanner sc = new MyScanner();
        
        String str = sc.nextLine();
        int answer = 0;

        if(str.length()==3){
            switch (str.charAt(1)) {
                case '0':
                    answer = 10+Character.getNumericValue(str.charAt(2));
                    break;
                case '1':
                    answer = 10+Character.getNumericValue(str.charAt(0));
                    break;
                default:
                    break;
            }
        }else if(str.length()==2){
            answer = Character.getNumericValue(str.charAt(0))+Character.getNumericValue(str.charAt(1));
        }else{
            answer=10+10;
        }

        out.println(answer);
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