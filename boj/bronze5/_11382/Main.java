package bronze5._11382;

/*

문제
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B+ C를 계산할 차례이다!

입력
첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^{12})이 공백을 사이에 두고 주어진다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
		private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        long sum=0;
	        
	        for (int i=0;i<3;i++) {
	        	BigInteger temp = new BigInteger(st.nextToken());
	        	sum+=temp.longValue();
	        }
	        
	        bw.write(String.valueOf(sum));
	        bw.flush();
	        bw.close();
	    }
}