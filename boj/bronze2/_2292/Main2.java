package bronze2._2292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int N = Integer.parseInt(br.readLine());
        int count = 1; // 겹 수(최소 루트)
        int range = 2;	// 범위 (최솟값 기준) 

        if (N == 1) {
            System.out.print(1);
        }

        else {
            while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복 
                range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화 
                count++;	// count 1 증가 
            }
            System.out.print(count);
        }
    }
}
