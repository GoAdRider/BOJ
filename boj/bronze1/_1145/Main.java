package bronze1._1145;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 적어도 대부분의 배수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] sA = br.readLine().split(" ");
        int intA[]= new int[5];
		
		for(int i=0;i<5;i++) {
			intA[i]=Integer.parseInt(sA[i]);
		}
		
		int cnt;
		int result=1;
        
        loop:
		while(true) {
            cnt=0;
            for(int i=0;i<5;i++) {
                cnt += result % intA[i] == 0 ? 1:0;
                if(cnt>=3) break loop;
            }
			result++;		
		}
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
