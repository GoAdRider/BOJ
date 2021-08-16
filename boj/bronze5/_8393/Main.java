package boj.bronze5._8393;
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
		int til = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=til;i++) {
			sum+=i;
		}
		
		bw.write(String.valueOf(sum));
		bw.flush(); 
		bw.close();
	}
}
