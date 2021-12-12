package bronze3._11023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 더하기 3

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = st.countTokens();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
