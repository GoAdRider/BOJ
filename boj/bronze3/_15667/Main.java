package bronze3._15667;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2018 연세대학교 프로그래밍

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine());
        int k=1;
        int result=1;
        while (result!=n) {
            result = 1+k+(k*k);
            if(result == n) break;
            k++;    
        }

        bw.write(String.valueOf(k));
        bw.flush();
        bw.close();
    }
}
