package bronze5._8370;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] plane = new int[4];
		
		for(int i=0;i<4;i++) {
			plane[i]=Integer.parseInt(st.nextToken());
		}
		
		bw.write(String.valueOf((plane[0]*plane[1])+(plane[2]*plane[3])));
		bw.flush(); 
		bw.close();
	}
}