package bronze4._14264;

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
        double L = Double.parseDouble(br.readLine());
        
        sb.append(Math.sqrt(3)*L*L/4);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
