package bronze5._17256;

/*

예제 입력--
15 16 17
19 32 90

예제 출력--
2 2 75


예제 입력--
15 8 15
22 8 22

예제 출력--
7 1 7

 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	public static void main(String[] args) throws IOException { 
		String[] a = br.readLine().split(" ");
		String[] c = br.readLine().split(" ");
		
		//String 배열을 int 배열로 바꾸기
		//( 빈 int[] 만든 후 for 반복문으로 Integer.parseInt 로 바꿔서 돌리는게 cpu 용량도 덜 잡아먹고)
		//(가장 빨랐음 --------하지만 이 방법 제외 )
		
		//다른 방법1
		int[] A =  Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
		//다른 방법2
		int[] C =  Arrays.asList(c).stream().mapToInt(Integer::parseInt).toArray();
		
		
		bw.write(String.valueOf((C[0]-A[2])+" "+(C[1]/A[1])+" "+(C[2]-A[0])));
		bw.flush(); 
		bw.close();
	}
}
