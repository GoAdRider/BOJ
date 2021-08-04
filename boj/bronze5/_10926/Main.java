package _10926;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write(br.readLine()+"??!");
        bw.flush();
        bw.close();
	}
}
