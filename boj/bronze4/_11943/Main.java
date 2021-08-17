package boj.bronze4._11943;

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
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        int Atemp=Integer.parseInt(A[0])+Integer.parseInt(B[1]);
        int Btemp=Integer.parseInt(B[0])+Integer.parseInt(A[1]);

        sb.append(Atemp = Atemp>=Btemp ?
            Btemp:Atemp);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
