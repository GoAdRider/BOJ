package basic.datastructure203._10824;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 네 수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n1 = Long.valueOf(st.nextToken() + st.nextToken());
		long n2 = Long.valueOf(st.nextToken() + st.nextToken());

        bw.write(String.valueOf(n1+n2));
        bw.flush();
        bw.close();
    }
}