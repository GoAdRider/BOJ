package bronze3._14489;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 치킨 두마리(...)

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine())*2;

        sum = sum >= c ? sum-c : sum;

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}