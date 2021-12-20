package bronze3._10569;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 다면체

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            sb.append(2-v+e).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
