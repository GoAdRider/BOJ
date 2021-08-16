package boj.bronze5._3046;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 두 숫자 R1과 R2가 있을 때, 두 수의 평균 S는 (R1+R2)/2와 같다. 
 상근이는 정인이 생일 선물로 두 숫자 R1과 R2를 주려고 한다. 
 생일 파티에서 상근이는 정인이에게 이 두 숫자를 말해주고, 정인이는 이 숫자를 받아 적는다. 
 그리고 나서 기쁜 마음으로 1년동안 이 숫자를 외우면서 산다.

상근이는 R1과 R2를 엄청난 고민 끝에 정했다.
작년에는 R1과 R2를 까먹어서 아무 숫자나 정해서 주었기 때문에, 
올해는 까먹지 않기 위해서 평균 S도 같이 기억하려고 한다.

오늘은 정인이 생일이다. 
5분 후에 상근이는 생일 선물로 두 숫자 R1과 R2를 말해주어야 하지만,
 안타깝게도 R2를 까먹고 말았다. 하지만 R1과 S는 기억하고 있다!

상근이를 도와 R2가 몇 인지 구하는 프로그램을 작성하시오.
 */

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R1 = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(2*S-R1));
		bw.flush(); 
		bw.close();
	}
}
