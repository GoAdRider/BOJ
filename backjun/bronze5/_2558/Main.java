package _2558;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
	
	출력
	첫째 줄에 A+B를 출력한다.
	
	------------------------
		예제 입력 1 --
			1
			2
		예제 출력 1 --
			3
	------------------------
*/
public class Main {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String args[]) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int sum = Math.addExact(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
		bw.write( String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
