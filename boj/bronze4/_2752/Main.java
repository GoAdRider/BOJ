package _2752;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
문제
동규는 세수를 하다가 정렬이 하고싶어졌다.
숫자 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어 졌다.
숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.


입력
숫자 세 개가 주어진다. 이 숫자는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 숫자는 모두 다르다.


출력
제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
 */
public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException{ 
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[3];

		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		selectionSort(arr);
		
		for(int i : arr)
			sb.append(i).append(" "); // 올림차순
//			sb.insert(0, i); // 내림차순
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	
	public static void selectionSort(int[] arr) {
		int min=0;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				min = ( arr[j] < arr[min] ) ? 
						j : min;
			}
			int tmp = arr[i]; 
			arr[i] = arr[min]; 
			arr[min] = tmp; 
		}
	}
}
