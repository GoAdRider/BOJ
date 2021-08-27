package bronze3._1964;

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
        long n = Integer.parseInt(br.readLine());
        long x = 5;
        if(n>1){
            for(int i =1; i<n;i++){
                x+=(4+(3*i));
            }
        }
        System.out.println(x%45678);
    }
}
