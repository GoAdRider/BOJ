package boj.bronze5._20492;

/*
1. 전체 상금의 22%를 제세공과금으로 납부하는 경우
2. 상금의 80%를 필요 경비로 인정받고, 나머지 금액 중 22%만을 제세공과금으로 납부하는 경우

예제 입력---
10000000

예제 출력---
7800000 9560000


 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
	public static void main(String[] args) throws IOException { 
		int prize = Integer.parseInt(br.readLine());
		br.close();
		
		int fir_netPay = prize-(prize*22/100);
		
		int x = prize*20/100;
		int sec_netPay = (prize-x)+(x-(x*22/100));
		
		bw.write(String.valueOf(fir_netPay+" "+sec_netPay));
		bw.flush(); 
		bw.close();
	}
}
