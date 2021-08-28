package bronze3._2355;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        sb.append(gauss(a,b));
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static long gauss(long a, long b){
        long result;

        if(a>b){
            long temp=a;
            a=b;        
            b=temp;       
        }

        // (처음 수 + 끝 수) * (정수의 개수/2)      +   첫수와 끝수의 합이 짝수면 ? 중간 값 더해주기
        result = (a+b)*((b-a+1)/2) + ((a+b)%2==0?(a+b)/2:0);

        return result;
    }
}
