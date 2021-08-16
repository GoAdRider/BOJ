package boj.bronze4._5893;

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
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());

		A = A*P;

		if(C<P)
			B= B+(P-C)*D;

		A= A>=B ? B : A;

		sb.append(A);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}