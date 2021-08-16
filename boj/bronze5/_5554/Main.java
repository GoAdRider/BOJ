package boj.bronze5._5554;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int sum = 0;
		for(int i=0;i<4;i++) {
			sum+=Integer.parseInt(br.readLine());
		}
		bw.write(String.valueOf(sum/60+"\n"+sum%60));
		bw.flush(); 
		bw.close();
	}
}