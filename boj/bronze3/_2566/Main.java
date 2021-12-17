package bronze3._2566;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 최댓값

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        int max=0;
        int row=0;
        int col=0;
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                if(max < n){
                    max = n;
                    row = i;
                    col = j;
                }
            }
        }
        sb.append(max).append("\n").append(row).append(" ").append(col);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}