package _17496;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
    	String input = br.readLine();
    	br.close();
    	StringTokenizer st = new StringTokenizer(input);
    	
    	int N = Integer.parseInt(st.nextToken());
    	int T = Integer.parseInt(st.nextToken());
    	int C = Integer.parseInt(st.nextToken());
    	int P =Integer.parseInt(st.nextToken());
    	
    	int total=
    			((N-1)/T)*(C*P);
    	
    	bw.write(String.valueOf(total));
    	bw.flush();
    	bw.close();
	}
}
