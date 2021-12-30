package bronze2._2864;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 5와 6의 차이

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken().replace('6', '5');
		String B = st.nextToken().replace('6', '5');
        sb.append(Integer.parseInt(A) + Integer.parseInt(B)).append(" ");
		A = A.replace('5', '6');
		B = B.replace('5', '6');
		sb.append(Integer.parseInt(A) + Integer.parseInt(B));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
