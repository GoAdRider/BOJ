package _16170;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;

public class Main {	
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	public static void main(String[] args) throws IOException { 
		LocalDateTime now = LocalDateTime.now();
		now.minusHours(9);
		
		bw.write(String.valueOf(now.getYear())+"\n");
		bw.write(String.valueOf(now.getMonthValue())+"\n");
		bw.write(String.valueOf(now.getDayOfMonth())+"\n");
		bw.close();
	}
}
