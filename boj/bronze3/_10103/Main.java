package bronze3._10103;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 주사위 게임

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine());
        int cy=100;
        int sd=100;
        for(int i=0;i<size;i++){
            st = new StringTokenizer(br.readLine());
            int cyDice = Integer.parseInt(st.nextToken());
            int sdDice = Integer.parseInt(st.nextToken());
            if (cyDice<sdDice) {
                cy -= sdDice;
            } else if(cyDice>sdDice) {
                sd -= cyDice;
            }
        }
        sb.append(cy).append("\n").append(sd);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}