package _1297;

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
		int c = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		double result = Math.pow(c, 2) / (Math.pow(a, 2) + Math.pow(b, 2));
		
		
		bw.write(String.valueOf((int)Math.sqrt(result * Math.pow(a, 2)) + " " + (int)Math.sqrt(result * Math.pow(b, 2))));
		bw.flush(); 
		bw.close();
	}
	
}
