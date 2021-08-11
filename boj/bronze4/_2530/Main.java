package _2530;

/*
입력
첫째 줄에는 현재 시각이 나온다. 
현재 시각은 시 A (0 ≤ A ≤ 23), 분 B (0 ≤ B ≤ 59)와 초 C (0 ≤ C ≤ 59)가 
정수로 빈칸을 사이에 두고 순서대로 주어진다. 
두 번째 줄에는 요리하는 데 필요한 시간 D (0 ≤ D ≤ 500,000)가 초 단위로 주어진다.

출력
첫째 줄에 종료되는 시각의 시, 분, 초을 공백을 사이에 두고 출력한다. 
(단, 시는 0부터 23까지의 정수이며, 분, 초는 0부터 59까지의 정수이다. 
디지털 시계는 23시 59분 59초에서 1초가 지나면 0시 0분 0초가 된다.)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {  
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException{ 
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(br.readLine());

		C+=D;
        
		while(C>=60){
            C-=60;
            B++;
            if(B>=60) {
                B-=60;
                A++;
                if(A>=24) {
                	A-=24;
                }
            }
		}
		
		bw.write(String.valueOf(A+" "+B+" "+C));
		bw.flush();
		bw.close();
	} 
}