package bronze3._10599;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 페르시아의 왕들

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st;
        String str = "";
        while (!(str=br.readLine()).equals("0 0 0 0")) {
            st = new StringTokenizer(str);
            int birthA = Integer.parseInt(st.nextToken());
            int birthB = Integer.parseInt(st.nextToken());
            int deathA = Integer.parseInt(st.nextToken());
            int deathB = Integer.parseInt(st.nextToken());
            sb.append(deathA-birthB).append(" ").append(deathB-birthA).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
