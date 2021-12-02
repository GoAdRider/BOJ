package basic.mathmatics300._2601;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
// 유클리드 호제법(gcd)을 이용한 풀이
// 유클리드 호제법 풀이참고 : https://st-lab.tistory.com/154

/*
유클리드 호제법?

r = a,b의 나머지
GCD(a, b) = GCD(b, r)

GCD(581, 322)일 때 r(나머지) = 259이다. 즉, GCD(581, 322) = GCD(322, 259)이다.
그럼 다시 GCD(322, 259)를 보면 r=63이다. 그러면 GCD(322, 259) = GCD(259, 63)이다.
그 후 GCD(259, 63), GCD(63, 7)이다.

다시 GCD(63, 7)을 보면 r=0 이다. 그러면 GCD(63, 7) = GCD(7, 0)이다.

결과적으로 나머지가 없다는 것은 공통된 약수로 나누어 떨어진다는 의미이므로 7이 최대공약수가 된다. 쉽게 쓰면 이렇다.

GCD(581, 322) = GCD(322, 259) = GCD(259, 63) =  GCD(63, 7) = GCD(7, 0) = 7
*/

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
        
        int c = gcd(a, b);

        sb.append(c).append("\n").append(a * b / c);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
	}

	// 최대공약수
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
