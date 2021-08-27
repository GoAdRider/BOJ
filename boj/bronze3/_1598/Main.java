package bronze3._1598;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())-1;
        int ax = a/4;
        int ay = a%4;
        int b = Integer.parseInt(st.nextToken())-1;
        int bx = b/4;
        int by = b%4;
        System.out.println(Math.abs(bx-ax)+Math.abs(by-ay));
    }
}
