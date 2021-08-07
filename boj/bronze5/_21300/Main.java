package _21300;

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		while(st.hasMoreTokens()) {
			sum+=Integer.parseInt(st.nextToken());
		}
		
		bw.write(String.valueOf(sum*5));
		bw.flush();
		bw.close();
	}
}
