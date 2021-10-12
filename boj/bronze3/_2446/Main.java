package bronze3._2446;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        for(int i=0; i<size; i++){
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            int until = (2*size-1)-(2*i);
            for (int j = 0; j < until; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        size = size-1;
        for(int i=0; i<size; i++){
            int firstUntil = size-i;
            for (int j = 1; j < firstUntil; j++) {
                sb.append(" ");
            }
            int secondUntil = 3+2*i;
            for (int j = 0; j < secondUntil; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
