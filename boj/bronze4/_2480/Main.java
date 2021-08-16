package boj.bronze4._2480;

/*
문제
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  

예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
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
	public static void main(String[] args) throws IOException { 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(arr[0]==arr[1]&&arr[0]==arr[2]&&arr[1]==arr[2]) { //모든 주사위 눈금이 같을 때
			bw.write(String.valueOf(10000+(arr[0]*1000)));
		}else if(arr[0]==arr[1] ||arr[0]==arr[2]) { 						// 2개의 주사위 눈금이 같을 때 (arr[0] 으로 곱해주기 위한 조건)
			bw.write(String.valueOf(1000+(arr[0]*100)));
		}else if( arr[1]==arr[2]) { 														// 2개의 주사위 눈금이 같을 때 (arr[1] 으로 곱해주기 위한 조건)
			bw.write(String.valueOf(1000+(arr[1]*100)));
		}else {																						// 모든 주사위 눈금이 다를 때
			int max = arr[0];
			for(int i=0; i<3; i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			bw.write(String.valueOf(max*100));
		}
		bw.flush();
		bw.close();
	}
}
