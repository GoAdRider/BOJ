package bronze4._14623;

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
        
        long B1 = Long.parseLong(br.readLine(), 2);
        long B2 = Long.parseLong(br.readLine(), 2);

        long B3 = B1 * B2;

        sb.append(Long.toBinaryString(B3));

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
