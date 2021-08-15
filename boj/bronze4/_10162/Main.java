package _10162;

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
		int T = Integer.parseInt(br.readLine());
		int hour = 0;
		int min=0;
		int sec=0;
		
		if(T%10 !=0) {
			sb.append("-1");
		}else {
			hour =T/300;
			T-=300*hour;
			sb.append(hour).append(" ");
			min=T/60;
			T-=60*min;
			sb.append(min).append(" ");
			sec=T/10;
			sb.append(sec);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
