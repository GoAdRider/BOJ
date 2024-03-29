package bronze5._2845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 문제
	파티가 끝나고 나면, 사람들은 누가 파티에 왔는지와 얼마나 많은 사람들이 왔는지를 궁금해한다. 
	보통 파티는 매우 크게 열리기 때문에, 정확하게 몇 명이 참가했는지 알 수가 없다.
	
	지난주 토요일에 상근이는 자신의 3학년 진학을 기념하면서 매우 성대한 파티를 열었다. 
	그리고, 상근이는 1m2당 몇 명의 사람이 있었는지 알고있다.
	
	상근이의 파티는 정말 엄청난 규모였기 때문에, 대부분의 신문에도 기사가 실렸다. 
	상근이는 서로 다른 5개의 신문을 보면서 그 기사에 적혀져있는 참가자의 수를 적었다.
	
	상근이는 자신이 알고있는 참가자의 수가 정확하다고 생각한다. 
	각 신문 기사에 실려있는 참가자의 수가 몇 명 만큼 잘못되어있는지 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 1m2당 사람의 수 L (1 ≤ L ≤ 10)과 
	파티가 열렸던 곳의 넓이 P (1 ≤ P ≤ 1000)가 주어진다.
	
	둘째 줄에는 각 기사에 실려있는 참가자의 수가 주어진다. 
	106보다 작은 양의 정수 5개가 주어진다.
	
	출력
	출력은 첫째 줄에 다섯 개의 숫자를 출력해야 한다. 
	이 숫자는 상근이가 계산한 참가자의 수와  각 기사에 적혀있는 참가자의 수의 차이이다.
	
	------------------------------------------------
		예제 입력 1 
			5 20
			99 101 1000 0 97
		예제 출력 1 
			-1 1 900 -100 -3
	------------------------------------------------
 */
public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String args[]) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		//1m2 당 사람의 수
		int L = Integer.parseInt(st1.nextToken());
		// 1m2 당 사람의 수 * 파티가 열렸던 곳의 넓이
		int P = L * Integer.parseInt(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		while(st2.hasMoreTokens()) {
			int a = Integer.parseInt(st2.nextToken());
			bw.write(String.valueOf(a-P)+" ");
			bw.flush();
		}
		bw.close();
	}
}
