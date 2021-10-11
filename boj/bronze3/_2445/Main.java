package bronze3._2445;

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
        for(int i=1; i<=size; i++){
            for(int j=0; j<size; j++){
                sb.append(i>j ? "*":" ");
            }
            for(int j=0; j<size; j++){
                sb.append(j>size-i-1 ? "*":" ");
            }
            sb.append("\n");
        }

        for(int i=1; i<=size; i++){
            for(int j=0; j<size; j++){
                sb.append(j>size-i-1 ? " ":"*");
            }
            for(int j=0; j<size; j++){
                sb.append(i>j ? " ":"*");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
