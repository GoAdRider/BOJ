package bronze3._2501;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 약수 구하기
// N 의 약수중 K번째로 작은 수 구하기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            if(N%i == 0) K--;

            if(K == 0){
                System.out.println(i);
                break;
            }
        }

        if(K != 0)
            System.out.println(0);
    }
}
