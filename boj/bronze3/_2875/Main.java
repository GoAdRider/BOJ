package bronze3._2875;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken());
		int M =Integer.parseInt(st.nextToken());
		int K =Integer.parseInt(st.nextToken());

		while(K!=0) {
			if(N >= M*2) 
				N --;
			else 
				M --;

			K --;
		}
		int result = (N>=M*2) ? M : N/2;
		sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
	}
}