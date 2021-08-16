package boj.bronze4._5543;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws IOException{ 
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		sb.append(minPrice(arr));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	static int minPrice(int[] arr) {
		
		int min=arr[0];
		for(int i=1;i<3;i++) {//버거만 최소 값 계산
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		min = arr[3]<=arr[4]? //음료수 최소 값 비교
				min+arr[3]:min+arr[4];
		
		return min-50;
	}
}