package bronze4._16199;

import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        MyScanner sc = new MyScanner();
        
        int[] birth = new int[3];
        int[] today = new int[3];

        for(int i=0;i<3;i++){
            birth[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            today[i]=sc.nextInt();
        }

        int old = today[0]-birth[0];

        if(today[1]<birth[1]){
            old-=1;
        }else if(today[1]==birth[1]){
            if(today[2]<birth[2]){
                old-=1;
            }
        }

        int senun = today[0]-birth[0];

        out.println(old+"\n"+(senun+1)+"\n"+senun);
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