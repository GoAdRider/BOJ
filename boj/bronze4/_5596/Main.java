package _5596;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
	public static void main(String[] args) throws IOException { 
		String str = "";
		int total=0;
		
		while((str=br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(str," ");
			int sum = 0;
			
			for(int i=0; i<4;i++) {
				sum+=Integer.parseInt(st.nextToken());
			}
			total = total>=sum?
					total:sum;
		}
		sb.append(total);
		System.out.println(sb);
	}
}
