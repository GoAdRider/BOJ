package boj.bronze4._10101;

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
		int[] arr = new int[3];
		int sum=0;
		for(int i =0; i<3; i++) {
			sum+=(arr[i]=Integer.parseInt(br.readLine()));
		}
		
		
		if(sum!=180) {
			sb.append("Error");
		}else {
			if(arr[0]==arr[1]&& arr[1]==arr[2]) {
				sb.append("Equilateral");
			}else if(arr[0]!=arr[1]&& arr[1]!=arr[2] && arr[0] !=arr[2]) {
				sb.append("Scalene");
			}else {
				sb.append("Isosceles");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
