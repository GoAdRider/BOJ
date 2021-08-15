package _10179;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
	public static void main(String[] args) throws IOException { 
		int til=Integer.parseInt(br.readLine());
		for(int i=0;i<til;i++) {
			double num =Double.parseDouble(br.readLine())*(0.8);
			String str= String.format("%.3f", num);
			int index = str.lastIndexOf(".");
			sb.append("$"+str.substring(0,index+3));
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
