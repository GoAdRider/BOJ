package boj.bronze4._5575;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws IOException{ 
		String[] ASarr = br.readLine().split(" ");
		String[] BSarr = br.readLine().split(" ");
		String[] CSarr = br.readLine().split(" ");
		
		int[] Aarr = new int[6];
		int[] Barr = new int[6];
		int[] Carr = new int[6];
		
		for(int i=0; i<6;i++) {
			Aarr[i] = Integer.parseInt(ASarr[i]);
			Barr[i] = Integer.parseInt(BSarr[i]);
			Carr[i] = Integer.parseInt(CSarr[i]);
		}
		
		sb.append(secSubtrac(Aarr)+"\n");
		sb.append(secSubtrac(Barr)+"\n");
		sb.append(secSubtrac(Carr));
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
			
	}
	
	static String secSubtrac(int arr[]) {
		int hour=arr[3]-arr[0];
		int min=arr[4]-arr[1];
		int sec=arr[5]-arr[2];
		
		if(sec<0) {
			min-=1;
			sec+=60;
		}
		
		if(min<0) {
			hour-=1;
			min+=60;
		}
		return hour+" "+min+" "+sec;
	}
}
