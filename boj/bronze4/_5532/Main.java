package bronze4._5532;

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
		int[] arr=new int[5];
		int kor, math;
		
		for(int i =0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		if(arr[1]%arr[3]!=0) {
			kor = (arr[1]/arr[3])+1;
		}else {
			kor = arr[1]/arr[3];//5
		}
		
		if(arr[2]%arr[4]!=0) {
			math = (arr[2]/arr[4])+1;
		}else {
			math = arr[2]/arr[4];
		}
		
		if(math>=kor) {
			sb.append(arr[0]-math);
		}else {
			sb.append(arr[0]-kor);
		}
		
		
		bw.write(sb.toString());
		bw.close();
	}
}
