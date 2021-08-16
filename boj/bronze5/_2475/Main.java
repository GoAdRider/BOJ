package boj.bronze5._2475;

import java.util.*;
import java.io.*;
/*
   문제
		컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다. 
		고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는
		검증수가 들어간다. 검증수는 고유번호의 처음 5자리에 들어가는 5개의 
		숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
		
		예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 
		0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
		
		입력
		첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
		
		출력
		첫째 줄에 검증수를 출력한다.
		------------------------------------------------
		예제 입력 1 
			0 4 2 5 6
			
		예제 출력 1 
			1
		------------------------------------------------
 */
public class Main {
	//콘솔에 출력해주기 위한 놈
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String args[]) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//br로 나오는건 다 스트링
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		for (int i = 0; i < 5; i++) { 
			//Math.pow = 제곱연산(정수,제곱수)
			sum += Math.pow(Integer.parseInt(st.nextToken()), 2); 
		} 
		//bw.write = System.out.println(String.valueOf(sum % 10)) 와 같음
		//허나 buffer를 사용하기에 더 빠름
		//String.valueOf = Object.toString 과 같음
		//valueOf 는 Null도 다 출력함. "NULL".equals() 로 비교해야함
		//toString보다 null 체크면에서 효율적임
		bw.write(String.valueOf(sum % 10));
		//남아있는 데이터를 모두 출력
		bw.flush(); 
		//스트림을 닫음
		bw.close();
		} 
}


