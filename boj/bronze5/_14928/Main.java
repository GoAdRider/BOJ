package _14928;

/*
 제연이는 그의 생일(2000년 3월 3일)을 기념해 자신이 가장 좋아하는 수를 
 20000303으로 나눈 나머지를 구해 그 수만큼 잠을 자기로 했다. 
 제연이가 얼마나 잠을 잘 수 있을지 구하자.
 
 입력---
 첫째 줄에 제연이가 가장 좋아하는 수 N이 주어진다. (N ≤ 10^1,000,000)
 
 출력---
 N을 20000303으로 나눈 나머지를 출력한다.
 
 
 입력예제1---
 20000303200003032000030320000303200003032000030320000303200003032000030320000303

 출력예제1---
 0
 
 입력예제2---
123456789123456789123456789123456789123456789123456789123456789123456789

 출력예제2---
 1313652
 
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
    	String input = br.readLine();
    	br.close();
    	
    	int now = 0;
    	int mod = 20000303;
    	
    	// now 의 최대 자릿 수 9자리
    	// mod 의 자릿 수 8자리
    	for(int i=0;i<input.length();i++) {
    		int v = input.charAt(i)-'0';
    		now*=10;
    		now=now+v;
    		now%=mod;
    	}
    	
    	bw.write(String.valueOf(now));
    	bw.flush();
    	bw.close();
	}
}
