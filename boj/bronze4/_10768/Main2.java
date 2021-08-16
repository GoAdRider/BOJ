package boj.bronze4._10768;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if(A==2 && B ==18){
            sb.append("Special");
        }else if(A<2 || A==2 && B<18){
            sb.append("Before");
        }else{
            sb.append("After");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}